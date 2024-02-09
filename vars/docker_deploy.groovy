def call(String microservice=null) {
    
    if ("${microservice}" == "publisher-manager"){
        sh 'docker container prune -f'
        sh 'docker compose down'
        sh 'docker rm mysql'
        sh 'docker compose up -d publisher-manager'
    } else {
        sh 'exit 0'
    }
}