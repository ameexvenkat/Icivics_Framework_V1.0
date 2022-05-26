Feature: Homepage Header Validation
Scenario: C3 -While on all other pages, do you see buttons for Play, Teach, About, Donate, Shop, and My iCivics in the navigation bar?
Given Launch the icivis Studentregistration email URL
When homepage is loaded successfully
Then Verify Play buttons should appear in the top/right
Then Verify Teach buttons should appear in the top/right
Then Verify About buttons should appear in the top/right
Then Verify Donate buttons should appear in the top/right
Then Verify Shop buttons should appear in the top/right