docker build -t docker-jenkins .
docker run -p 8080:8080 -p 50000:50000 -v /var/jenkins_home:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock --name jenkins -d jenkins-docker
# this will launch the jenkins page on the port 8080; after this you can proceed with your jenkins configuration
