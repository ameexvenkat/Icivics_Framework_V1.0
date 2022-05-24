Feature: Student Registration Class Code Validation

Scenario: C425 - Do Email address and Verify email address fields appear if you select the Optional: Click here to enter your email address button?
Given Launch the icivis Studentregistration email URL
Then Click link Optional: Click here to enter your email address
 
Scenario: C426 - If you hover over the email/verify email address fields, do you see a hover tooltip with appropriate text?
Then Hover over email and verify fields after they are made visible


Scenario: C427 - Do the Email address and Verify email address fields disappear if you select the Click here to remove the email address button?
When Click link Click here to remove the email address

Scenario: C428 - Is a username pre-generated when you arrive on the page?
Then Go to register as student class code page

Scenario: C429 - Can you select a button to randomly generate a new username in the field?
When Click button next to username


Scenario: C430 - Can you enter text in every field?
Given Enter valid info into text fields and hit next


Scenario: C431 - Are required fields marked with an asterisk?
Then Go to register as student page


Scenario: C432 - If you enter invalid information in a required field and select Next, do you receive an appropriate error message?
When Enter invalid class code and improper email address error msg should display 

Scenario: C433 - If you leave a required field blank and select Next, do you receive an appropriate error message?
Then Error messages will display if any of 5 are left blank

Scenario: C434 - Do all error messages display correctly?
Then Enter invalid or blank info and hit next


Scenario: If you fill out all required fields with valid information and select Next, are you taken to Page 2?
Given Enter valid info for each field and hit next
