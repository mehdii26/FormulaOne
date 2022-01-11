Feature: Trier les atomes d'une molécule

  En tant que chimiste
  Je veux pouvoir trier les atomes d'une molécule
  Afin d'avoir une vision claire du contenu de la molécule

  Scenario: Tri des atomes
    Given une molécule contenant plusieurs atomes
    When je choisis de trier les atomes selon l'ordre alphabétique
    Then j'obtiens une nouvelle liste ordonnancée