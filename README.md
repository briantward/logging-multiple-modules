# logging-multiple-modules
Log4j 1.2
Tomcat 8

The purpose of this project is to provide a multi-module web application, that has shared dependencies installed on the server, launched on tomcat with each war module logging to its own log file.  Shared dependencies should only log to the respective module that calls them.

Incomplete.  Project abandoned.

Basically, I managed to get the logger to work almost as expected.  The logs rotate independently per each application while using the same base classes.  So each application classloader loads its own copy of the same log4j implementation in the tomcat shared library.  However, the slf4j-log4j bridge had issues and the logging in the example camel contexts (which use SLF4J) for each application failed as a result.  This could be worked out further by building a customized bridge so that the custom log4j loader can find the slf4j bridge correctly.  But as this is getting further down the rabbit hole, my recommendation at this point is to go back to packaging log4j into each module so each one has its own configuration and source classes independent of another.  The optimization of saving a few megabytes of package size and thus server footprint seems like a poor choice of direction for the difficulty and customization needed.
