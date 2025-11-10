pipeline {
    agent any
    
    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework'
            }
        }

        stage('Install Dependencies') {
            steps {
               bat 'mvn clean install'

            }
        }

        stage('Run Automation Tests') {
            steps {
           bat 'mvn test'

            }
        }

        stage('Publish Reports') {
            steps {
                publishHTML(target: [
                    reportName: 'Test Execution Report',
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html'
                ])
            }
        }
    }
}