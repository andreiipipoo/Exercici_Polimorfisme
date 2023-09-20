package Figures;

public class TRIANGLE extends FIGURA {
    private double base; //Base del triángulo
    private double altura; //Altura del triángulo

    //Constructor
    public TRIANGLE(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    //Método para calcular el área del triángulo (base * altura / 2)
    public double area() {
        return this.base * this.altura / 2;
    }

    //Método compareTo que compara este triángulo con otra figura

    public int compareTo (FIGURA figura){
        return super.compareTo(figura);
    }
}
