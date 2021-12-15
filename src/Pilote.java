import java.util.List;
import java.util.*;

public class Pilote {
    // variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
    private int points;
    private boolean isChampion;
    private boolean isWinner;



    private Equipe equipe;


    /**
     * Constructeur d'objets de classe SuperMax
     */
    public Pilote()
    {
        // initialisation des variables d'instance
        points = 0;
        isChampion = false;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getPoints(){
        return this.points;
    }

    public boolean getIsChampion(){
        return this.isChampion;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public void setIsChampion(boolean isChampion){
        this.isChampion = isChampion;
    }

    public boolean beat(Pilote pilote){
        if(this.points > pilote.getPoints()){
            this.isWinner = true;
            pilote.setIsChampion(false);
        }
        else{
            this.isWinner = false;
            pilote.setIsChampion(true);
        }

        return this.isWinner;
    }

    public boolean winChampionshipPilote(List<Integer> pointsPilotes) {

        if(this.points == Collections.max(pointsPilotes)) this.isChampion = true;
        else this.isChampion = false;

        return this.isChampion;
    }

}
