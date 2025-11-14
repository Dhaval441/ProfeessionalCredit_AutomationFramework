pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        failure {
            githubNotify(
                status: 'FAILURE',
                repo: 'Dhaval441/ProfeessionalCredit_AutomationFramework',
                credentialsId: '5043bc42-7991-4f06-840a-96fb490e3931',
                sha: "${env.GIT_COMMIT}"
            )
        }
    }
}
