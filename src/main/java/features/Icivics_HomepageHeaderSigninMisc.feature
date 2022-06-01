Feature: Homepage HeaderSigninMisc Validation

Scenario: C29 - Can you see an appropriate icon for Donate?
Given Launch the icivis educatorregistration URL
Then Verify Donate button appears

Scenario: C30 - When you select Donate, are you directed to https://give.icivics.org/?
Then click on donate button and verify the URL 

Scenario: C31 - Can you see an appropriate icon for Shop?
Then Verify Shop button appears

Scenario: C32 - When you select Shop, are you directed to https://icivics.myshopify.com/?
Then click on shop button and verify the URL 

Scenario: C33 - If you are not signed in, do you see a Sign In button instead of My iCivics?
Then Go to home page,as an anonymous user Sign in button should appears in top/right

Scenario: C34 - If you are signed in, do you see a My iCivics button instead of Sign In?
Then Go to home page signed in as a teacher My iCivics button should appears in top/right



Scenario: C35 - Can you see your avatar icon represented in the button?

Scenario: C36 - When you select Sign In/My iCivics, does a submenu open below the button?
Given signin as a teacher 
Then Click on Myicivics button and submenu should display on clicking

Scenario: C37 - When you select Sign In/My iCivics, does a submenu open below the button?
Then Click on signin button and submenu should display on clicking

Scenario: C38 -If not signed in and you select a link in the submenu, are you navigated to the appropriate page?
Then Click one of the 3 links on the submenu and verify whether it redirects to corresponding page
