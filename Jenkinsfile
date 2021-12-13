pipeline{
    agent any
    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CRED = credentials('tomcat-server-credentials')
    }
    stages{

        stage("github code"){
            steps {
                git branch: 'main', url: 'https://github.com/akssharma1994/pipelineJob1.git'
            }
        }
        stage("build"){
            steps{
                echo "this is build stage"
                echo "this is building $NEW_VERSION"
            }
        }
        stage("test"){
            steps{
                echo "this is test"
            }
        }
        stage("deploy"){
            steps{
                echo "this is deploy"
                sh ('curl -u $SERVER_CRED_USR:$SERVER_CRED_PSW')
            }     
        }
    }
}