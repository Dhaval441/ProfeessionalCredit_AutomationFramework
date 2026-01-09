package utilities;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.*;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RWExcel {

    public static Logger log = LogManager.getLogger(RWExcel.class);

    private static final String EXCEL_PATH = "datapool/TestData.xlsx";

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;

    /* ===============================
       Load workbook once (static)
       =============================== */
    static {
        try {
            InputStream is = RWExcel.class
                    .getClassLoader()
                    .getResourceAsStream(EXCEL_PATH);

            if (is == null) {
                throw new RuntimeException(
                        "Excel file not found in classpath: " + EXCEL_PATH);
            }

            workbook = new XSSFWorkbook(is);
            log.info("Excel loaded successfully from classpath");

        } catch (Exception e) {
            log.error("Failed to load Excel file", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    /* ===============================
       Get Sheet
       =============================== */
    private void loadSheet(String sheetName) {
        sheetName = sheetName.trim();
        sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new RuntimeException("Sheet not found: " + sheetName);
        }
    }

    /* ===============================
       Row Count
       =============================== */
    public int countRows(String sheetName) {
        loadSheet(sheetName);
        return sheet.getLastRowNum();
    }

    /* ===============================
       Column Count
       =============================== */
    public int countCol(String sheetName) {
        loadSheet(sheetName);
        row = sheet.getRow(0);
        return row == null ? 0 : row.getLastCellNum();
    }

    /* ===============================
       Read Cell (Row 1)
       =============================== */
    public String readCell(String sheetName, String colName) {
        loadSheet(sheetName);
        int cc = countCol(sheetName);

        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);

        if (headerRow == null || dataRow == null) return "";

        for (int i = 0; i < cc; i++) {
            if (colName.equalsIgnoreCase(headerRow.getCell(i).getStringCellValue())) {
                return getCellValueAsString(dataRow.getCell(i));
            }
        }
        return "";
    }

    /* ===============================
       Read Column Values
       =============================== */
    public ArrayList<String> readColValues(String sheetName, String colName) {
        loadSheet(sheetName);
        int cc = countCol(sheetName);
        int rc = countRows(sheetName);

        ArrayList<String> values = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        for (int i = 0; i < cc; i++) {
            if (colName.equalsIgnoreCase(headerRow.getCell(i).getStringCellValue())) {
                for (int j = 1; j <= rc; j++) {
                    Row dataRow = sheet.getRow(j);
                    values.add(getCellValueAsString(dataRow.getCell(i)));
                }
                break;
            }
        }
        log.debug("Total values in column {} : {}", colName, values.size());
        return values;
    }

    /* ===============================
       Read Row Data (Row 1)
       =============================== */
    public Multimap<String, String> readRowData(String sheetName) {
        loadSheet(sheetName);
        Multimap<String, String> dataSet = LinkedListMultimap.create();

        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);

        int cc = countCol(sheetName);

        for (int i = 0; i < cc; i++) {
            String key = getCellValueAsString(headerRow.getCell(i));
            String value = getCellValueAsString(dataRow.getCell(i));
            dataSet.put(key, value);
        }
        return dataSet;
    }

    /* ===============================
       Read Data For Specific Row
       =============================== */
    public String readDataForRow(String sheetName, String colName, int rowNum) {
        loadSheet(sheetName);

        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(rowNum);
        int cc = countCol(sheetName);

        for (int i = 0; i < cc; i++) {
            if (colName.equalsIgnoreCase(headerRow.getCell(i).getStringCellValue())) {
                return getCellValueAsString(dataRow.getCell(i));
            }
        }
        return "";
    }

    /* ===============================
       Test Data Count
       =============================== */
    public int getTestDataCount(String sheetName) {
        loadSheet(sheetName);
        return sheet.getLastRowNum();
    }

    /* ===============================
       Cell Value Formatter
       =============================== */
    private String getCellValueAsString(Cell cell) {
        if (cell == null) return "";

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case NUMERIC:
                return NumberToTextConverter.toText(cell.getNumericCellValue());
            case FORMULA:
                try {
                    return cell.getStringCellValue();
                } catch (Exception e) {
                    return NumberToTextConverter.toText(cell.getNumericCellValue());
                }
            default:
                return "";
        }
    }
}

