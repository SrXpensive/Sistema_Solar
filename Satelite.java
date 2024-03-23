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
    public Satelite(){
        super();
        planeta = new Planeta();
    };

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
        System.out.println("Satélite: "+this.getNombre());
        System.out.println("Radio: "+this.getRadio());
        System.out.println("Masa: "+this.getMasa());
        System.out.println("Densidad: "+this.getDensidad());
        System.out.println("Rotación: "+this.getRotacion());
        System.out.println("Temperatura: "+this.getTemperatura());
        System.out.println("Gravedad: "+this.getGravedad());
        System.out.println("Planeta al que pertenece: "+this.getPlaneta().getNombre());
    }

    @Override
    public double pesoEnSuperficie(double m) {
        return m*getGravedad();
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n Masa: "+this.getMasa()+"\n Radio: "+this.getRadio()+"\n Distancia al Planeta: "+this.getDistancia_planeta();
    }
}
