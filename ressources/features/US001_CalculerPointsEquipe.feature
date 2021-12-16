Feature: US001 Calculer les points d'une equipe
    En tant que Race Director
    Je veux  additionner les points des pilotes de chaque équipe
    Pour obtenir le total de cette dernière

  Scenario Outline: pilote1 gagne la course
    Given l'equipe dont les pilotes sont
    And le pilote1 qui a <points1>
    And le pilote2 qui a <points2>
    When le Race Director calcule les points
    Then le <total> doit etre calculé automatiquement.

    Examples:
      | points1 |  points2 | total |
      | 395     |  190     | 585   |
      | 387     |  226     | 613   |