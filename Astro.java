public abstract class Astro {
    private String nombre;
    private double radio;
    private double masa;
    private double densidad;
    private double rotacion;
    private double temperatura;
    private double gravedad;
    public static final double G = 6.67384*Math.pow(10,-11);
    public Astro(String nombre, double radio, double masa, double densidad, double rotacion, double temperatura, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.masa = masa;
        this.densidad = densidad;
        this.rotacion = rotacion;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }
    public Astro(){}
    
    public String getNombre() {
        return nombre;
    }

    public double getRadio() {
        return radio;
    }

    public double getMasa() {
        return masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getRotacion() {
        return rotacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }
    public abstract void muestraDatos();
    public abstract double pesoEnSuperficie(double m);

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
}
