$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PACMango.com CRM E-Coomerece Feature Main Finish..",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;sql-catalog-back-n-forth",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@testcase55"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate user to Login Page \"https://devrtrac.r-pac.com/Login/Index\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Plus Add to cart \"SSW\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 16
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Plus Add to cart \"SSW\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 22
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 23
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 28
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 29
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;sql-catalog-back-n-forth;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 37,
      "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;sql-catalog-back-n-forth;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 38,
      "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;sql-catalog-back-n-forth;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;sql-catalog-back-n-forth;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@testcase55"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate user to Login Page \"https://devrtrac.r-pac.com/Login/Index\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Plus Add to cart \"SSW\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 16
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Plus Add to cart \"SSW\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 22
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 23
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 28
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 29
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://devrtrac.r-pac.com/Login/Index",
      "offset": 29
    },
    {
      "val": "Chrome",
      "offset": 74
    }
  ],
  "location": "LoginStepDefinition.navigateUser(String,String)"
});
formatter.result({
  "duration": 17038060100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 5946300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123.com",
      "offset": 13
    },
    {
      "val": "User@123",
      "offset": 32
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 25337602500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 304200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 105600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 15606326700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSW",
      "offset": 18
    },
    {
      "val": "100",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.getAddCatalog(String,String)"
});
formatter.result({
  "duration": 13608421400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3987696600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4647129300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 15071229600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SSW",
      "offset": 18
    },
    {
      "val": "50",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.getAddCatalog(String,String)"
});
formatter.result({
  "duration": 13337117600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 2937371600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4816257900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10608709700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "duration": 22087170800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.RPOWithDB(DataTable)"
});
formatter.result({
  "duration": 2288942900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "duration": 143800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
});
formatter.result({
  "duration": 4138132900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Order Status\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u002720.0.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\GLOBAL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58273}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c11b51ae605be3804d3f149a00b02c01\n*** Element info: {Using\u003dlink text, value\u003dOrder Status}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:373)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.OrderStatus.getOrderStutus(OrderStatus.java:32)\r\n\tat stepDefinitions.LoginStepDefinition.order_status_check(LoginStepDefinition.java:856)\r\n\tat ✽.Then Goto Report\u003eOrder Status(scenarios2.feature:32)\r\n",
  "status": "failed"
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