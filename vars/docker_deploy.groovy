def call(String microservice=null) {
    
    if ("${microservice}" == "publisher-manager"){
        sh 'docker compose down'
        sh 'docker compose up -d || true'
    } else {
        sh 'exit 0'
    }
}