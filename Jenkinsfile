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
                // Run your automation scripts
                bat 'mvn clean test'
            }
        }
    }
    post {
        success {
            // Mark the commit as successful
            githubNotify context: 'CI/CD', status: 'SUCCESS', description: 'Build Passed'
        }
        failure {
            // Mark the commit as failed
            githubNotify context: 'CI/CD', status: 'FAILURE', description: 'Build Failed'
            // Optionally, fail the pipeline explicitly
            error("Build failed, stopping further merge/commit")
        }
    }
}
