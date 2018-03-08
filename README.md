#  Project PineApple --  
###A narrative to a Java Spring Application
We will use this for hosting our System Under Test.

#####Included in this application:

* Simple Java Application that demonstrates
a little 'business logic', the meat of the operation.

We will use a few testing techniques to generate test coverage.

##### Why TDD? why unit test?:-
TDD and unit tests give us great confidence that our core business logic is
well protected and functional.<br><br>
TDD in particular ensure that we build quality into our application at the lowest level possible.
<br> By definition, a unit test is a small test. A fast responding test vs its larger integration and functional sigblings.  
<br>We want a faster response when we include quality checks in our build/deploy lifecycle.

##### Testing:-
Using JUnit we will test: 
* Unit Test -<b> Maven Surefire. </b>
* Integration Test -<b> Maven Failsafe. </b>

#####Maven
This is a maven springboot application.
Using terminal,
###### Unit tests - 
Run mvn clean test - this will execute unit tests 
###### Unit and Integration tests - 
run mvn clean verify - this will execute both unit and integration tests.
###### Integration tests only - 
run mvn verify -Dskip.surefire.tests

#####TDD
Using mockito, Junit and hamcrest.
I built these simple methods using TDD.
Mocking my way through and building with quliaty in mind.
<b>Give it try.</b>
