Feature: Create account in the salesforce application

Scenario Outline: Create account and add details in the salesforce application

When Click on the New button
And enter the name as <accname>
And select ownership as public
Then click save button and verify account name


Examples:
|accname|
|Priya|
|Harini|
#|Haritha|
#|Pooja|

