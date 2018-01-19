pipeline {
    agent any

    triggers {
        pollSCM('* * * * *')
    }
    tools {
        maven 'maven'
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
                /*withMaven(maven: 'maven') {
                    sh "mvn clean compile"
                }*/
            }


        }
        stage("Unit test"){
            steps {
                sh "mvn test install"
                /*withMaven(maven: 'maven') {
                    sh "mvn test install"
                }*/
            }

        }
        stage("Final steps"){
            steps{
                echo "neue Änderung in Jenkinsfile"
            }
        }
    }
}
