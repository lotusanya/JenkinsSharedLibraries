def call (String mavengoal){
		if ("${mavengoal}" == "Build"){
	sh "mvn package"
	}
	else if ("${mavengoal}" == "Automated Testing"){
	sh "mvn sonar:sonar" 
	}
}
