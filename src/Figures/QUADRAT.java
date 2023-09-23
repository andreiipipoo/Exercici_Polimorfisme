package Figures;

public class QUADRAT extends RECTANGLE{
    //Constructor que recibe el valor de un lado del cuadrado y crea un cuadrado
    public QUADRAT(double l1){
        super(l1,l1);  //Llama al constructor de la clase base (Figures.RECTANGLE) con los mismos lados para crear un cuadrado
    }
    public int compareTo (FIGURA figura){
        return super.compareTo(figura);
    }
}
