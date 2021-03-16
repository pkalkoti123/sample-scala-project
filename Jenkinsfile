#!groovy

pipeline {
  agent {
      label 'my-defined-label'
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
