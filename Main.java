import java.util.ArrayList;

public class Main {
    static ArrayList<Planeta> planetas= new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1 - Inicializar");
            System.out.println("2 - Registrar planetas y satélites");
            System.out.println("3 - Mostrar información de un astro");
            System.out.println("4 - Mostrar satélites del planeta que se elija");
            System.out.println("5 - Eliminar un planeta que se elija");
            System.out.println("6 - Vaciar el ArrayList");
            System.out.println("0 - Salir");
            System.out.println("---------------");
            opcion = leer.Leer.leerEntero("Introduce una opción: ");
            switch(opcion){
                case 1:
                    Planeta p1 = new Planeta("Tierra",3456,4567.32,435326,747474,31,9.98,1465632,64737);
                    planetas.add(p1);
                    Planeta p2 = new Planeta("Marte",2222,987.32,2314,7398,40,7.43,314556,23110);
                    planetas.add(p2);
                    Satelite s1 = new Satelite("Luna",466,1234,64758,8867,34.2,3.46,67892,4356,p1);
                    p1.getSatelites().add(s1);
                    Satelite s2 = new Satelite("Fobos",4356,9876,6378,729,14.3,5.998,21345,8546,p2);
                    p2.getSatelites().add(s2);
                break;
                case 2:

            }

        }while(opcion !=0);


    }
}