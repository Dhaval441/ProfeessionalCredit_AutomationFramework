pipeline {
    agent any
    stages {
        stage('Run Automation Tests') {
            steps {
                bat 'mvn clean test' // Or your bat command
            }
        }
    }
    post {
        success {
            echo 'Tests passed. Proceeding with deployment.'
            // Call deployment stage/script here
        }
        failure {
            echo 'Tests failed. Stopping deployment.'
            error('Stopping deployment due to failed tests')
        }
    }
}
