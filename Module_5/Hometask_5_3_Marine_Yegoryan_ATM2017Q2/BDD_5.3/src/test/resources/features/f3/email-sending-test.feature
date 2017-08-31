Feature: Email creation


Scenario: Email sending test
Given user created email
When  open created email
And   click send button
Then  email should be sent