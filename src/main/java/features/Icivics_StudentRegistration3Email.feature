Feature: Student Registration3 Email Validation

Scenario: C372 - Can you tell which page you are currently viewing in the breadcrumbs?
Given Launch the icivis Studentregistration email URL
And View page 3 of student registration

Scenario: C373 - Do you see a notification that a welcome message has been sent to your email address?
Given verify Message says check your inbox

Scenario: C374 - Do you see text that your confirmation email is on the way?
Then Verify Message says confirmation email is on its way

Scenario: C375 - Is your email displayed on the page?

Scenario: C376 - Can you select a button to resend your confirmation email?
Given Verify resend button is clickable

Scenario: C377 - Do you see a notification when the email has been resent?
Given Verify resend button is clickable