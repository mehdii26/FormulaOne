Feature: Changement de nom

  En tant que nomenclaturier
  Je veux pouvoir changer le nom de mes molécules
  Afin de correspondre à la norme imposée du moment

  Scenario: Changer la façon d'écrire le nom des molécules
    Given une molécule au hasard
    When je change la nomenclature
    Then le nom de la molécule est changé