Feature: Homepage HeaderPlay Validation

Scenario: C8 - When you select Play, does a submenu open below the Play button?
Given On Clicking  play button at top Play menu should open

Scenario: C9 - Do you see links to All Games, as well as each individual game in the submenu?

Given  On Clicking play button at top Links for each iCivics game should appear Also All Games and Game Odyssey


Scenario: C10 - When you select a link in the submenu, are you navigated to the appropriate page?

Then Click on each link on play menu and each should navigate to corresponding page 

Scenario: C12 - If you are viewing one of the pages in the Play submenu, is that page underlined in the submenu?

Scenario: C13 - When you select Play again while the submenu is open, does the submenu close?
Then Click the play menu,menu opens click play menu again play menu should close

