$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature (Scenario2)",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2)",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginValidation"
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
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;1"
    },
    {
      "cells": [
        "Test@123.com",
        "User@123"
      ],
      "line": 20,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "CRM Login Test and logout",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);crm-login-test-and-logout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@LoginValidation"
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
  "duration": 20200556100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 5390300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCrentials(DataTable)"
});
formatter.result({
  "duration": 15772544900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 106100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 83300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 6052266400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".user\\-name\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u0027192.168.43.59\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\GLOBAL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53067}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7d9bbfc68bc3e996bb41b2af6bf41dce\n*** Element info: {Using\u003dclass name, value\u003duser-name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:405)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:391)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.LoginUserPassword.logout(LoginUserPassword.java:56)\r\n\tat stepDefinitions.LoginStepDefinition.logout(LoginStepDefinition.java:904)\r\n\tat ✽.Then Logout(scenarios2.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});