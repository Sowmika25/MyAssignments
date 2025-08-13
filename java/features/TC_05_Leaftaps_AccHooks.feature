Feature: Create Account in the leaftaps application

@smoke
Scenario Outline: Create account and details in the leaftaps application

When User clicks on the create account
And enter the account name as <accnamecreate>
Then click on create account

Examples:
|accnamecreate|
|Hansika55|
|Harshitha65|
|Pallavi75|



@regression
Scenario Outline: Edit account and add details in the leaftaps application


When user click on the find accounts
And user enter the account name as <accnameedit>
And user click on the find account
And click on the first resulting account name
And click on the edit button
And enter the description as <des>
Then click on the save button

Examples:
|accnameedit|des|
|Hansika55|TestleafStu112|
|Harshitha65|TestleafStu2|
|Pallavi75|TestleafStu31|


