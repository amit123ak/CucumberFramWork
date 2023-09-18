Feature: Login Functionality 

Scenario: User Login our application with vaild credential
Given user browe url as "https://admin-demo.nopcommerce.com/login" 
When user enter the username as "admin@yourstore.com" and password as "admin"
And user click on the login in
Then page Title shoud be "Dashboard / nopCommerce administration"
When click on the logout button 
Then page Title should be "Your store. Login" 
And closed brower 
