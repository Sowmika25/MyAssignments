Feature: Edit Accounts in the Salesforce Application

Scenario: Edit accounts and add the details and verify the phone number
Given search for the account name as Prem
When click the dropdown icon select edit
And set type to Technology partner
And set industry to healthcare
And enter the billing address as 'Testleaf,Wipro,Chennai'
And enter the shipping address as 'Testleaf,Nokia,Chennai'
And set customer priority to low
And set SLA to Silver
And set active to No
And enter unique phone number as '9344460167'
And set upsell opportunity to No
Then click save verify phone number