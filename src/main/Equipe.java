package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {
    private String nom;
    private int points;
    private boolean isChampion;
    private List <Pilote> pilotes;

    public Equipe() {
        this.nom = "";
        this.points = 0;
        this.pilotes = new ArrayList<Pilote>();
        this.isChampion = false;

    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public List<Pilote> getPilotes() {
        return pilotes;
    }
    public void setPilotes(List<Pilote> pilotes) {
        this.pilotes = pilotes;
    }


    public boolean winChampionshipConstructeur(List<Integer> pointsConstructeurs) {
        if(this.points == Collections.max(pointsConstructeurs)) this.isChampion = true;
        else this.isChampion = false;

        return this.isChampion;
    }



}
