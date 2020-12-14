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
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
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
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
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
  "duration": 20093210000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 12044600,
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
  "duration": 39470119600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 92400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 114800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 18480340100,
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
  "duration": 13787249700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 4361800500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4910239300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 14733832400,
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
  "duration": 13346734800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3115531600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 5393166400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10595279100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "duration": 22692777600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.RPOWithDB(DataTable)"
});
formatter.result({
  "duration": 2330697600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "duration": 60100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
});
formatter.result({
  "duration": 19426596400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 17897006100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 3875138800,
  "status": "passed"
});
});