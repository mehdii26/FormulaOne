
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
     * Constructeur d'objets de classe Course
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
        if (pilote == winner) pilote.setPoints(25);
        if (pilote == second) pilote.setPoints(18);
        if (pilote == third) pilote.setPoints(15);
        if (pilote == fourth) pilote.setPoints(12);
        if (pilote == fifth) pilote.setPoints(10);
        if (pilote == sixth) pilote.setPoints(8);
        if (pilote == seventh) pilote.setPoints(6);
        if (pilote == eighth) pilote.setPoints(4);


    }

}
