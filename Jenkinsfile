pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],         // change if using master/dev
                    userRemoteConfigs: [[
                        url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework.git'
                    ]]
                ])
            }
        }

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
                echo 'Automation suite execution finished for Professional Credit Framework.'
            }
        }
    }
}
