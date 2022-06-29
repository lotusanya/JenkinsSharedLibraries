def call (String Goal){
if ("${Goal}" == "clean"){
sh "mvn clean"
}
elif ("${Goal}" == "build"){
sh "mvn package"
}
elif ("${Goal}" == "test"){
sh "mvn sonar:sonar"
}
elif ("${Goal}" == "backup"){
sh "mvn deploy"
}
}
