pipeline{
    agent any
    environment {
        NEW_VERSION = '1.3.0'
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
                    env.BRANCH_NAME == '*'
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