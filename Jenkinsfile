pipeline {
    agent any
    tools {
        maven "Maven 3.3.9"
    }
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
        stage("Final steps"){
            steps{
                echo "neue Änderung in Jenkinsfile"
            }
        }
    }
}