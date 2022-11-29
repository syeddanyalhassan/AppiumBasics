#AppiumBasics
Configuration

![image](https://user-images.githubusercontent.com/34996741/204501207-471207e5-6570-487f-b5b9-fcc40d0b389d.png)

![image](https://user-images.githubusercontent.com/34996741/204501265-656af4ea-9df6-4062-bb2e-bd0dcc51e01c.png)

![image](https://user-images.githubusercontent.com/34996741/204502050-d8fba852-5095-4066-8f84-7fc695a56288.png)

![image](https://user-images.githubusercontent.com/34996741/204502230-0a59c630-c202-4ae2-84f0-aeda30c577bf.png)

![image](https://user-images.githubusercontent.com/34996741/204502413-89a3e7e5-4fc5-427e-8b7d-7676ce24a244.png)


----
When app is not working 

Stop appium server and execute below commands

adb uninstall io.appium.uiautomator2.server adb uninstall io.appium.uiautomator2.server.test

start appium server and execute your scripts ..it will work

---
 
 
For Allure Reporting

Allure serve C:\Users\Hafsa\eclipse-workspace\Appium\allure-results

Run File From Command Line

Running a Test Suite Using Maven If we want to execute test suites using Maven, we should configure the plugin maven-surefire-plugin:

maven-surefire-plugin testng.xml Copy
Here, we have a Maven profile named ExecuteTestSuite that will configure the maven-surefire plugin to launch the testng.xml test suite. We can run this profile using the command:

$ mvn -P ExecuteTestSuite test
