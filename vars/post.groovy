def call(String microservice=null, String host=null) {
    
    if("${microservice}" == "publisher-manager"){
        echo "Build successful! Artifact generated and published."
        echo "Aplication running and avaliable on: http://${host}:8080/publisher"
    } else {
        echo 'Build successful! Artifact generated and published.'
    }

}