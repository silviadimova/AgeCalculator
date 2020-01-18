# AgeCalculator
Android project with Cucumber runner and BDD style written Intrumentation tests.

### To run all Cucumber tests execute :
./gradlew connectedCheck -Pcucumber -Ptags="@smoke, @ui, @acceptance"

If you want to run only smoke tests execute : 
./gradlew connectedCheck -Pcucumber -Ptags="@smoke"

### To run individual feature test by scenario name execute :
./gradlew connectedCheck -Pcucumber -Pscenario="Your scenario name here"


Test report is located in -> https://github.com/silviadimova/AgeCalculator/blob/master/TEST_RESULTS/connected/Test%20results%20-%20Class%20Home%20Screen.pdf
