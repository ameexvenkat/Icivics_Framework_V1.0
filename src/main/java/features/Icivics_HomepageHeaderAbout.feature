Feature: Homepage HeaderAbout Validation

Scenario: C22 - When you select About, does a submenu open below the About button?

Given Launch the icivis educatorregistration URL
Then On Clicking about button at top about menu should open
Scenario: C23 - Do you see links to About iCivics, Who We Are, Our Strategy, CIVXNOW, Our Team, Blog, and Contact Us in the submenu?
Then Click the teach button Links for 6 menu options should appear
Scenario: C24 - When you select a link in the submenu, are you navigated to the appropriate page?
Then check all links of teach button
Scenario: C26 - If you are viewing one of the pages in the About submenu, is that page underlined in the submenu?

Scenario: C27 - When you select About again while the submenu is open, does the submenu close?
Given Click the about menu, menu opens Click about menu again Teach menu should closes