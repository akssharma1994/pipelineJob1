def gv
pipeline{
    agent any
    parameters {
        choice (name: 'VERSION' choices: ['1.0.0', '1.0.2', '1.0.3'], description: '')
        booleanParam (name: 'executeTests' , defaultValue : false , description : '' )
    }
    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CRED = credentials('tomcat-server-credentials')
    }
    stages{
        stage("init")
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        stage("build"){
            steps{
                script {
                    gv.builapp()
                }
            }
        }
            
        stage("test"){
            when{
                expression {
                    params.executeTests == true
                }
            }
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage("deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }     
        }
    }
}