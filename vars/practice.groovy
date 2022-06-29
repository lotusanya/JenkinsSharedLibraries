def call (String Goal){
if ("${Goal}" == "build"){
sh "mvn package"
}
elif ("${Goal}" == "test"){
sh "mvn sonar:sonar"
}
elif ("${Goal}" == "backup"){
sh "mvn deploy"
}
}
