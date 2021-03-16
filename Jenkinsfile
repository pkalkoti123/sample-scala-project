#!groovy

pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      label 'my-defined-label'
      args  '-v /tmp:/tmp'
    }
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