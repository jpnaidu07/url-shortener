# URLShortener using Java and Maven
### A „URLShortener Service” sample written in Java using Maven for the build, that showcases a few very simple tests.

This service demonstrates:

A simple Java 8 application with tests
Unit tests written with simple JUnit without any other/third party libraries


## Running the tests
To verify the functionality of URLShortener App please run "mvn test"

The unit test is configured with multiple run time arguments and can be passed with mvn test as shown below

* mvn test -Durl=www.google.com/maps
* mvn test -Durl=www.google.com/maps -DkeyLength=4 
* mvn test -Durl=www.google.com/maps -DkeyLength=5 -Ddomain=deloitte.us

#### -Durl for testing the particular url
#### -DkeyLength for random key length for short url
#### -Ddomain for short url domain

The default values will be taken as 
* url - https://www.google.com/maps/@13.1898846,78.7362839,15z (My current location Coordinates :wink:)
* keylength - 5
* domain - https://deloitte.tiny

Sample test results shown below

* mvn test
-------------------------------------------------------
Running com.interview.us.URLShortnerAppTest

URL::https://www.google.com/maps/@13.1898846,78.7362839,15z

Shortened URL:: https://deloitte.tiny/Ohjpm

-------------------------------------------------------

* mvn test -Durl=www.google.com/maps

-------------------------------------------------------
Running com.interview.us.URLShortnerAppTest

URL::www.google.com/maps

Shortened URL:: https://deloitte.tiny/8eBQO

-------------------------------------------------------

* mvn test -Durl=www.google.com/maps -DkeyLength=4 

-------------------------------------------------------
Running com.interview.us.URLShortnerAppTest

URL::www.google.com/maps

Shortened URL:: https://deloitte.tiny/RFP1

-------------------------------------------------------

* mvn test -Durl=www.google.com/maps -DkeyLength=5 -Ddomain=deloitte.us

-------------------------------------------------------

Running com.interview.us.URLShortnerAppTest

URL::www.google.com/maps

Shortened URL:: deloitte.us/AJE7e






