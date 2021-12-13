pipeline{
    agent any
    parameters {
        string (name: 'VERSION' , defaultValue : '' , description : '')
        booleanParam (name: 'executeTest' , defaultValue : true , description : '' )
    }
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
                echo "Building the version ${param.VERSION}"
                echo "this is building $NEW_VERSION"
            }
        }
        stage("test"){
            when{
                expression {
                    param.executeTest == true
                }
            }
            steps{
                echo "this is test"
            }
        }
        stage("deploy"){
            steps{
                echo "this is deploy"
            }     
        }
    }
}