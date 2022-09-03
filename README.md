# AEPD Test Exercise

This is a project based in MAVEN and TESTNG to create two automated test for AEPD using Selenium. You only need have configured eclipse (or your favourite IDE), maven and testng plugin. Chromedriver is also included.

It's using Page Object Model pattern. We have a class called FormPage where we have defined all elements from it and the methods to get the Objects.
Furthermore, we have two main class called BasePage and BaseTest which are used for the rest of Pages and Test. 

The example has a test using DataProvider and if it fails, a screenshot is taken and stored on $PATH_SCREENSHOTS


Now it's NOT running CircleCI and TestingBOT as selenium hub. Chromedrive local file is included to launch test locally.
This file can be found on resources folder, next to chromedriver.exe

