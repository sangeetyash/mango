$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "R-PAC Mango CRM E-Coomerece Feature",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 751,
  "name": "Normal and show confirm order in shopping cart check back forth operations also change qty both orders",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;normal-and-show-confirm-order-in-shopping-cart-check-back-forth-operations-also-change-qty-both-orders",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 750,
      "name": "@testcase119"
    }
  ]
});
formatter.step({
  "line": 753,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 754,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 755,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 756,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 757,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 758,
  "name": "Search Release PO page with CPO ID \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 759,
  "name": "Search supplier ID \"1572\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 760,
      "value": "#Then click on PO \"6140\" and select overage \"3\""
    }
  ],
  "line": 761,
  "name": "click on PO \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 762,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 763
    },
    {
      "cells": [
        "8445306386038",
        "50"
      ],
      "line": 764
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 765,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 766,
  "name": "Show confirm orders",
  "keyword": "Then "
});
formatter.step({
  "line": 767,
  "name": "With Confirm orders,Search Release PO page with CPO ID \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 768,
  "name": "Search supplier ID \"1471\"",
  "keyword": "Then "
});
formatter.step({
  "line": 769,
  "name": "click on PO \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 770,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 771
    },
    {
      "cells": [
        "8445306619587",
        "480"
      ],
      "line": 772
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 773,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 774,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 775,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 776,
  "name": "Click on CPO \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 777,
  "name": "Deselect all",
  "keyword": "Then "
});
formatter.step({
  "line": 778,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 779
    },
    {
      "cells": [
        "8445306386045",
        "140"
      ],
      "line": 780
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 781,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 782,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 783,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 784,
  "name": "Click on CPO \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 785,
  "name": "Deselect all",
  "keyword": "Then "
});
formatter.step({
  "line": 786,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 787
    },
    {
      "cells": [
        "8445306619556",
        "1200"
      ],
      "line": 788
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 789,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 790,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 791,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 792,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 793,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 794,
  "name": "Verify All RPO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 795,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 796,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 797,
      "value": "#Then Search for PO \"7R53\""
    },
    {
      "line": 798,
      "value": "#Then Search for PO \"7R06\""
    },
    {
      "line": 799,
      "value": "# Search for PO \"6107\" and Check Status \"Processing\""
    }
  ],
  "line": 800,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 801,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 803,
  "name": "",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;normal-and-show-confirm-order-in-shopping-cart-check-back-forth-operations-also-change-qty-both-orders;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 804,
      "id": "r-pac-mango-crm-e-coomerece-feature;normal-and-show-confirm-order-in-shopping-cart-check-back-forth-operations-also-change-qty-both-orders;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 805,
      "id": "r-pac-mango-crm-e-coomerece-feature;normal-and-show-confirm-order-in-shopping-cart-check-back-forth-operations-also-change-qty-both-orders;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 805,
  "name": "Normal and show confirm order in shopping cart check back forth operations also change qty both orders",
  "description": "",
  "id": "r-pac-mango-crm-e-coomerece-feature;normal-and-show-confirm-order-in-shopping-cart-check-back-forth-operations-also-change-qty-both-orders;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 750,
      "name": "@testcase119"
    }
  ]
});
formatter.step({
  "line": 753,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 754,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 755,
  "name": "user enters \"Test@123.com\" and \"User@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 756,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 757,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 758,
  "name": "Search Release PO page with CPO ID \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 759,
  "name": "Search supplier ID \"1572\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 760,
      "value": "#Then click on PO \"6140\" and select overage \"3\""
    }
  ],
  "line": 761,
  "name": "click on PO \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 762,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 763
    },
    {
      "cells": [
        "8445306386038",
        "50"
      ],
      "line": 764
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 765,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 766,
  "name": "Show confirm orders",
  "keyword": "Then "
});
formatter.step({
  "line": 767,
  "name": "With Confirm orders,Search Release PO page with CPO ID \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 768,
  "name": "Search supplier ID \"1471\"",
  "keyword": "Then "
});
formatter.step({
  "line": 769,
  "name": "click on PO \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 770,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 771
    },
    {
      "cells": [
        "8445306619587",
        "480"
      ],
      "line": 772
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 773,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 774,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 775,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 776,
  "name": "Click on CPO \"8R07\"",
  "keyword": "Then "
});
formatter.step({
  "line": 777,
  "name": "Deselect all",
  "keyword": "Then "
});
formatter.step({
  "line": 778,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 779
    },
    {
      "cells": [
        "8445306386045",
        "140"
      ],
      "line": 780
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 781,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 782,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 783,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 784,
  "name": "Click on CPO \"8024\"",
  "keyword": "Then "
});
formatter.step({
  "line": 785,
  "name": "Deselect all",
  "keyword": "Then "
});
formatter.step({
  "line": 786,
  "name": "Select PO items based on EAN plus edit order qty",
  "rows": [
    {
      "cells": [
        "EAN",
        "qty"
      ],
      "line": 787
    },
    {
      "cells": [
        "8445306619556",
        "1200"
      ],
      "line": 788
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 789,
  "name": "Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 790,
  "name": "goto checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 791,
  "name": "Verify All PO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 792,
  "name": "Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date",
  "keyword": "Then "
});
formatter.step({
  "line": 793,
  "name": "Confirm Order",
  "keyword": "Then "
});
formatter.step({
  "line": 794,
  "name": "Verify All RPO data with db",
  "keyword": "Then "
});
formatter.step({
  "line": 795,
  "name": "Print Confirmation and done",
  "keyword": "Then "
});
formatter.step({
  "line": 796,
  "name": "Goto Report\u003eOrder Status",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 797,
      "value": "#Then Search for PO \"7R53\""
    },
    {
      "line": 798,
      "value": "#Then Search for PO \"7R06\""
    },
    {
      "line": 799,
      "value": "# Search for PO \"6107\" and Check Status \"Processing\""
    }
  ],
  "line": 800,
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 801,
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
  "duration": 17524089200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 19977600,
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
  "duration": 24799978200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 162000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 611700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8R07",
      "offset": 36
    }
  ],
  "location": "LoginStepDefinition.Release_PO_page(String)"
});
formatter.result({
  "duration": 33155999100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1572",
      "offset": 20
    }
  ],
  "location": "LoginStepDefinition.SuppilerSearch(String)"
});
formatter.result({
  "duration": 3137835400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8R07",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.POClickb(String)"
});
formatter.result({
  "duration": 11535706000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getEANSelectEditQty(DataTable)"
});
formatter.result({
  "duration": 6139258800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getAddtocart()"
});
formatter.result({
  "duration": 20918502300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getShowConfirmOrders()"
});
formatter.result({
  "duration": 4390122300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8024",
      "offset": 56
    }
  ],
  "location": "LoginStepDefinition.Confirm_Release_PO_page(String)"
});
formatter.result({
  "duration": 30827918700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1471",
      "offset": 20
    }
  ],
  "location": "LoginStepDefinition.SuppilerSearch(String)"
});
formatter.result({
  "duration": 3104363700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8024",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.POClickb(String)"
});
formatter.result({
  "duration": 11587000800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getEANSelectEditQty(DataTable)"
});
formatter.result({
  "duration": 6092495200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getAddtocart()"
});
formatter.result({
  "duration": 18760934900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3509721900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyAllPOData()"
});
formatter.result({
  "duration": 7059057100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8R07",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.clickoncartCPO(String)"
});
formatter.result({
  "duration": 7552929600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getDeselect()"
});
formatter.result({
  "duration": 3034784900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getEANSelectEditQty(DataTable)"
});
formatter.result({
  "duration": 4901238800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getAddtocart()"
});
formatter.result({
  "duration": 17926765200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3301991200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyAllPOData()"
});
formatter.result({
  "duration": 6925293700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8024",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.clickoncartCPO(String)"
});
formatter.result({
  "duration": 7571786900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getDeselect()"
});
formatter.result({
  "duration": 3036582800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getEANSelectEditQty(DataTable)"
});
formatter.result({
  "duration": 5893659400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.getAddtocart()"
});
formatter.result({
  "duration": 18900229700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.goto_checkout()"
});
formatter.result({
  "duration": 3174344500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyAllPOData()"
});
formatter.result({
  "duration": 6821291800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.select_checkout_details()"
});
formatter.result({
  "duration": 10479938100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.confirm_order()"
});
formatter.result({
  "duration": 23294197200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyAllRPOData()"
});
formatter.result({
  "duration": 5075635100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.print_confirmation_done()"
});
formatter.result({
  "duration": 209600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.order_status_check()"
});
formatter.result({
  "duration": 43541695000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 17602832800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 4229858700,
  "status": "passed"
});
});