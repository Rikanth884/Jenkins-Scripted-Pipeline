node {

    stage('Build') {

        echo 'Starting Build Stage'

        sh '''
            mkdir -p build
            javac -d build src/Main.java src/AppTest.java
            jar --create --file build/application.jar -C build Main.class
        '''

        echo 'Build Completed Successfully'
    }

    stage('Test') {

        echo 'Starting Test Stage'

        sh '''
            java -cp build AppTest
        '''

        echo 'Testing Completed Successfully'
    }

    stage('Deploy') {

        echo 'Starting Deploy Stage'

        sh '''
            mkdir -p deploy
            cp build/application.jar deploy/
            echo "Application Deployed Successfully"
        '''

        echo 'Deploy Completed Successfully'
    }
}
