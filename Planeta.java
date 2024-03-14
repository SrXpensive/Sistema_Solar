public class Planeta extends Astro{
    private double distancia_sol;
    private double orbita;
    private Satelite[] satelites;

    public Planeta(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura, double gravedad, double distancia_sol, double orbita) {
        super(nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita = orbita;
    }
    public Planeta(){};
    @Override
    public void muestraDatos() {

    }

    @Override
    public double pesoEnSuperficie(double m) {
        return m*(G*getMasa()/Math.pow(getRadio(),2));
    }

    public double getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }
}
