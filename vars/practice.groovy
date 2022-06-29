def call (String Goal){
if ("${Goal}" == "build"){
sh "mvn package"
}
else if ("${Goal}" == "test"){
sh "mvn sonar:sonar"
}
else if ("${Goal}" == "backup"){
sh "mvn deploy"
}
}
