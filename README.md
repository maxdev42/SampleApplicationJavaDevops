Lancer SonarQube en local : C:\sonarqube\sonarqube-9.0.0.45539\sonarqube-9.0.0.45539\bin\windows-x86-64>StartSonar.bat

Token SonarQube du projet : af1b41c5449338d3b7aa578a656ee11d52c854dd

Lancement du scan SonarQube avec analyse du test coverage par Jacoco : mvn clean install sonar:sonar -Dsonar.projectKey=ExampleMaven -Dsonar.host.url=http://localhost:9000 -Dsonar.login=af1b41c5449338d3b7aa578a656ee11d52c854dd
