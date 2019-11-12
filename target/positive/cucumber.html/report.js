$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kpott/SeleniumAutomatiom/cucumberPageObjectModel/src/test/resources/features/SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search cars page is working",
  "description": "In order to validate that\r\nthe search cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 11558324700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Postive-Scenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Iam on the HomePage \"https://www.carsguide.com.au\" of CarsGuide website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 12
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select Carbrand \"BMW\" from AnyMake dropdwon",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select Carmodel \"1Series\" from AnyModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select Location \"NT-All\" from AnyLocatin dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select Price \"$5000\"  from Price(max) dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on \"Find My Next Car\" button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the page should be displayed \"Make x BMW\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 21
    }
  ],
  "location": "SearchCarSteps.iam_on_the_HomePage_of_CarsGuide_website(String)"
});
formatter.result({
  "duration": 23112401700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 674751300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarSteps.click_on_link(String)"
});
formatter.result({
  "duration": 660534500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 17
    }
  ],
  "location": "SearchCarSteps.select_Carbrand_from_AnyMake_dropdwon(String)"
});
formatter.result({
  "duration": 3845622700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1Series",
      "offset": 17
    }
  ],
  "location": "SearchCarSteps.select_Carmodel_from_AnyModel_dropdown(String)"
});
formatter.result({
  "duration": 659405400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NT-All",
      "offset": 17
    }
  ],
  "location": "SearchCarSteps.select_Location_from_AnyLocatin_dropdown(String)"
});
formatter.result({
  "duration": 297019600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$5000",
      "offset": 14
    }
  ],
  "location": "SearchCarSteps.select_Price_from_Price_max_dropdown(String)"
});
formatter.result({
  "duration": 410063200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find My Next Car",
      "offset": 10
    }
  ],
  "location": "SearchCarSteps.click_on_button(String)"
});
formatter.result({
  "duration": 5139517700,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 55800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Make x BMW",
      "offset": 30
    }
  ],
  "location": "SearchCarSteps.the_page_should_be_displayed(String)"
});
formatter.result({
  "duration": 116200,
  "status": "passed"
});
formatter.after({
  "duration": 487800,
  "status": "passed"
});
});