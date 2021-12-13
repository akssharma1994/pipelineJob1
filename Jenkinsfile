pipeline{
    agent any
    echo "$BRANCH_NAME"
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
                echo "$BUILD_NUMBER"
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
            when {
            expression {
                env.BRANCH_NAME = 'main'
            }
        }
            steps{
                echo "this is deploy"
            }     
        }
    }
}