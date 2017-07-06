

# All things Jenkins

## Owner: Deepanshu Lulla

This file contains all jenkisn related work I have done in one place. The repo is merely a collection and not in a project by itself

although it could be used as one with discretion.

## Things it contains

-- Ansible files for Jenkins installtion

-- Jenkinsfile for various pipeline configurations and integrations

-- Docker file for Jenkins (which also has docker installed inside it  ;) ) 

-- Jenkins job dsl written in groovy to create freestyle projects in Jenkins. Plan to add job dsl for creating pipelines as well.


## List of  Jenkins files for configuring the pipelines
 
--- for creating a NODEjs multistage Jenkins pipeline with stages such as envrionement setup, tests and finally push to docker hub

--- Nodejs multistage pipeline for running tests inside container

--- Testing Email Integration for continuous feedback

--- Testing Slack Integration and opspager for continuous monitoring

--- Testing github integration using Gradle and Java Spring on Docker. Gradle is running on docker container and tests are run within container.

--- Testing Artifactory integration with jenkins for java-spring app with gradle but here gradle is installed locally. The final artifact i.e war file will be pushed to jfrog artifactory.




