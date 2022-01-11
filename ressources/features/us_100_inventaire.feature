Feature: Inventaire annuel

  En tant que chimiste
  Je veux pouvoir compter mes éléments dans mon inventaire
  Afin de créer de nouvelles molécules avec le bon nombre d'éléments

  Scenario Outline: Vérifier le nombre d'éléctrons dans une molécule d'hydrogène et de lithium
    Given un atome d'hydrogene et un atome de lithium
    And un nombre d'électrons modifié de <nbElectrons1>
    And un nombre d'électrons modifié de <nbElectrons2>
    When l'utilisateur compte les éléctrons après un calcul de charge
    Then il nous reste un <total> éléctrons

    Examples:
      | nbElectrons1 | nbElectrons2 | total |  |  |  |
      | -1           | 2            | 5     |  |  |  |
      | 4            | 0            | 8     |  |  |  |


  Scenario: Vérifier que le nombre de neutrons dans une molécule
    Given une molécule
    When l'utilisateur compte les neutrons, dans le doute même si ça ne sert à rien
    Then nous aurons un total de neutrons qui ne changera rien à la charge de notre molécule