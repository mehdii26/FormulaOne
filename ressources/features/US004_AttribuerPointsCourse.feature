Feature: US004 Attribuer les points aux pilotes selon le classement
  En tant que Race Director
  Je veux attribuer des points à chaque chaffeur selon son classement dans la course
  Pour mettre à jour les totaux de chaque pilote et de chaque équipe

  Scenario Outline: Attribuer les points aux 1er et 2eme de la course
    Given la derniere course de l'annee
    And le pilote1 qui avait <points1> points avant la course a gagne
    And le pilote2 qui avait <points2> points avant la course est deuxieme
    When le Race Director attribue les points de la course
    Then le <pointsFinaux1> et <pointsFinaux2> doivent etre calculés automatiquement.

    Examples:
      | points1 |  pointsFinaux1  | points2 | pointsFinaux2 |
      | 370     |  395            | 370     | 388           |
      | 322     |  347            | 340     | 358           |