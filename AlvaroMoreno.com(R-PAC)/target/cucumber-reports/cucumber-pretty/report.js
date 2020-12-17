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
  "comments": [
    {
      "line": 37,
      "value": "#Then goto catalog screen and PO selection validation check"
    },
    {
      "line": 38,
      "value": "#Then Plus Add to cart \"ALMO_MCM01\" and \"50\""
    },
    {
      "line": 39,
      "value": "#Then goto checkout page"
    },
    {
      "line": 40,
      "value": "#Then Verify Cart With DB"
    },
    {
      "line": 41,
      "value": "#| Catalog | qty |"
    },
    {
      "line": 42,
      "value": "#| ALMO_MCM01     | 100 |"
    },
    {
      "line": 43,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
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
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
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
  "comments": [
    {
      "line": 37,
      "value": "#Then goto catalog screen and PO selection validation check"
    },
    {
      "line": 38,
      "value": "#Then Plus Add to cart \"ALMO_MCM01\" and \"50\""
    },
    {
      "line": 39,
      "value": "#Then goto checkout page"
    },
    {
      "line": 40,
      "value": "#Then Verify Cart With DB"
    },
    {
      "line": 41,
      "value": "#| Catalog | qty |"
    },
    {
      "line": 42,
      "value": "#| ALMO_MCM01     | 100 |"
    },
    {
      "line": 43,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
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
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#| ALMO_MCM01    | 50  |"
    }
  ],
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
