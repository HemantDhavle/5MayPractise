pipeline 
{
    agent any
    
    tools{
    	maven 'maven'
        }

    stages 
    {
        stage('Regression Automation Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/HemantDhavle/5MayPractise.git'
                    bat "mvn clean install"
                }
            }
       
}
    }
    }