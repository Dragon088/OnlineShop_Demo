$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature_Files/Test.feature");
formatter.feature({
  "name": "Purchase of online products through product categories: Phones, Laptops and Monitors",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Demo"
    }
  ]
});
formatter.scenario({
  "name": "Purchase functionality of online products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on landing page of online shop demoblaze",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.i_am_on_landing_page_of_online_shop_demoblaze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Laptop and select Sony vaio i5 product",
  "keyword": "When "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.navigate_to_Laptop_and_select_Sony_vaio_i_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accept pop up confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.accept_pop_up_confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on home page icon",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_home_page_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Laptop and select Dell i7 8gb product",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.navigate_to_Laptop_and_select_Dell_i_gb_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accept pop up confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.accept_pop_up_confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on cart",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Delete Dell i7 8gb from cart",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_Delete_Dell_i_gb_from_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Place order",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_Place_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill in all web form fields",
  "rows": [
    {
      "cells": [
        "name",
        "country",
        "city",
        "creditcard",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "Arun",
        "india",
        "noida",
        "5625625655",
        "4",
        "2020"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.fill_in_all_web_form_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Purchase",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_Purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture and log purchase Id and Amount",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.capture_and_log_purchase_Id_and_Amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that purchase amount equals expected",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.verify_that_purchase_amount_equals_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok",
  "keyword": "And "
});
formatter.match({
  "location": "DemoBlaze_StepDefinition.click_on_ok()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});