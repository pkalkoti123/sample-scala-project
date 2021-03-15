#!groovy

library 'PS-jenkins-shared-lib'

pipeline {
  agent {
  }

  stages {
    stage('Build') {
      steps {
        sh "sbt compile"
      }
    }

    stage('Unit tests') {
      steps {
        sh "sbt test"
      }
    }

    stage('Docker image') {
      steps {
        sh "sbt dockerBuildAndPush"
      }
    }

  }

}