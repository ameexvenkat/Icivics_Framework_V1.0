Feature: Student Registration Class Code and Email Validation

Scenario: C398 - Can you tell which page you are currently viewing in the breadcrumbs?
Given Launch the icivis Studentregistration email URL
And View page 2 of student registration

Scenario: C399- Can you select Back to proceed to the previous page?
Then Click back from page 2


Scenario: C400- When you go Back, are your entries in all fields remembered?
Given Verify firstname is remembered.
When Verify lastname is remembered.
And Verify email is remembered.
And Verifyemail is remembered.



Scenario: C403- If you select the Terms of Use link, does the iCivics Terms of Use page open in a new tab?
When Click terms of use Terms of use page opens in new tab



Scenario: C404- If you select the Privacy Policy link, does the iCivics Privacy Policy page open in a new tab?
When Click privacy policy Privacy policy page opens in new tab


Scenario: C405- As a student, are you NOT prompted to sign up for the newsletter?

Scenario: C408- If you hover over the password field, do you see a hover tooltip with appropriate text?
When Hover over password field Tooltip appears


Scenario: C409- When you enter text in the Password field, do you see text indicating the current password's strength?
When  Enter password Indicator for strength should change according to pwd strength


Scenario: C410- When you enter text in the Confirm Password field do you see text indicating whether the two passwords match?
Given Verify Password match indicator says yes or no depending on match with the confirm Password

Scenario: C412- If you leave a required field blank and select Next, do you receive an appropriate error message?
Given Enter invalid Password, Confirm Password and verify the error message and its displayed in red

Scenario: C412- You must check terms of use and privacy
Then Leave terms of use and privacy checkbox unckecked Errors should displayed in red

Scenario: C413- Do all error messages display correctly?
When Leave password or confirm password blank check error messages



Scenario: C414- If you fill out all required fields with valid information and select Finish, are you taken to Page 3?
When Fill out required fields, passwords match, terms of use is checked and it should Goes on to next page  



