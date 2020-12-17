$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature (Scenario2)",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2)",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@LoginValidation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user enters \"Test@123.com\" and \"User@123\""
    }
  ],
  "line": 21,
  "name": "user enters credentials",
  "rows": [
    {
      "cells": [
        "admin@AlvaroMoreno.com",
        "Lousie#786"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#Then enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    }
  ],
  "line": 24,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 30,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;1"
    },
    {
      "cells": [
        "Test@123.com",
        "User@123"
      ],
      "line": 31,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@LoginValidation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user enters \"Test@123.com\" and \"User@123\""
    }
  ],
  "line": 21,
  "name": "user enters credentials",
  "rows": [
    {
      "cells": [
        "admin@AlvaroMoreno.com",
        "Lousie#786"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#Then enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    }
  ],
  "line": 24,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
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
      "val": "chrome",
      "offset": 62
    }
  ],
  "location": "LoginStepDefinition.navigateUser(String,String)"
});
formatter.result({
  "duration": 6330897200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 14357400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCrentials(DataTable)"
});
formatter.result({
  "duration": 53666600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u0027192.168.43.88\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\GLOBAL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56668}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: bdb7d00719c56553f464f4efca012a50\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.LoginUserPassword.usercredentials(LoginUserPassword.java:86)\r\n\tat stepDefinitions.LoginStepDefinition.getCrentials(LoginStepDefinition.java:603)\r\n\tat ✽.Then user enters credentials(scenarios2.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});