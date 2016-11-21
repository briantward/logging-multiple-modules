export CATALINA_HOME=~/appserver/runtimes/atc-8.0.39
rm -R $CATALINA_HOME/logs/*
rm -R $CATALINA_HOME/webapps/module-*
cp module-A/target/module-A-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps/
cp module-B/target/module-B-0.0.1-SNAPSHOT.war $CATALINA_HOME/webapps/
rm -R $CATALINA_HOME/shared/*
tar -xvf shared-libs/target/shared-libs-0.0.1-SNAPSHOT-bin.tar -C shared-libs/target/
cp shared-libs/target/*.jar $CATALINA_HOME/shared/
