Feature: Homepage search our libraryunderlinedtext Validation

Scenario: C19 - If you are viewing one of the pages in the Teach submenu, is that page underlined in the submenu?
Given Launch the icivis educatorregistration URL
Then Verify Menu appears with underlined option IF you are on main teach page, professional development, or get started.  Other pages do not have this behavior.


