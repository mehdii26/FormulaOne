package atome;

public class Noyau {
    private double masseNoyau;

    public Noyau()
    {
        this.masseNoyau = 17 * Math.pow(10, -28);
    }

    public double explosionNoyau(Atome a, int varationElectrons)
    {
        return this.masseNoyau * a.chargeAtome(varationElectrons);
    }

    // Setters & getters
    public void setMasseNoyau(double masseNoyau){
        this.masseNoyau = masseNoyau;
    }

    public double getMasseNoyau(){
        return this.masseNoyau;
    }
}
