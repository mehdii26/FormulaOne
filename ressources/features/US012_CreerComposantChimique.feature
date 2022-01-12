Feature: Creer et nommer un nouveau composant chimique à partir de 2 molécules

  En tant que chimiste
  Je veux lier plusieurs molecules entre-elles
  Afin de creer un nouveau composant chimique dont le nom et la concaténation des noms des molecules

  Scenario Outline: Verifier que le nom du composant correspond a la concatenation des noms des molecules
    Given une molecule de <molecule1>
    And une deuxieme molecule de <molecule2>
    And une dernire molecule de <molecule3>
    When le chimiste les combine pour creer le composant chimique
    Then le <nom_du_composant> est construit a partir de la concatenation des noms des molecules

    Examples:
    | molecule1   | molecule2   | molecule3   | nom_du_composant           |
    | "Carbon"    | "Oxygen"    | "Sodium"    | "Carbon-Oxygen-Sodium"     |
    | "Potassium" | "Lithium"   | "Carbon"    | "Potassium-Lithium-Carbon" |
