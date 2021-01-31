$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("alvoromareno.feature");
formatter.feature({
  "line": 1,
  "name": "R-PACMango.com CRM E-Coomerece Feature Main Finish..",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Login Validations",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;login-validations",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@testcaseA004"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Login validation check",
  "rows": [
    {
      "cells": [
        "User",
        "Password"
      ],
      "line": 35
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 36
    },
    {
      "cells": [
        "sadsd",
        "100"
      ],
      "line": 37
    },
    {
      "cells": [
        "User@alvaromorono.com",
        ""
      ],
      "line": 38
    },
    {
      "cells": [
        "User@alvaromorono.com",
        "asdasdsd"
      ],
      "line": 39
    },
    {
      "cells": [
        "User@alvaromorono.com",
        "User@123"
      ],
      "line": 40
    }
  ],
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
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 45,
      "value": "#Then user enters credentials"
    },
    {
      "line": 46,
      "value": "#| admin@AlvaroMoreno.com | Lousie#786 |"
    },
    {
      "line": 47,
      "value": "#Then user enters \"admin@AlvaroMoreno.com\" and \"Lousie#786\""
    }
  ],
  "line": 49,
  "name": "",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;login-validations;",
  "rows": [
    {
      "cells": [
        "items",
        "udateitems"
      ],
      "line": 50,
      "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;login-validations;;1"
    },
    {
      "cells": [
        "1111",
        "2222"
      ],
      "line": 51,
      "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;login-validations;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 51,
  "name": "Login Validations",
  "description": "",
  "id": "r-pacmango.com-crm-e-coomerece-feature-main-finish..;login-validations;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@testcaseA004"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Navigate user to Login Page \"http://devrtrac.r-pac.com/\" and \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Login validation check",
  "rows": [
    {
      "cells": [
        "User",
        "Password"
      ],
      "line": 35
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 36
    },
    {
      "cells": [
        "sadsd",
        "100"
      ],
      "line": 37
    },
    {
      "cells": [
        "User@alvaromorono.com",
        ""
      ],
      "line": 38
    },
    {
      "cells": [
        "User@alvaromorono.com",
        "asdasdsd"
      ],
      "line": 39
    },
    {
      "cells": [
        "User@alvaromorono.com",
        "User@123"
      ],
      "line": 40
    }
  ],
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
  "name": "Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
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
      "val": "chrome",
      "offset": 62
    }
  ],
  "location": "LoginStepDefinition.navigateUser(String,String)"
});
formatter.result({
  "duration": 20212537600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 13684500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.loginValidations(DataTable)"
});
formatter.result({
  "duration": 73517817800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 71800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 68700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logout()"
});
formatter.result({
  "duration": 18042193400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 3668357800,
  "status": "passed"
});
});