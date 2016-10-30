# <img src="http://en.ru.is/media/hr/skjol/default_white.png" width="200" height="200" />

# Administration manual

## About
* This manual contains:
 * Requirements on how to build and run the project locally on a computer
 * How to run the project
 * How to deploy and maintain on an external server

## Build and run

### Requirements to build and run the project locally

* Java JDK 8
    * Download [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) Development Kit 8
    * Select the appropriate operating system and proceed with the install.

* Git
    * Dowload [git](https://git-scm.com/download/) and choose current operating system; Windows, Mac or Linux
    * Set up and run git bash.

Verify java version by executing:
```sh
$ java -version
```

Check the JAVA_HOME environment variable by executing:
```sh
$ echo $JAVA_HOME
```
If the output is something like this:
```sh
$ /c/Program Files (x86)/Java/jdk1.8.0_101/bin
```
With /bin in the end, the variable has to be edited and changed in system properties
* Clone the github repository:
```sh
$ git clone https://github.com/GNNF/TicTacToe
```

* Gradle
    * Install Gradle in the command shell
    * One possibility is to use [SDKMAN!](http://sdkman.io/)

Installing with Software Development Kit Manager (SDKMAN):
```sh
/TicTacToe $ curl -s https://get.sdkman.io | bash
```
Now close the terminal, reopen it, make sure the address of the current working directory is in the root of the project and install the latest version of Gradle
```sh
/TicTacToe $ sdk install gradle 3.1
```
Building the project with gradle tasks should now be enabled. The project can be built by running:
```sh
/TicTacToe $ gradle build
```
* Deployment
   * The lates working push to the master branch on the [git repo](http://github.com/GNNF/TicTacToe/) gets automatically deployed to the webservice [Heroku](https://www.heroku.com/).
* Travis
    * Signup on [Travis-CI](https://travis-ci.org/) to view build status, tests, etc.
    * Project can be monitored [here](https://travis-ci.org/GNNF/TicTacToe)
