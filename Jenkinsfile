CODE_CHANGES = getGitChanges()
pipeline{
    agent any
    stages{

        stage("github code"){
            steps {
                git branch: 'main', url: 'https://github.com/akssharma1994/pipelineJob1.git'
            }
        }
        stage("build"){
            when {
                expression {
                    CODE_CHANGES == true
                }
            }
            steps{
                echo "this is build stage"
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
            }     
        }
    }
}