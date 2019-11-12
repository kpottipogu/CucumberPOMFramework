@Search-Cars
Feature: Acceptance testing to validate search cars page is working
In order to validate that
the search cars page is working fine
we will do the acceptance testing

@Search-Cars-Postive-Scenario
Scenario: Validate search cars page
Given Iam on the HomePage "https://www.carsguide.com.au" of CarsGuide website
When I move to the menu
| Menu |
| buy + sell |
| reviews |
And click on "Search Cars" link
And Select Carbrand "BMW" from AnyMake dropdwon
And Select Carmodel "1Series" from AnyModel dropdown
And Select Location "NT-All" from AnyLocatin dropdown
And Select Price "$5000"  from Price(max) dropdown
And Click on "Find My Next Car" button
Then I should see list of searched cars
And the page should be displayed "Make x BMW"