pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    // your test commands here
                    bat 'mvn clean test'  // or 'sh' for Linux
                }
            }
        }
    }

    post {
        success {
            githubNotify context: 'CI/tests', status: 'SUCCESS', description: 'All tests passed'
        }
        failure {
            githubNotify context: 'CI/tests', status: 'FAILURE', description: 'Tests failed'
        }
    }
}
