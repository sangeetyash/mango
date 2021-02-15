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
