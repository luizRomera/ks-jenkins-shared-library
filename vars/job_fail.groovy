def failure() {
    error("Build failed. Check the logs for moreinformation.")
    error("Cleaning the environment")
    sh 'rm -rf ~/.m2'
    sh 'rm -rf *'

    // mais exemplos:
    // https://www.jenkins.io/doc/pipeline/tour/post/
}