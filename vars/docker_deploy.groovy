def call(String microservice=null) {
    
    if ("${microservice}" == "publisher-manager"){
        sh 'docker container prune -f'
        sh 'docker compose kill'
        sh 'docker compose up -d publisher-manager'
    } else {
        sh 'exit 0'
    }
}