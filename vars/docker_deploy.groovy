def call(String microservice=null) {
    
    if ("${microservice}" == "publisher-manager"){
        sh 'docker container prune -f'
        sh 'docker compose down'
        sh 'docker compose up -d'
    } else {
        sh 'exit 0'
    }
}