pipeline {
    agent any
    tools {
        maven 'Maven-3.9.11'
    }
    stages {
        stage('Build & Run Tests') {
            steps {
                bat "mvn clean test -DsuiteXmlFile=testng.xml"
            }
        }
    }
}
