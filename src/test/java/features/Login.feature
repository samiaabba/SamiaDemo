Feature:Application Login

Scenario:Home Page Default Login
Given user is on NetBanking Landing page
When user login into application with "jin" and password "1234"
Then cards are displayed
And cards displayed are "true"


Scenario:Home Page Default Login
Given user is on NetBanking Landing page
When user login into application with "john" and password "5678"
Then cards are displayed
And cards displayed are "fals"



