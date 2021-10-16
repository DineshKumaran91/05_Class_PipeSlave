pipeline {
    agent any
    stages {
        stage('Checkout Source Code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'DineshK', url: 'https://github.com/DineshKumaran91/05_Class_PipeSlave.git']]])
            }
        }
    }
}