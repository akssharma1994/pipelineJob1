pipeline{
    agent any
    environment {
        NEW_VERSION = '1.3.0'
        BRANCH_NAME = 'main'
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
                echo "this is version $NEW_VERSION"
            }
        }
        stage("test"){
            when {

                expression {
                    $BRANCH_NAME == 'main'
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