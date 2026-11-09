node {

    // Checkout GitHub Repository
    stage('Checkout') {
        echo 'Downloading Java Application'

        checkout scm
    }

    // BUILD STAGE
    stage('Build') {

        echo 'Starting Build Stage'

        sh '''
            mkdir -p build
            javac -d build src/Main.java src/AppTest.java

            jar --create \
                --file build/application.jar \
                -C build Main.class
        '''

        echo 'BUILD SUCCESSFUL'
    }

    // TEST STAGE
    stage('Test') {

        echo 'Starting Test Stage'

        sh '''
            java -cp build AppTest
        '''

        echo 'TEST SUCCESSFUL'
    }

    // DEPLOY STAGE
    stage('Deploy') {

        echo 'Starting Deploy Stage'

        sh '''
            mkdir -p deploy
            cp build/application.jar deploy/
            ls -l deploy/
        '''

        echo 'DEPLOY SUCCESSFUL'
    }

}
