# Keyword_Driven_Framework
Keyword Driven Framework

Below is the list of common components that you would required to achieve the task:


Excel Sheet: This is the sheet which keeps most of the data for Keyword Driven which is needed for the test like Test Case, Test Steps, Test Objects and Actions.

Object Repository: Property file to store the html elements properties of the web application, this property file will be linked with the Objects in the test

Keyword Function Library: In keyword Driven Framework function file plays an important role, as it stores the working of the actions, so that each action can be callable from this file

Data Sheet: Excel file to store the Data value needed by the object to perform some action on it

Execution Engine: Test is the only test script we have in Keyword Framework and it contains all the code to drive the test from Excel sheet, Function Lib and Properties file.




From the above figure, you can see that the generic flow of a Keyword Driven Framework is something like this -

Execution Engine starts the test and connect with the bundle of test cases and start executing one by one

Once Test Case is picked, linked test steps are followed sequentially

Test Steps are further connected with Page Objects, Actions & Test Data

Once Execution Engine gets all the required info to perform a test step, it connects with application and do the step.
