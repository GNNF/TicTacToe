# <img src="http://en.ru.is/media/hr/skjol/default_white.png" width="200" height="200" />

# Development manual

## About
#### This manual contains:
* Source control access
* Building environment
* Coding standards
* Other tools


#### Source control access
* This project is hosted on [github](https://github.com). The source control for this project can be accessed [here](https://github.com/GNNF/TicTacToe)

#### Building environment
Project was made with Git Bash. These requirements are for building the project:
* Java
    * Download [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) JDK version 8 and install on your computer
    * Verify java version by executing:
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
    * Install Gradle in the command shell with SDKMAN:
```sh
/TicTacToe $ curl -s https://get.sdkman.io | bash
```
Now close the terminal, reopen it, make sure the address of the current working directory is in the root of the project and install the latest version of Gradle
```sh
/TicTacToe $ sdk install gradle 3.1
```
Now you should be able to execute various gradle tasks. You can view available tasks by running:
```sh
/TicTacToe $ gradle tasks
```
The project can be built by running:
```sh
/TicTacToe $ gradle build
```
#### Coding standards
* **[Sun's coding standard](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/sun_checks.xml)** with minor modifications were used.

#### Other tools
* **Heroku and Travis** were used for continuous integration. Sign up on [Travis-CI](https://travis-ci.org/) using your github account and monitor the [Travis site](https://travis-ci.org/GNNF/TicTacToe) for the project to view project status, test results etc. As well as all successful builds are automatically deployed to the web service [Heroku](https://heroku.com).
