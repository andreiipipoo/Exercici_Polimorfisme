package Figures;

public abstract class FIGURA implements Comparable<FIGURA>{
    //*Abstract* no se pueden crear objetos de esta clase
    //Una clase abstracta para Java es una clase de la que nunca se van a crear instancias:
    // simplemente va a servir como superclase a otras clases

    //Constructor por defecto
    public FIGURA(){

    }

    //Método abstracto que debe ser implementado por las subclases para calcular el área
    public abstract double area();

    // Método de comparación que compara dos figuras por su área
    // @return Un valor negativo si esta figura es menor, un valor positivo si es mayor, y 0 si son iguales.
    public int compareTo(FIGURA figura){
        return (int) (this.area()-figura.area());
    }
}
