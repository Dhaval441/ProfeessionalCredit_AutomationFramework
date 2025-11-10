pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Finalising') {
            steps {
                echo 'Automation suite execution finished.'
            }
        }
    }
}
