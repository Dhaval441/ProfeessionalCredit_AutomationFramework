pipeline {
    agent any
    
    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'dev_branch',
                    url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run Automation Tests') {
            steps {
                sh 'mvn clean test'
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