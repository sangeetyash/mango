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
  "duration": 15603996100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 12848100,
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
  "duration": 23868101000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 76200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 99100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 16351384800,
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
  "duration": 13625498400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3733300700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4076050800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getCatalogScreen()"
});
formatter.result({
  "duration": 14711715500,
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
  "duration": 13345808500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 2791829100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyCartWithDB(DataTable)"
});
formatter.result({
  "duration": 4391311900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10597390000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "duration": 25490463400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.RPOWithDB(DataTable)"
});
formatter.result({
  "duration": 4788087300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "duration": 69200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
});
formatter.result({
  "duration": 12670096000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 16712372100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 3679646500,
  "status": "passed"
});
});