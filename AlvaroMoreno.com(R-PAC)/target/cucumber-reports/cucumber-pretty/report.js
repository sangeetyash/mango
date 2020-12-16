$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature (Scenario2)",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2)",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CatalogItem"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 35
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 41
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 42
    },
    {
      "cells": [
        "ALMO_MCM01",
        "50"
      ],
      "line": 43
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 47
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 48
    },
    {
      "cells": [
        "ALMO_MCM01",
        "50"
      ],
      "line": 49
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 55,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 56,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 57,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 57,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CatalogItem"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 35
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"50\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify Cart With DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 41
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 42
    },
    {
      "cells": [
        "ALMO_MCM01",
        "50"
      ],
      "line": 43
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 47
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 48
    },
    {
      "cells": [
        "ALMO_MCM01",
        "50"
      ],
      "line": 49
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
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
  "duration": 16512322000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 14851500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@AlvaroMoreno.com",
      "offset": 13
    },
    {
      "val": "Lousie#786",
      "offset": 42
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 24107391200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 81000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 117300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 15719871900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ALMO_MCM01",
      "offset": 18
    },
    {
      "val": "100",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinition.getAddCatalog(String,String)"
});
formatter.result({
  "duration": 13407917900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3488864500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4506800000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 14884494300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ALMO_MCM01",
      "offset": 18
    },
    {
      "val": "50",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinition.getAddCatalog(String,String)"
});
formatter.result({
  "duration": 13845627700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3047306800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 3843003400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10571775900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "duration": 22303924100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.RPOWithDB(DataTable)"
});
formatter.result({
  "duration": 1539321100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "duration": 225800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
});
formatter.result({
  "duration": 8732404700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027tblMangoOrderStatus_length\u0027]/span[2]/span/span\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u002720.0.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\GLOBAL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56611}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c7b13711be639345a3b784e778988887\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027tblMangoOrderStatus_length\u0027]/span[2]/span/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.OrderStatus.getSearch(OrderStatus.java:41)\r\n\tat stepDefinitions.LoginStepDefinition.order_status_check(LoginStepDefinition.java:858)\r\n\tat ✽.Then Goto Report\u003eOrder Status(scenarios2.feature:51)\r\n",
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