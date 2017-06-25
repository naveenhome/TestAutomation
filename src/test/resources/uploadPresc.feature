Feature: Job Posting as a recruiter 
Scenario: Data should be valid
Given recruiter has entered all correct date
When click on button Submit after data entry 
Then systen display success message

Scenario: Data should be valid with detailed
Given recruiter has title "Scrum Master", Description "PSM"
When click on button "Submit" after data entry 
Then systen display "Successful" with "OK" button
And clicking on "OK" will take user on "Home" page

Scenario: Data should is invalid with detailed
Given recruiter has title " ", Description "PSM"
When click on button "Submit" after data entry 
Then systen display "Success" message and "cancel" button
