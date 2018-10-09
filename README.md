# SimpleWebApp
Simple J2EE Web Application 

This is a simple J2EE web application.
This app runs on Maven embedded plugin - Tomcat7 server.

To compile and run the code, execute:

$> mvn clean compile package tomcat7:run

The application can be accessed via: http://localhost:8080/login.do

Valid credentails are - Scott/Tiger. (Hardcoded at service layer)

Any invalid credentials will take the user back to login page. 
On successful authentication, application redirects to welcome page.

There is no DB in this version of the app.