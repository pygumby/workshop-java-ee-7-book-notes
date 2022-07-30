> ### 🚨 My GitHub account name and domain have changed since I created this repository!
> **When I originally created this repository, my GitHub account was `@lambdarookie` and my domain was `lambdarookie.com`.
> These might be referenced within this repository.
> Note that my current GitHub account is `@typeduke` and my current domain is `typeduke.com`.**

# workshop-java-ee-7-book-notes

**Notes on and source code from the 2014 book "Workshop Java EE 7" by Marcus Schießer**

---

* The contents of this repository are originally based on the 2014 book [Workshop Java EE 7](https://www.dpunkt.de/buecher/4861/workshop-java-ee-7.html) by Marcus Schießer ([@marcusschiesser](https://github.com/marcusschiesser/), [marcusschiesser.de](http://marcusschiesser.de)).
  This repository only represents a fraction of what is to be found within the book.
  Also, this repository contains many additions and comments that are not part of the book.
* The original repository can be found at [github.com/marcusschiesser/my-aktion-2nd](https://github.com/marcusschiesser/my-aktion-2nd).

---

1. [Usage](#1-usage)
2. [Progress](#2-progress)

---

## 1. Usage

Start WildFly.
(On my machine, I do `/opt/wildfly-8.1.0.Final/bin/standalone.sh --server-config=standalone.xml`.)
Deploy with `mvn clean package wildfly:deploy`.
Open http://localhost:8080/my-aktion/ in your browser.

To run the integration tests, make sure [arquillian.xml](src/test/resources/arquillian.xml) points to a Firefox binary not newer than version 26.
Make sure that the `Locale` set in [AbstractPage.java](src/test/java/com/lambdarookie/myaktion/test/pages/AbstractPage.java) matches the default language of your OS.
Start WildFly.
Do `mvn verify`.

## 2. Progress

|  Done?                        | Chapter                                                                      |
|:-----------------------------:|------------------------------------------------------------------------------|
| :white_check_mark: (no code) |  1. Ein Einstieg mit Profil                                                  |
| :white_check_mark: (no code) |  2. Aufsetzen der Entwicklungsumgebung                                       |
| :white_check_mark: (no code) |  3. Fachlichkeit der Beispielanwendungen "My-Aktion" und "My-Aktion-Monitor" |
| :white_check_mark:           |  4. Iteration Nr. 1 – JavaServer Faces                                       |
| :white_check_mark:           |  5. Iteration Nr. 2 – Funktionale Tests                                      |

:point_right: I am currently working my way through chapter 6.
