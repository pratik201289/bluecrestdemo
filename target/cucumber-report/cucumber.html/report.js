$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Test",
  "description": "As user I want to verify the About Us Page\n\nScenario : User should navigate to about us page successfully\n  Given I click on accept link\n  When I am on homepage\n  And I click on about us link\n  Then I should navigate to about us page successfully",
  "id": "homepage-test",
  "keyword": "Feature"
});
});