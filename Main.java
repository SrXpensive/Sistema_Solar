
import java.util.ArrayList;

public class Main {
    static ArrayList<Planeta> planetas= new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        int op2;
        int op3;
        int op4;
        do{
            System.out.println("1 - Inicializar");
            System.out.println("2 - Registrar planetas y satélites");
            System.out.println("3 - Mostrar información de un astro");
            System.out.println("4 - Mostrar satélites del planeta que se elija");
            System.out.println("5 - Eliminar un planeta que se elija");
            System.out.println("6 - Vaciar el ArrayList");
            System.out.println("0 - Salir");
            System.out.println("---------------");
            opcion = Leer.leerEntero("Introduce una opción: ");
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
                    String nombre = Leer.leerTexto("Introduce el nombre del astro: ");
                    double radio = Leer.leerDouble("Introduce el radio del astro: ");
                    double masa = Leer.leerDouble("Introduce la masa del astro: ");
                    double densidad = Leer.leerDouble("Introduce la densidad del astro: ");
                    double rotacion = Leer.leerDouble("Introduce la rotación del astro: ");
                    double temperatura  = Leer.leerDouble("Introduce la temperatura del astro: ");
                    double gravedad = Leer.leerDouble("Introduce la gravedad del astro: ");
                    double distancia_sol = Leer.leerDouble("Introduce la distancia al Sol o al planeta : ");
                    System.out.println("1 - Planeta");
                    System.out.println("2 - Satélite");
                    op2 = Leer.leerEntero("¿Qué deseas registrar?: ");
                    if (op2 == 1){
                        double orbita = Leer.leerDouble("Introduce la órbita del planeta: ");
                        Planeta p = new Planeta(nombre,radio,masa,densidad,rotacion,temperatura,gravedad,distancia_sol,orbita);
                        planetas.add(p);
                    }else{
                        int orbita = Leer.leerEntero("Introduce la órbita del satélite: ");
                        if(!planetas.isEmpty()){
                            for(int i = 0; i < planetas.size();i++){
                                System.out.println((i+1)+" "+planetas.get(i).getNombre());
                            }
                            op3 = Leer.leerEntero("¿De qué planeta es el satélite?: ");
                            Satelite s = new Satelite(nombre,radio,masa,densidad,rotacion,temperatura,gravedad,distancia_sol,orbita,planetas.get(op3-1));
                            planetas.get(op3-1).getSatelites().add(s);
                        }else
                            System.out.println("No se puede añadir un satélite sin planetas disponibles");
                    }
                    break;
                case 3:
                    int t;
                    int s;
                    System.out.println("1 - Planeta");
                    System.out.println("2 - Satélite");
                    op4 = Leer.leerEntero("¿De qué tipo de astro quieres ver la información?: ");
                    if (op4 == 1){
                        if(!planetas.isEmpty()){
                            for (int i = 0; i < planetas.size(); i ++){
                                System.out.println((i+1)+" "+planetas.get(i).getNombre());
                            }
                            t = Leer.leerEntero("¿De cual de estos planetas?: ");
                            System.out.println(planetas.get(t-1));
                        }else{
                            System.out.println("No hay planetas para mostrar");
                        }
                        break;
                    }else {
                        if(!planetas.isEmpty()){
                            ArrayList<Satelite> satelites = new ArrayList<>();
                            for(int i = 0; i<planetas.size();i++){
                                for(int j = 0; j < planetas.get(i).getSatelites().size();j++){
                                    if(!planetas.get(i).getSatelites().isEmpty()){
                                        satelites.add(planetas.get(i).getSatelites().get(j));
                                    }
                                }
                            }
                            for(int i = 0; i < satelites.size(); i++){
                                System.out.println((i+1)+" "+satelites.get(i).getNombre());
                            }
                            s = Leer.leerEntero("¿De qué satélite quieres ver la información?: ");
                            System.out.println(satelites.get(s-1));
                        }else{
                            System.out.println("No hay satélites para mostrar");
                        }
                    }
                    break;
                case 4:
                    int sat;
                    for(int i = 0; i< planetas.size(); i++){
                        System.out.println((i+1)+" "+planetas.get(i).getNombre());
                    }
                    sat = Leer.leerEntero("¿De qué planeta quieres ver sus satélites?: ");
                    if(!planetas.get(sat-1).getSatelites().isEmpty()){
                        for(int i = 0; i<planetas.get(sat-1).getSatelites().size();i++){
                            System.out.println(planetas.get(sat-1).getSatelites().get(i));
                        }
                    }else{
                        System.out.println("El planeta seleccionado no tiene satélites para mostrar");
                    }
                    break;
                case 5:
                    int del;
                    int conf;
                    for (int i = 0; i < planetas.size(); i++){
                        System.out.println((i+1)+" "+planetas.get(i).getNombre());
                    }
                    del = Leer.leerEntero("¿Qué planeta quieres eliminar?: ");
                    System.out.println("1 - Si");
                    System.out.println("2 - No");
                    conf = Leer.leerEntero("¿Estás seguro de querer borrar el planeta "+planetas.get(del-1).getNombre()+"?: ");
                    if(conf == 1){
                        planetas.remove(del-1);
                        System.out.println("Planeta eliminado");
                    }else{
                        System.out.println("Proceso de eliminación abortado");
                    }
                    break;
                case 6:
                    if(!planetas.isEmpty()){
                        planetas.clear();
                        System.out.println("Lista de planetas vacía");
                    }else{
                        System.out.println("No hay planetas que borrar");
                    }
                    break;
            }
        }while(opcion !=0);


    }
}