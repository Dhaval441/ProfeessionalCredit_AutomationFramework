pipeline {
    agent any

    stages {
        stage('Build Project') {
            steps {
                bat 'cmd.exe /c mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'cmd.exe /c mvn test'
            }
        }
    }
}
