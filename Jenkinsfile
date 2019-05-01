pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_6_1') {
                    sh 'mvn clean install'
                }
            }
        } 
     stage ('build docker Stage') {

            sh 'docker build kbujjimca/docker1-spring-boot .'
        }       
    }
}