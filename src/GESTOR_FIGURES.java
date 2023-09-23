import java.util.Arrays;
import Figures.FIGURA;
public class GESTOR_FIGURES {
    //Creamos el método suma utilizado en el main para obtener la suma de las áreas
    public static double suma(FIGURA [] figura){
        double suma_areas = 0;
        //"for" para sumar todas las áreass
        for (FIGURA figura1 : figura){
            //Se va haciendo la summa en la variable suma_areas
            suma_areas += figura1.area();
            //Se muestra en pantalla el valor de cada área
            System.out.println("Area: " + figura1.area());
        }
        //Devuelve el resultado se la suma
        return suma_areas;
    }
    //Método para ordenar las áres en sentido ascendente
    public static void sort(FIGURA[] figura){
        //Desde aquí se llama a compareTo
        Arrays.sort(figura);
        System.out.println("Valor de las áres en orden ascendente: ");
        //Se crea un for para repasar todas las áreas (ya ordenadas) y mostrar en pantalla el valor de cada área
        for(FIGURA figura1 : figura){
            double area = figura1.area();
            System.out.println("Valor del área: " + area);
        }
    }
}
