# AgeCalculator
Android project with Cucumber runner and BDD style written Intrumentation tests.

### To run all Cucumber tests execute :
./gradlew connectedCheck -Pcucumber -Ptags="@smoke, @ui, @acceptance"

If you want to run only smoke tests execute : 
./gradlew connectedCheck -Pcucumber -Ptags="@smoke"

### To run individual feature test by scenario name execute :
./gradlew connectedCheck -Pcucumber -Pscenario="Your scenario name here"
