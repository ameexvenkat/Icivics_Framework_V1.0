Feature: Homepage HeaderTeach Validation

Scenario: C15 - When you select Teach, does a submenu open below the Teach button?
Given Launch the icivis URL
Then Verify on Clicking teach button at top teach submenu open 

Scenario: C16 - Do you see links to Search Our Library, Scope and Sequence, Professional Development, Get Started, Educatory Community, and FAQ in the submenu?
Given Verify click on Teach submenu Options display

Scenario: C17 - When you select a link in the submenu, are you navigated to the appropriate page?
Then check all links of teach button



Scenario: C20 - When you select Teach again while the submenu is open, does the submenu close?
Given Click the teach menu, menu opens Click teach menu again Teach menu should closes


