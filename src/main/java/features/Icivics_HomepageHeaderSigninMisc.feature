Feature: Homepage HeaderSigninMisc Validation

Scenario: C29 - Can you see an appropriate icon for Donate?
Given Launch the icivis  URL
Then Verify Donate button is display

Scenario: C30 - When you select Donate, are you directed to https://give.icivics.org/?
Given click on donate button and verify the URL 

Scenario: C31 - Can you see an appropriate icon for Shop?
Given Verify Shop button appears

Scenario: C32 - When you select Shop, are you directed to https://icivics.myshopify.com/?
Given click on shop button and verify the URL 

Scenario: C33 - If you are not signed in, do you see a Sign In button instead of My iCivics?
Given Verify Sign in button appears in top/right for an anonymous user

Scenario: C34 - If you are signed in, do you see a My iCivics button instead of Sign In?
Given Verify My iCivics button appears in top/right for an authenticated user 

Scenario: C35 - Can you see your avatar icon represented in the button?
Given

Scenario: C36 - When you select Sign In/My iCivics, does a submenu open below the button?
Given signin as a teacher 
Then Click on Myicivics button and verify submenu display

Scenario: C37 - When you select Sign In/My iCivics, does a submenu open below the button?
Given Verify click on signin button and submenu display 

Scenario: C38 -If not signed in and you select a link in the submenu, are you navigated to the appropriate page?
Given Click on the submenu links of signinbutton  and verify it redirects to corresponding page


Scenario: C39 -When you select a link in the submenu, are you navigated to the appropriate page?
Given Signin as a teacher
Then Click on the submenu links of MyIcivicsbutton and verify it redirects to corresponding page

Scenario: C41 -If you are viewing one of the pages in the Sign In/My iCivics submenu, is that page underlined in the submenu?
Given Verify the signin submenu option you are on should be underlined.


Scenario: C42 -When you select Sign In / My iCivics again while the submenu is open, does the submenu close?
Given Verify Click on signin button submenu is display and click again submenu is close
And Verify Click on My Icivics button submenu is display and click again submenu is close
 