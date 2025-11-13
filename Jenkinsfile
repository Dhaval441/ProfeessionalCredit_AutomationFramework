pipeline {
    agent any

    tools {
        maven 'Maven-3.9.11'   // Make sure this matches the Maven installation name in Jenkins
        jdk 'Java-21'          // Make sure this matches the JDK installation in Jenkins
    }

    environment {
        PATH = "${tool 'Maven-3.9.11'}/bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Run Maven clean and test
                    bat 'mvn clean test'
                }
            }
        }
    }

    post {
        success {
            echo "Build Success!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'SUCCESS'
        }
        failure {
            echo "Build Failed!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'FAILURE'
        }
        unstable {
            echo "Build Unstable!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'PENDING'
        }
    }
}
