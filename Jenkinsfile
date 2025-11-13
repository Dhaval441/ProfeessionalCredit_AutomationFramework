pipeline {
    agent any

    tools {
        // Make sure this JDK name matches exactly with Jenkins Global Tool Configuration
        jdk 'jdk-21'
        maven 'Maven-3.9.11'
    }

    environment {
        GIT_CREDENTIALS = '5043bc42-7991-4f06-840a-96fb490e3931'
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout([$class: 'GitSCM',
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/Dhaval441/ProfeessionalCredit_AutomationFramework.git',
                        credentialsId: "${GIT_CREDENTIALS}"
                    ]]
                ])
            }
        }

        stage('Build and Test') {
            steps {
                echo "Running Maven clean test..."
                bat '"C:\\Program Files\\Maven\\apache-maven-3.9.11\\bin\\mvn.cmd" clean test'
            }
        }
    }

    post {
        success {
            echo "Build Success!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework',
                          status: 'SUCCESS',
                          description: 'Build passed successfully'
        }
        failure {
            echo "Build Failed!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework',
                          status: 'FAILURE',
                          description: 'Build failed'
        }
        unstable {
            echo "Build Unstable!"
            githubNotify context: 'ProfeessionalCredit_AutomationFramework',
                          status: 'PENDING',
                          description: 'Build is unstable'
        }
    }
}
