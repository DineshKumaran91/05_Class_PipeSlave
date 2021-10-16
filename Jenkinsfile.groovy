pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'DineshK', url: 'https://github.com/DineshKumaran91/5_Class_PipeSlave/tree/master/simple-java-maven-app']]])
            }
        }

    }
}