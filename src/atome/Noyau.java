package atome;
public class Noyau
{
    private double masseNoyau;
    private Atome a;

    public Noyau()
    {
        this.masseNoyau = 17 * Math.pow(10, -28);
        this.a = new Atome();
    }

    public double explosionNoyau(int varationElectrons)
    {
        return this.masseNoyau * this.a.chargeAtome(varationElectrons);
    }

    // Setters & getters
    public void setMasseNoyau(double masseNoyau)
    {
        this.masseNoyau = masseNoyau;
    }

    public double getMasseNoyau()
    {
        return this.masseNoyau;
    }

    public void setA(Atome a)
    {
        this.a = a;
    }

    public Atome getA(){
        return this.a;
    }

}
