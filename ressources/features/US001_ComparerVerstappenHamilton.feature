Feature: US001 Comparer les points de Verstappen et Hamilton
    En tant que Race Director
    Je veux comparer les points de Verstappen et Hamilton
    Afin de connaitre qui est le champion

    Scenario Outline: Verstappen est champion
      Given l'equipe dont les pilotes sont
      And le pilote <pilote1> qui a <points1>
      And le pilote <pilote2> qui a <points2>
      When le Race Director calcule les points
      Then le <total> doit etre calculé automatiquement.

      Examples:
      | pilote1      | points1 | pilote2  | points2 | total |
      | "verstappen" | 395     | "checo"  | 190     | 585   |
      | "hamilton"   | 387     | "bottas" | 226     | 613   |