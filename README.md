# WorkshopJavaEE7

## Sample project of the German book "Workshop Java EE 7" by Marcus Schießer und Martin Schmollinger

### Overview

This is just me following along the German book "Workshop Java EE 7" by Marcus Schießer und Martin Schmollinger.
The book's website is at https://www.dpunkt.de/buecher/4861/workshop-java-ee-7.html.
The original repository can be found at https://github.com/marcusschiesser/my-aktion-2nd.

### Usage
Start WildFly.
(On my machine, I do `/opt/wildfly-8.1.0.Final/bin/standalone.sh --server-config=standalone.xml`.)
Deploy with `mvn clean package wildfly:deploy`.
Open http://localhost:8080/my-aktion/ in your browser.

To run the integration tests, make sure [arquillian.xml](src/test/resources/arquillian.xml) points to a Firefox binary not newer than version 26.
Make sure that the `Locale` set in [AbstractPage.java](src/test/java/com/lambdarookie/myaktion/test/pages/AbstractPage.java) matches the default language of your OS.
Start WildFly.
Do `mvn verify`.

### Credit

All the credit goes to the authors of the book, Marcus Schiesser ([@MarcusSchiesser](https://github.com/marcusschiesser/)) and Martin Schmollinger.
