# AgeCalculator
Android project with Cucumber runner and BDD style written Intrumentation tests.

To run all Cucumber tests execute :
./gradlew connectedCheck -Pcucumber -Ptags="@smoke, @"

also run ./gradlew connectedCheck -Pcucumber -Ptags="@smoke" to run all smoke BDD tests

To run individual feature test execute :
./gradlew connectedCheck -Pcucumber -Pscenario="Successful login"
