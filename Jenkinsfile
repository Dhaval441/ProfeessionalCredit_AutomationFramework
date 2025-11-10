pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework'
                    ]],
                    extensions: [
                        [$class: 'CloneOption', timeout: 30, shallow: true, depth: 1]
                    ]
                ])
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
