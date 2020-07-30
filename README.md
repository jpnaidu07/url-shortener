# URLShortener using Java and Maven
### A URLShortener App written in Java using Maven for the build, that showcases a few very simple tests.

This App demonstrates:

A simple Java 8 application with tests
Unit tests written with simple JUnit without any other/third party libraries

Simple UML diagram is shown below(Note: Made using draw.io)

![Simple UML](https://github.com/jpnaidu07/deloitte-url-shortener/blob/master/urlshortenerUML.png)


## Running the App and tests
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

::::::::::Create Short URL for given URL:::::::::::::::::

URL::https://www.google.com/maps/@13.1898846,78.7362839,15z

Shortened URL:: https://deloitte.tiny/wUvoa

::::::::::Fetching the redirect URL for stored short URL::::::::::

Shortened URL::https://deloitte.tiny/wUvoa

Redirect URL:: www.google.com/maps/@13.1898846,78.7362839,15z

-------------------------------------------------------

* mvn test -Durl=www.google.com/maps

-------------------------------------------------------

Running com.interview.us.URLShortnerAppTest

::::::::::Create Short URL for given URL:::::::::::::::::

URL::www.google.com/maps

Shortened URL:: https://deloitte.tiny/wNnMa

::::::::::Fetching the redirect URL for stored short URL::::::::::

Shortened URL::https://deloitte.tiny/wNnMa

Redirect URL:: www.google.com/maps


-------------------------------------------------------

* mvn test -Durl=www.google.com/maps -DkeyLength=4 

-------------------------------------------------------

Running com.interview.us.URLShortnerAppTest

::::::::::Create Short URL for given URL:::::::::::::::::

URL::www.google.com/maps

Shortened URL:: https://deloitte.tiny/AwSD

::::::::::Fetching the redirect URL for stored short URL::::::::::

Shortened URL::https://deloitte.tiny/AwSD

Redirect URL:: www.google.com/maps


-------------------------------------------------------

* mvn test -Durl=www.google.com/maps -DkeyLength=5 -Ddomain=deloitte.us

-------------------------------------------------------

Running com.interview.us.URLShortnerAppTest

::::::::::Create Short URL for given URL:::::::::::::::::

URL::www.google.com/maps

Shortened URL:: deloitte.us/S3D6T

::::::::::Fetching the redirect URL for stored short URL::::::::::

Shortened URL::deloitte.us/S3D6T

Redirect URL:: www.google.com/maps

