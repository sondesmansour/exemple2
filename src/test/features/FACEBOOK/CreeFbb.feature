@tag
Feature: Cree Compte FB

  @tag2
  Scenario Outline: Cree Compte FB
    Given Ovrire navigateur
    And acceder URL "https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fcheckpoint%2Fflow"
    When Cliquer sur button cree nouveau
    And saisir prenom "<prenom>"
    And saisir nom "<nom>"
    And saisir email "<email>"
    And saisir comfEmail "<comfEmail>"
    And saisir password "<password>"
    And saisir jour "<jour>"
    And saisir mois "<mois>"
    And saisir annee "<annee>"
    And choisir et cliquer sur button de genre
    And Cliquer sur button s insecrire

    Examples: 
      | prenom | nom     | email                | comfEmail            | password  | jour | mois | annee |
      | sondes | mansour | sondes.man@gmail.com | sondes.man@gmail.com | sondes123 |   05 |   11 |  1990 |   
