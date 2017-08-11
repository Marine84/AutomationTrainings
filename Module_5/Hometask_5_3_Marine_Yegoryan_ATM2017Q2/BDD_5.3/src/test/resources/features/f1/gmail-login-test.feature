Feature: Gmail Login
Background:
Given user navigates to gmail home page
#comment is here - feature description for search testing

#recurrent actions/preconditions go below - in "Background" section
#this section is optional.
#Uncomment it and delete/comment duplicating step from Scenario description
#Background:
#Given user navigates to github home page

@smokeTest
Scenario: Gmail login test

When  click signIn button
And   enters user credentials and submits login form
Then  gmail home page is displayed