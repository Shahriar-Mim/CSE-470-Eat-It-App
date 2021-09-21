To whom it May Concern,
For some unknown reasons my project 'test'(java) for non-ui unit testing
was showing "Tests events were not received" error.
By looking into Google, I finally come to a solution that,
there's some project structure i.e. build version of Android Studio, JRE, JDK,
Gradle etc. versions are not compatible to run unit tests from the 'test'(java) directory
Please, for all the unit tests refer to the 'androidTest'(java) folder.

-Thank You.

Partial Reference : https://stackoverflow.com/questions/57795263/test-events-were-not-received-when-run-tests-using-intellij
