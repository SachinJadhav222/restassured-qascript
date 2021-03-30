Feature: Get GitHub Repost

  Scenario: Git Hub Repos
    Given User set the base API url "https://api.github.com"
    Then User authenticate API request with "833a6ca4f2eae66e1ac4df8ea87f0747a9f1b10d"
    And User sends GET request to get all repos
    Then User validates the response code "200"
