pipeline {
    agent any

    tools {
        maven 'Maven-3.9.11'   // 👈 Use the name you configured in Global Tool Configuration
    }

    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        failure {
            githubNotify context: 'Build', status: 'FAILURE', description: 'Build failed — stopping push'
            error("Build failed, stopping the pipeline.")
        }
        success {
            githubNotify context: 'Build', status: 'SUCCESS', description: 'Build passed successfully'
        }
    }
}
