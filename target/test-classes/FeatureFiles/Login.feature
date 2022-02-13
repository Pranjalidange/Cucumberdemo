Feature: Application Login
Scenario Outline: Home page login
Given Initialize the browser with chrome
And Naviagate to "https://login.salesforce.com/?locale=in" site
When When user enteres <username> and <password> and logs in
Then Verify that user is succesfully signed in

Examples:

|username|   |password|
|test@1.com| |secure12345|
|test@2.co|  |Secure1234|