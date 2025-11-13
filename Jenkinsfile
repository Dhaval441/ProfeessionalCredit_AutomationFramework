pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                withMaven(maven: 'Maven-3.9.11') {
                    bat 'mvn clean test'
                }
            }
        }
    }
    post {
        success {
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'SUCCESS', description: 'Build passed'
        }
        failure {
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'FAILURE', description: 'Build failed'
        }
        always {
            githubNotify context: 'ProfeessionalCredit_AutomationFramework', status: 'PENDING', description: 'Build running'
        }
    }
}
