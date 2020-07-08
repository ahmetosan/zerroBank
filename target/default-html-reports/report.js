$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Loginibrahim.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users\twith\twrong\tusername\tor\twrong\tpassword\tshould\tnot\tbe\table\tto\tlogin.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "users should not be able to login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerroBank.StepDef.LoginibrahimStepDef.users_should_not_be_able_to_login()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat com.zerroBank.StepDef.LoginibrahimStepDef.users_should_not_be_able_to_login(LoginibrahimStepDef.java:14)\r\n\tat ✽.users should not be able to login(file:///C:/Users/ibrahim/IdeaProjects/zerroBank/src/test/resources/features/Loginibrahim.feature:9)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "user logs in with invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerroBank.StepDef.LoginibrahimStepDef.user_logs_in_with_invalid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "error\tmessage\tLogin\tand/or password\tare\twrong. should\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerroBank.StepDef.LoginibrahimStepDef.error_message_Login_and_or_password_are_wrong_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});