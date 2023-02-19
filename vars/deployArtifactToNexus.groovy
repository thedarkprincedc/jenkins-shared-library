def call(Map config){
    node {
        sh "zip -r ${config.filename} ${config.source}"
    }
}