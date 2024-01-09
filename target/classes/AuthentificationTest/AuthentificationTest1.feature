@tag
Feature: Out Line Authontification

  @tag2
  Scenario Outline: Out Line Authontification
    Given Ovriree Navigateur
    And Ovrire URRL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When SAISIR usernameee "<username>"
    And SAISIR passworddd "<password>"
    And Cliquerrr sur connecter
    Then verifiiier page d accuiel ovrire "<resultat>"

    Examples: 
      | username | password  | resultat    |
      | sondes   | sondes123 | sondes      |
      | Admin    | admin123  | Anya Taylor |
