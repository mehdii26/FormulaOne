package main;

public class Course {
    // variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
    private Pilote winner;
    private Pilote second;
    private Pilote third;
    private Pilote fourth;
    private Pilote fifth;
    private Pilote sixth;
    private Pilote seventh;
    private Pilote eighth;
    private int newPoints;

    public Pilote getSecond() {
        return second;
    }


    public void setSecond(Pilote second) {
        this.second = second;
    }


    public Pilote getThird() {
        return third;
    }


    public void setThird(Pilote third) {
        this.third = third;
    }


    public Pilote getFourth() {
        return fourth;
    }


    public void setFourth(Pilote fourth) {
        this.fourth = fourth;
    }


    public Pilote getFifth() {
        return fifth;
    }


    public void setFifth(Pilote fifth) {
        this.fifth = fifth;
    }


    public Pilote getSixth() {
        return sixth;
    }


    public void setSixth(Pilote sixth) {
        this.sixth = sixth;
    }


    public Pilote getSeventh() {
        return seventh;
    }


    public void setSeventh(Pilote seventh) {
        this.seventh = seventh;
    }


    public Pilote getEighth() {
        return eighth;
    }


    public void setEighth(Pilote eighth) {
        this.eighth = eighth;
    }


    /**
     * Constructeur d'objets de classe main.Course
     */



    public Pilote getWinner(){
        return this.winner;
    }

    public Course(Pilote winner, Pilote second, Pilote third, Pilote fourth, Pilote fifth, Pilote sixth, Pilote seventh,
                  Pilote eighth) {
        super();
        this.winner = winner;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
    }


    public void setWinner(Pilote pilote){
        this.winner = pilote;
    }


    public void Classement(Pilote pilote){
        int newPoints = 0;

        if (pilote == winner) newPoints = 25;
        if (pilote == second) newPoints = 18;
        if (pilote == third) newPoints = 15;
        if (pilote == fourth) newPoints = 12;
        if (pilote == fifth) newPoints = 10;
        if (pilote == sixth) newPoints = 8;
        if (pilote == seventh) newPoints = 6;
        if (pilote == eighth) newPoints = 4;

        pilote.setPoints(pilote.getPoints() + newPoints);
        pilote.getEquipe().setPoints( pilote.getEquipe().getPoints() + newPoints);
    }

}
