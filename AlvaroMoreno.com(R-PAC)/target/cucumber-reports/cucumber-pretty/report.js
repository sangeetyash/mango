$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios2.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature (Scenario2)",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2)",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 36,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@CatalogItem"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"firefox\"",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify Cart With DB",
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
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#Then goto catalog screen and PO selection validation check"
    },
    {
      "line": 50,
      "value": "#Then Plus Add to cart \"ALMO_MCM01\" and \"50\""
    },
    {
      "line": 51,
      "value": "#Then goto checkout page"
    },
    {
      "line": 52,
      "value": "#Then Verify Cart With DB"
    },
    {
      "line": 53,
      "value": "#| Catalog | qty |"
    },
    {
      "line": 54,
      "value": "#| ALMO_MCM01     | 100 |"
    },
    {
      "line": 55,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
  "line": 56,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 59
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 60
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 61,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
  "line": 62,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 67,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 68,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 69,
      "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 69,
  "name": "SQL Catalog back n forth",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature-(scenario2);sql-catalog-back-n-forth;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@CatalogItem"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"firefox\"",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "goto catalog screen and PO selection validation check",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Plus Add to cart \"ALMO_MCM01\" and \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify Cart With DB",
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
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#Then goto catalog screen and PO selection validation check"
    },
    {
      "line": 50,
      "value": "#Then Plus Add to cart \"ALMO_MCM01\" and \"50\""
    },
    {
      "line": 51,
      "value": "#Then goto checkout page"
    },
    {
      "line": 52,
      "value": "#Then Verify Cart With DB"
    },
    {
      "line": 53,
      "value": "#| Catalog | qty |"
    },
    {
      "line": 54,
      "value": "#| ALMO_MCM01     | 100 |"
    },
    {
      "line": 55,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
  "line": 56,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "Verify catalog RPO with DB",
  "rows": [
    {
      "cells": [
        "Catalog",
        "qty"
      ],
      "line": 59
    },
    {
      "cells": [
        "ALMO_MCM01",
        "100"
      ],
      "line": 60
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 61,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
  "line": 62,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
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
      "val": "firefox",
      "offset": 62
    }
  ],
  "location": "LoginStepDefinition.navigateUser(String,String)"
});
formatter.result({
  "duration": 4053060500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 5167000,
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
  "duration": 25787700,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #username\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-M0JQEN5\u0027, ip: \u002720.0.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 84.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20201211215739, moz:geckodriverVersion: 0.28.0, moz:headless: false, moz:processID: 20352, moz:profile: C:\\Users\\Global IT\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5425f48d-93b9-4856-8b42-aa93d00099e2\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat pageObjects.LoginUserPassword.usernamepassword_LoginUserPassword(LoginUserPassword.java:37)\r\n\tat stepDefinitions.LoginStepDefinition.user_enters_username_and_password(LoginStepDefinition.java:190)\r\n\tat ✽.Then user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\"(scenarios2.feature:40)\r\n",
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
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "status": "skipped"
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