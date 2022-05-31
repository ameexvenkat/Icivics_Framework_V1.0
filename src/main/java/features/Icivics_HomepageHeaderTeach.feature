Feature: Homepage HeaderTeach Validation

Scenario: C15 - When you select Teach, does a submenu open below the Teach button?
Given Launch the icivis educatorregistration URL
Then On Clicking  teach button at top Play menu should open

Scenario: C16 - Do you see links to Search Our Library, Scope and Sequence, Professional Development, Get Started, Educatory Community, and FAQ in the submenu?
Then Click the teach button Links for 6 menu options should appear

Scenario: C17 - When you select a link in the submenu, are you navigated to the appropriate page?
Then check all links of teach button

Scenario: C19 - If you are viewing one of the pages in the Teach submenu, is that page underlined in the submenu?

Scenario: C20 - When you select Teach again while the submenu is open, does the submenu close?
Given Click the teach menu, menu opens Click teach menu again Teach menu should closes


