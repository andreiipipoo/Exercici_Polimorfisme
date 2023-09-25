import java.util.Arrays;
import Figures.FIGURA;
public class GESTOR_FIGURES {
    //Constructor vacío
    public GESTOR_FIGURES(){

    }
    //Creamos el método suma utilizado en el main para obtener la suma de las áreas
    public static double suma(FIGURA[] figura){
        double suma_areas = 0;
        //"for" para sumar todas las áreas
        for (FIGURA figura1 : figura){
            //Se va haciendo la suma en la variable suma_areas
            suma_areas += figura1.area();
        }
        //Devuelve el resultado se la suma
        return suma_areas;
    }

    //Método para ordenar las áreas en sentido ascendente
    public static void sort(FIGURA[] figura){
        //Desde aquí se llama a compareTo
        Arrays.sort(figura);
    }
}
