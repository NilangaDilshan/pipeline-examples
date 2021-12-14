pipeline {
  agents any
  stages {
    stage('build') {
      steps {
        echo 'Build stage'
      }
    }
    stage('test') {
      steps {
        echo 'Test stage'
      }
    }
    stage('deploy') {
      steps {
        echo 'Deployment stage'
      }
    }
  }
}
