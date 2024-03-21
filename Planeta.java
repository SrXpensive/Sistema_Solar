import java.util.ArrayList;

public class Planeta extends Astro{
    private double distancia_sol;
    private double orbita;
    private ArrayList<Satelite> satelites;

    public Planeta(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura, double gravedad, double distancia_sol, double orbita) {
        super(nombre, radio, masa, densidad, rotacion, temperatura, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita = orbita;
    }
    public Planeta(){
        super();
        satelites = new ArrayList<>();
    };
    @Override
    public void muestraDatos() {
        System.out.println("Planeta: "+getNombre());
        System.out.println("Radio: "+getRadio());
        System.out.println("Masa: "+getMasa());
        System.out.println("Densidad: "+getDensidad());
        System.out.println("Rotación: "+getRotacion());
        System.out.println("Temperatura: "+getTemperatura());
        System.out.println("Gravedad: "+getGravedad());
        if (getSatelites().isEmpty()){
            System.out.println("No tiene satélites");
        }else{
            System.out.println("Satélites: ");
            for(int i = 0; i < getSatelites().size(); i++){
                System.out.println(getSatelites().get(i).getNombre());
            }
        }
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n Masa: "+this.getMasa()+"\n Radio: "+this.getRadio()+"\n Distancia al Sol: "+this.getDistancia_sol();
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

    public ArrayList<Satelite> getSatelites() {return satelites;}
    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }
}
