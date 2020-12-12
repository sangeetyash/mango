$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 460,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;sql-catalog-back-n-forth",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 459,
      "name": "@testcase55"
    }
  ]
});
formatter.step({
  "line": 462,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 463,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 464,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 465,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 466,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 467,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 468,
  "name": "Plus Add to cart \"SSW\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 469,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 470,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 471
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 472
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 473,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 474,
  "name": "Plus Add to cart \"SSW\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 475,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 476,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 477
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 478
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 479
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 480,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 481,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 482,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 483
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 484
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 485
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 486,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 487,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 488,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 489,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 491,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;sql-catalog-back-n-forth;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 492,
      "id": "r-pac-mango-crm-e-coomerece-feature;sql-catalog-back-n-forth;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 493,
      "id": "r-pac-mango-crm-e-coomerece-feature;sql-catalog-back-n-forth;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 493,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;sql-catalog-back-n-forth;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 459,
      "name": "@testcase55"
    }
  ]
});
formatter.step({
  "line": 462,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 463,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 464,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 465,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 466,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 467,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 468,
  "name": "Plus Add to cart \"SSW\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 469,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 470,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 471
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 472
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 473,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 474,
  "name": "Plus Add to cart \"SSW\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 475,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 476,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 477
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 478
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 479
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 480,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 481,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 482,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 483
    },
    {
      "cells": [
        "SSW",
        "100"
      ],
      "line": 484
    },
    {
      "cells": [
        "SSW",
        "50"
      ],
      "line": 485
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 486,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 487,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 488,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 489,
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
  "duration": 33571310000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 20920500,
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
  "duration": 48731169900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 309900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 338600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 25349162500,
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
  "duration": 13983408000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 6162617600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4803304100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 15099360200,
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
  "duration": 13764331400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3303408400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 5105279400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10798086700,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput placeholder\u003d\"yyyy-mm-dd\" readonly\u003d\"true\" autocomplete\u003d\"off\" class\u003d\"form-control hasDatepicker\" data-val\u003d\"true\" data-val-required\u003d\"Please Select Requested Shippment Date.\" id\u003d\"txtdtExpected\" name\u003d\"dtExpected\" type\u003d\"text\" value\u003d\"\"\u003e is not clickable at point (631, 403). Other element would receive the click: \u003cdiv id\u003d\"smartAlert\" data-type\u003d\"info\" data-cancel\u003d\"true\" data-icon\u003d\"info\" data-align\u003d\"left\" data-draggable\u003d\"undefined\" data-pie\u003d\"htc\" data-chrome\u003d\"87\" data-webkit\u003d\"87\" style\u003d\"visibility: visible; z-index: 210000;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u0027192.168.43.59\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\GLOBAL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62107}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 18f30d97cfb8d7d777e03c4ae4ab5df6\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat pageObjects.CheckOut.expectedDate(CheckOut.java:152)\r\n\tat stepDefinitions.LoginStepDefinition.select_checkout_details(LoginStepDefinition.java:733)\r\n\tat ✽.Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date(scenarios.feature:480)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.RPOWithDB(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
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