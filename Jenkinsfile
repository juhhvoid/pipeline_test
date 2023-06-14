pipeline {
    agent any
    stages {
        stage('Build Image') {
            steps {
                script {
                    dockerapp = docker.build("leonardo/api-test", '-f ./src/Dockerfile ./src')
                }
            }
        }
        stage('Test') {
            steps {
                echo 'I am inside Test step'
            }
        }
        stage('Release') {
            steps {
                echo 'I am inside Release step'
            }
        }
    }
}
