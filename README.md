# java-learn-in-one-day
Learn Java in one day book exercises

1. Installing JDK (Java Development Kit) https://aws.amazon.com/corretto/
2. Install IDE https://www.jetbrains.com/idea/download/

```
# disabling proxy
export HTTP_PROXY=''
export http_proxy=''
export HTTPS_PROXY=''
export https_proxy=''
```

`pom.xml`. POM is an acronym for Project Object Model. The `pom.xml` file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom. xml file, then executes the goal.

`Maven` is a build automation tool used primarily for Java projects.

`.iml` is a module file created by IntelliJ IDEA, an IDE used to develop Java applications. It stores information about a development module, which may be a Java, Plugin, Android, or Maven component; saves the module paths, dependencies, and other settings. 

Compiling and running class from CLI: 

```
javac src/main/java/helloworld/HelloWorld.java -d target/classes
java -cp target/classes helloworld.HelloWorld
```

`.jsp files` https://stackoverflow.com/questions/3177733/how-to-avoid-java-code-in-jsp-files
