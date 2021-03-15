#!groovy

pipeline {
  agent { label 'java8' }

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