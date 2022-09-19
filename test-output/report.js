$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberJava.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@myAutomationPractice"
    }
  ]
});
formatter.scenarioOutline({
  "line": 32,
  "name": "Purchase An Item from List",
  "description": "",
  "id": "title-of-your-feature;purchase-an-item-from-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@PurchaseItem"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I enter the website url in the webpage\"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "I enter the website email id \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I add item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I navigate to purchase page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I verify the added product",
  "keyword": "Then "
});
formatter.examples({
  "line": 39,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;purchase-an-item-from-list;",
  "rows": [
    {
      "cells": [
        "url",
        "email",
        "password"
      ],
      "line": 40,
      "id": "title-of-your-feature;purchase-an-item-from-list;;1"
    },
    {
      "cells": [
        "https://automationpractice.com/index.php",
        "test123const@test.com",
        "12345"
      ],
      "line": 41,
      "id": "title-of-your-feature;purchase-an-item-from-list;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3312114100,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Purchase An Item from List",
  "description": "",
  "id": "title-of-your-feature;purchase-an-item-from-list;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@myAutomationPractice"
    },
    {
      "line": 31,
      "name": "@PurchaseItem"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I enter the website url in the webpage\"https://automationpractice.com/index.php\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "I enter the website email id \"test123const@test.com\" and password \"12345\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I add item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I navigate to purchase page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I verify the added product",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://automationpractice.com/index.php",
      "offset": 39
    }
  ],
  "location": "SD_PurchaseItem.i_enter_the_website_url_in_the_webpagesomething(String)"
});
formatter.result({
  "duration": 16648446700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123const@test.com",
      "offset": 30
    },
    {
      "val": "12345",
      "offset": 67
    }
  ],
  "location": "SD_PurchaseItem.i_enter_the_website_email_id_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 21579459400,
  "status": "passed"
});
formatter.match({
  "location": "SD_PurchaseItem.i_add_item_to_the_cart()"
});
formatter.result({
  "duration": 13467547900,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d105.0.5195.127)\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027LAPTOP-5Q4IR8MI\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [b88f54a01420c563138bdcaa7461eca2, clickElement {id\u003d87cb3352-97c7-4a79-b966-6262bff3961e}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\ganes\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58580}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:58580/devtoo..., se:cdpVersion: 105.0.5195.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (b88f54a01420c563138bdcaa7461eca2)] -\u003e xpath: //a[@title\u003d\u0027Proceed to checkout\u0027]]\nSession ID: b88f54a01420c563138bdcaa7461eca2\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat pageObject.PurchaseItem.addProd(PurchaseItem.java:85)\r\n\tat stepDefinition.SD_PurchaseItem.i_add_item_to_the_cart(SD_PurchaseItem.java:30)\r\n\tat ✽.And I add item to the cart(cucumberJava.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SD_PurchaseItem.i_navigate_to_purchase_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SD_PurchaseItem.i_verify_the_added_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 559902500,
  "status": "passed"
});
});