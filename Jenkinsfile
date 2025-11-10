pipeline {
    agent any

    triggers {
        githubPush()     // ✅ Trigger build on every push/commit
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm   // ✅ No confusion, uses Jenkins job SCM settings
            }
        }

        stage('Build Project') {
            steps {
               bat 'mvn clean install'

            }
        }

        stage('Run Automation Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Finish') {
            steps {
                echo '✅ Automation Execution Completed Successfully'
            }
        }
    }
}
