Feature: Homepage Header Validation
Scenario: C1 -Do you see the iCivics Logo in the upper left?
Given Launch the icivis Studentregistration email URL
When homepage is loaded successfully
Then Verify iCivics logo is at top/left on Clicking it reloads the page 

Scenario: C2-While on the iCivics Home Page, do you see buttons for Donate, Shop,  and My iCivics in the navigation bar?

Then Verify Donate buttons should appear in the top/right
And Verify Shop buttons should appear in the top/right
And Verify MyIcivics buttons should appear in the top/right

