pipeline {
    agent any

    tools {
        maven 'MAVEN_3.9.11'
        jdk 'JDK21'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework.git',
            }
        }  
   stage('Build & Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo "Build finished — logs and reports processed."
        }
        failure {
            echo "❌ Tests failed."
        }
        success {
            echo "✅ Automation Suite Passed Successfully."
        }
    }
}