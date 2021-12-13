def buildApp(){
    echo "This is building the version ${params.VERSION}"
}
def testApp(){
    echo "Testing the application version ${params.executeTests}"
}
def deployApp(){
    echo "Deploying the version ${params.VERSION}" 
}
return this