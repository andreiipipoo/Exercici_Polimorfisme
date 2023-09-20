package Figures;

public class CERCLE extends FIGURA {
    private double r;

    // Constructor
    public CERCLE(double r){
        super(); //Llama al constructor de la clase base
        this.r = r;
    }

    // Método para calcular el área
    public double area(){
        return Math.PI * this.r * this.r;
    }

    // Método de comparar
    public int compareTo(FIGURA figura){
        return super.compareTo(figura);
    }
}
