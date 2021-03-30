Feature: Get GitHub Repost

  Scenario: Git Hub Repos
    Given User set the base API url "https://api.github.com"
    Then User authenticate API request with "git_token"
    And User sends GET request to get all repos
    Then User validates the response code "200"
