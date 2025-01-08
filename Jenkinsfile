pipeline {
    agent any
    tools {
        maven 'maven' // Ensure this matches the Maven version installed on Jenkins
    }

    stages {
        stage('Code') {
            steps {
                 git 'https://github.com/NarendraReddyyy/SpringBoot-Static-pages.git'
            }
        }
        stage('Build') {
            steps {
                configFileProvider([configFile(fileId: 'Build_Settings', targetLocation: '/var/lib/jenkins/.m2/settings.xml')]) {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Build Image') {
            steps {
                echo 'Building Docker image...'
               // sh "docker build -t springapp1:v1 -f /var/lib/jenkins/workspace/SpringBoot/Dockerfile /var/lib/jenkins/workspace/SpringBoot/"

               sh "docker build -t yannamreddy/springapp ."
            }
        }
        stage('Push Image To Docker Hub') {
            steps {
               
                sh "docker login -u yannamreddy -p Nari@1998"
             
                sh "docker push yannamreddy/springapp"
            }
        }
       stage("Container") {
            steps {
                sh 'docker run -d --name cont1 -p 8082:8082 yannamreddy/springapp'
 }
 }
    }
}


 
