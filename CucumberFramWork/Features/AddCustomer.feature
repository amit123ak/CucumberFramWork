Feature: Add Customer Functionality 

Scenario: User Login our application with vaild credential
Given user browe url as "https://admin-demo.nopcommerce.com/login" 
When user enter the username as "admin@yourstore.com" and password as "admin"
And user click on the login in
Then page Title shoud be "Dashboard / nopCommerce administration"
When  click on customer 
And  click on add customer
Then cutomers page should be displayed 
When click on add new customer 
Then add a new customer page should be displayed 
When  fill the customer info 
And   save customer info
Then customer info save message should be displayed 
When click on the logout button 
Then page Title should be "Your store. Login" 
And closed brower 