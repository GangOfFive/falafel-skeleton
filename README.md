falafel-skeleton
================

Tomcat fix, para porder agregarlo en STS:
cd /usr/share/tomcat7
sudo ln -s /var/lib/tomcat7/conf conf
sudo ln -s /etc/tomcat7/policy.d/03catalina.policy conf/catalina.policy
sudo ln -s /var/log/tomcat7 log
sudo chmod -R 777 /usr/share/tomcat7/conf

STS fix para poder agregar nombre de tomcat:
http://stackoverflow.com/questions/8025841/eclipse-3-7-indigo-tomcat7-cannot-create-a-server-using-the-selected-typ/11292012#11292012
