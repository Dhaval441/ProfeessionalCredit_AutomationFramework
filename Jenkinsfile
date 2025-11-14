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
                bat 'mvn clean test'  // Make sure cmd.exe is in PATH
            }
        }
    }
    post {
        success {
            githubNotify(
                status: 'SUCCESS',
                description: 'Build successful',
                repo: 'Dhaval441/ProfeessionalCredit_AutomationFramework',
                credentialsId: '5043bc42-7991-4f06-840a-96fb490e3931',
                sha: "${env.GIT_COMMIT}",
                account: 'Dhaval441'
            )
        }
        failure {
            githubNotify(
                status: 'FAILURE',
                description: 'Build failed',
                repo: 'Dhaval441/ProfeessionalCredit_AutomationFramework',
                credentialsId: '5043bc42-7991-4f06-840a-96fb490e3931',
                sha: "${env.GIT_COMMIT}",
                account: 'Dhaval441'
            )
        }
    }
}
