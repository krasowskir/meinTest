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
                withMaven(maven: 'maven') {
                    sh "mvn clean compile"
                }
            }


        }
        stage("Unit test"){
            steps {
                withMaven(maven: 'maven') {
                    sh "mvn test install"
                }
            }

        }
        stage("Final steps"){
            steps{
                echo "neue Änderung in Jenkinsfile"
            }
        }
    }
}