Feature: Choisir un pneu optimal

  En tant que directeur de stratégie
  Je veux pouvoir comparer des pneus
  Afin de choisir le plus performant

  Scenario Outline: Comparer des pneus
    Given l'essai numero <essai1> avec <pneu1>
    And et l'essai numero <essai2> avec <pneu2>
    When <duree1> de essai1 est inferieur a <duree2> de essai2
    Then le <pneuChoisi> est selectionne automatiquement

    Examples:
      | essai1 | duree1 | pneu1    | essai2 | duree2 | pneu2    | pneuChoisi |
      | 1      | 80     | "soft"   | 2      | 90     | "medium" | "soft"     |
      | 3      | 90     | "medium" | 4      | 100    | "hard"   | "medium"   |