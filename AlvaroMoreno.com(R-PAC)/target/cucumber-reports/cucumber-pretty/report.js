$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;crm-login-test-and-logout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginLogoutValidation"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then user enters \"Test@123.com\" and \"User@123\""
    }
  ],
  "line": 10,
  "name": "user enters credentials",
  "rows": [
    {
      "cells": [
        "admin@AlvaroMoreno.com",
        "Lousie#786"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Then enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    }
  ],
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;crm-login-test-and-logout;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "r-pac-mango-crm-e-coomerece-feature;crm-login-test-and-logout;;1"
    },
    {
      "cells": [
        "Test@123.com",
        "User@123"
      ],
      "line": 20,
      "id": "r-pac-mango-crm-e-coomerece-feature;crm-login-test-and-logout;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;crm-login-test-and-logout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginLogoutValidation"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then user enters \"Test@123.com\" and \"User@123\""
    }
  ],
  "line": 10,
  "name": "user enters credentials",
  "rows": [
    {
      "cells": [
        "admin@AlvaroMoreno.com",
        "Lousie#786"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Then enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    }
  ],
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://devrtrac.r-pac.com/",
      "offset": 29
    },
    {
      "val": "Chrome",
      "offset": 62
    }
  ],
  "location": "LoginStepDefinition.navigateUser(String,String)"
});
formatter.result({
  "duration": 19429957900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 14386700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCrentials(DataTable)"
});
formatter.result({
  "duration": 22967352800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 126500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 153000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 16805530800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 3794081200,
  "status": "passed"
});
});