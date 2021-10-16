pipeline {
    agent any
    tools {
        maven 'Maven 3.8.2'
    }
    stages {
        stage('Checkout Source Code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'DineshK', url: 'https://github.com/DineshKumaran91/05_Class_PipeSlave.git']]])
            }
        }
        stage('Execute shell') {
            steps {
                sh '''echo "This is my job"
                echo $JOB_NAME'''
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}