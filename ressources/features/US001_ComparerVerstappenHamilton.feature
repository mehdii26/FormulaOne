@tag
  Feature: US001 Comparer les points de Verstappen et Hamilton
    En tant que Race Director
    Je veux comparer les points de Verstappen et Hamilton
    Afin de connaitre qui est le champion

    Scenario Outline: Verstappen est champion
      Given les pilotes <pliote1> qui a <points1> et <pilote2> qui a <points2>
      When <points1> superieur à <points2>
      Then le <isChampion> est true

      Examples:
      | pilote1      | points1 | pilote2    | points2 | isChampion |
      | "Verstappen" | 395     | "Hamilton" | 387     | true       |