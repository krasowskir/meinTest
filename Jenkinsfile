pipeline {
    agent any
    stages {
        stage("Checkout"){
            steps {
                git url: "https://github.com/krasowskir/meinTest.git"
            }
        }
        stage("Compile"){
            steps {
                sh "mvn clean compile"
            }
        }
        stage("Unit test"){
            steps{
                sh "mvn test install"
            }
        }
    }
}