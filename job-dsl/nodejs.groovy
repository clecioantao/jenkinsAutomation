job('NodeJS example') {
    scm {
        git('https://github.com/wardviaene/docker-demo') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('user name')
            node / gitConfigEmail('Your password')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}

