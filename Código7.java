import java.util.HashMap;
import java.util.Scanner;

public class Código7 {

	public static void main(String[] args) {// se agrego el main
    Scanner s = new Scanner(System.in);// se importo el scanner

    HashMap<String, String> capitales = new HashMap<>();// se importo HashMap, se cambio ca por capitales y se puso sstring en ves double y byte
    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador","San Salvador");//se agrego capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = "";// se corrigio palabra
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");//se cambio in por out
      c = s.nextLine();// se cambio nextDouble() por nextLine()
      
      if (!c.equals("salir")) {// se corrigio equal que le faltaba la s
        if (capitales.containsKey(c)) {//se cambio ca por capitales y values por key
          System.out.print("La capital de " + c);//se agrego el out
          System.out.println(" es " + capitales.get(c));//se cambio ca por la variable capitales y se cambio put por get
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);// se cambio ca por capitales
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//se corrigio la palabra while y parentesis
  }
}
