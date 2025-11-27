pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Run Automation Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        failure {
            echo "Tests failed. Stopping deployment."
            error "Stopping deployment due to failed tests"
        }
    }
}
