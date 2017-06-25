Feature: Search Name with count
Scenario: Display count for seach keyword
Given user open "Firefox" browser
And enter "Google" in url
And enter "Naveen Kumar Singh Agile" in seach textbox
When click on "Search"
Then google display "12000" record found
 