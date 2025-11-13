pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        failure {
            bat '''
                git config user.name "Jenkins CI"
                git config user.email "jenkins@example.com"
                REM Get the latest commit hash
                for /f %%i in ('git rev-parse HEAD') do set LAST_COMMIT=%%i
                REM Revert the last commit
                git revert --no-edit %LAST_COMMIT%
                REM Push the revert to remote
                git push origin HEAD:master
            '''
        }
    }
}
