$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Gmail Login feature",
  "description": "",
  "id": "free-gmail-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free Gmail test scenario",
  "description": "",
  "id": "free-gmail-login-feature;free-gmail-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is Gmail",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User Enter UserName And User Click on Next",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User Enter Password And User click on Next",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.user_already_On_loginPage()"
});
formatter.result({
  "duration": 4906579800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.Login_Title()"
});
formatter.result({
  "duration": 6113100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.add_userName_ClickNext()"
});
formatter.result({
  "duration": 65644000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.add_Password_ClickNext()"
});
formatter.result({
  "duration": 3003689100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});