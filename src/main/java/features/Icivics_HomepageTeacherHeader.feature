Feature: Homepage Header Validation
Scenario: C3 -While on all other pages, do you see buttons for Play, Teach, About, Donate, Shop, and My iCivics in the navigation bar?
Given Launch the icivis Studentregistration email URL
When homepage is loaded successfully
Then Verify Play buttons should appear in the top/right
Then Verify Teach buttons should appear in the top/right
Then Verify About buttons should appear in the top/right
Then Verify Donate buttons should appear in the top/right
Then Verify Shop buttons should appear in the top/right

Scenario: C6-Do all buttons have hover/click states?
Then Verify playbutton should have Hand cursor should appear over buttons Tooltip appears after hover.
Then Verify teachbutton should have Hand cursor should appear over buttons Tooltip appears after hover.
Then Verify aboutbutton should have Hand cursor should appear over buttons Tooltip appears after hover.
Scenario: C6-Do all buttons have hover/click states?