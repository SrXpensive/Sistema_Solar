public class Satelite extends Astro{
    private double distancia_planeta;
    private int orbita;
    private Planeta planeta;

    public Satelite(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura, double gravedad, double distancia_planeta, int orbita, Planeta planeta) {
        super(nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita = orbita;
        this.planeta = planeta;
    }
    public Satelite(){};

    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public int getOrbita() {
        return orbita;
    }

    public void setOrbita(int orbita) {
        this.orbita = orbita;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public void muestraDatos() {

    }

    @Override
    public double pesoEnSuperficie(double m) {
        return m*getGravedad();
    }
}
