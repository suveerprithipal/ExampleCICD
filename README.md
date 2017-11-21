#  Project PineApple --  
###Sample Java Spring Application
We will use this for hosting our System Under Test.

#####Included in this application:

* Simple Java Application that demonstrates
a little 'business logic', the meat of the operation.

We will use a few testing techniques to generate test coverage.

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
Mocking my wy through and building with quliaty in mind.
Give it try.


#####  The hit list. >>>
- rest endpoints for LockSmith data.
- some logic or business logic.
- tests. more tests. unit and integration tests.
- step by step tdd:- im wondering how to best bring that across in code.
- perhaps a bootstrap web frontend to trigger some event.
- postgres.
- JPA + POJO
- CI/CD on this project
