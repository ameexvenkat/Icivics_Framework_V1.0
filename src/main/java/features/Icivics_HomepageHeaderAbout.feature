Feature: Homepage HeaderAbout Validation

Scenario: C22 - When you select About, does a submenu open below the About button?
Given Launch the icivis educatorregistration URL
Then Verify on Clicking about button at top about submenu open other than homepage  

Scenario: C23 - Do you see links to About iCivics, Who We Are, Our Strategy, CIVXNOW, Our Team, Blog, and Contact Us in the submenu?
Given Verify on Clicking about button Options display

Scenario: C24 - When you select a link in the submenu, are you navigated to the appropriate page?
Given Click on all about menu options and all options redirect to corresponding page 

Scenario: C26 - If you are viewing one of the pages in the About submenu, is that page underlined in the submenu?
Given 

Scenario: C27 - When you select About again while the submenu is open, does the submenu close?
Given Click the about menu, menu opens Click about menu again Teach menu should closes