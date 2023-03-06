$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Workspace/CucumberLearning/src/main/java/bddFeature/loginlearning.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Free Gmail test scenario"
    },
    {
      "line": 6,
      "value": "#Given User is already on Login Page"
    },
    {
      "line": 7,
      "value": "#Then User Enter \"bbtvision@gmail.com\" and User click on Next"
    },
    {
      "line": 8,
      "value": "#Then User Enter \"Lalo@123456\" User click on Next"
    }
  ],
  "line": 11,
  "name": "Free Gmail test scenario",
  "description": "",
  "id": "login-feature;free-gmail-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User Enter \u003cusername\u003e and User click on Next",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Enter \"\u003cpassword\u003e\" User click on Next",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-feature;free-gmail-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-feature;free-gmail-test-scenario;;1"
    },
    {
      "cells": [
        "12",
        "Lalo@123456"
      ],
      "line": 19,
      "id": "login-feature;free-gmail-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Free Gmail test scenario",
  "description": "",
  "id": "login-feature;free-gmail-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User Enter 12 and User click on Next",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Enter \"Lalo@123456\" User click on Next",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LearingStepdefination.user_already_On_loginPage()"
});
formatter.result({
  "duration": 5135144900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 11
    }
  ],
  "location": "LearingStepdefination.add_userName_ClickNext(int)"
});
formatter.result({
  "duration": 62209900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lalo@123456",
      "offset": 12
    }
  ],
  "location": "LearingStepdefination.add_Password_ClickNext(String)"
});
formatter.result({
  "duration": 5295966100,
  "status": "passed"
});
formatter.match({
  "location": "LearingStepdefination.CloseBrowser()"
});
formatter.result({
  "duration": 947476200,
  "status": "passed"
});
});