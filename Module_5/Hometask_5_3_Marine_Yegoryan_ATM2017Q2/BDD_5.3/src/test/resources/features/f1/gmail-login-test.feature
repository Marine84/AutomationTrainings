Feature: Gmail Login
Background:
Given user navigates to gmail home page


@smokeTest
Scenario Outline: Gmail login test

When  click signIn button
And   enter user credentials "<username>" and "<password>" to submit login form
Then  gmail home page is displayed
Examples:
|username|password|
|marineyegoryan|wrongpassword|
|marineyegoryan0884|marinetest|

