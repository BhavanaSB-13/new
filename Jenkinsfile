pipeline {
    agent any  

    // environment {
    //     MAVEN_HOME = '/opt/maven'  // Set your Maven installation path (adjust as needed)
    //     JAVA_HOME = '/usr/lib/jvm/java-11-openjdk'  // Set your JDK installation path (adjust as needed)
    //     // You can also define other environment variables here as needed
    // }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/your-repository.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build the project using Maven (compile, package, install dependencies)
                    echo 'Building the project using Maven...'
                    sh "'${MAVEN_HOME}/bin/mvn' clean install -DskipTests"  // Skips tests in the build stage
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run unit tests using Maven
                    echo 'Running unit tests...'
                    sh "'${MAVEN_HOME}/bin/mvn' test"
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                   
                    echo 'Deploying the application...'
                    
                }
            }
        }
    }

    post {
        always {
            // Cleanup or notifications after pipeline execution
            echo 'Pipeline finished. Cleaning up or sending notifications.'
        }
        success {
            // Send success notifications, e.g., to Slack or email
            echo 'Build and deploy were successful!'
        }
        failure {
            // Send failure notifications (optional)
            echo 'Pipeline failed. Sending failure notifications.'
        }
    }
}

