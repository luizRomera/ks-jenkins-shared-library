def call() {
    
    sh 'docker compose down -v'
    sh 'docker compose up -d'

}