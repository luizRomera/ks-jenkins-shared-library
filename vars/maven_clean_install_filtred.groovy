def call(String microservice=null) {

    if ("${microservice}" == "hello-world") {


        sh 'mvn clean install -U'

    } else if ("${microservice}" == "package-publisher") {
        
        sh 'mvn clean install'

    }
    else {

        sh 'mvn clean install'

    }
}