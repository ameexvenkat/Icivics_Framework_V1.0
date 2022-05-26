Feature: Student Registration3 Class Code Validation

Scenario: C454 - Can you tell which page you are currently viewing in the breadcrumbs?
Given Launch the icivis Studentregistration email URL
And View page 3 of student registration

Scenario: C455 - Do you see a notification that displays your generated username?
Then Generated username should displayed correctly

Scenario: C456 - Do you see text that you will use your username and chosen password to log in?
When View verification page 3 Note about username and password should visible

Scenario: C457 - If you entered an email address, do you see a notification that displays your entered email address?
Then Email address should displayed

Scenario: C458 - If you entered an email address, do you see text that the email address can be used to log in?
When View verification page 3 Note about username or email and password is visible



Scenario: C459 - When you select Continue to my Assignments are you brought to your My iCivics page?
When Click continue to my assignments Page should goes to student My iCivics page



