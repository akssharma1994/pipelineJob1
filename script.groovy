def buildApp(){
    echo "This is building the version ${params.VERSION}"
}
def testApp(){
    echo "Testing the application version ${params.exectueTests}"
}
def deployAPP(){
    echo "Deploying the version ${param.VERSION}" 
}
return this