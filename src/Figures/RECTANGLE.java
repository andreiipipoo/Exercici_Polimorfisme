package Figures;

public class RECTANGLE extends FIGURA {
    private double l1; //Lado1 del rectángulo
    private double l2; //Lado2 del rectángulo

    //Constructor que recibe los lados del rectángulo
    public RECTANGLE(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    //Método para calcular el área del rectángulo
    public double area(){
        return this.l1 * this.l2;
    }

    //Método compareTo que compara este rectángulo con otra figura
    public int compareTo(FIGURA figura){
        return super.compareTo(figura);
    }
}
