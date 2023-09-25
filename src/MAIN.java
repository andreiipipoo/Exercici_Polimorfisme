import Figures.*;


public class MAIN {
    public static void main(String[] args) {
        FIGURA[] v = new FIGURA[5];

        v[0] = new RECTANGLE(5,3);
        v[1] = new CERCLE(5);
        v[2] = new QUADRAT(5);
        v[3] = new CERCLE(120);
        v[4] = new TRIANGLE(2,3);

        //Se recoge el resultado del método suma en el gestor de figuras
        double res = GESTOR_FIGURES.suma(v);
        //Se llama al método sort en gestor de figuras (Éste ordena y muestra en pantalla el valor de las áres de forma
        //ordenada, en sentido ascendente)
        GESTOR_FIGURES.sort(v);

        //Imprimir info de las figures
        System.out.println("Valor de las áreas en orden ascendente: ");

        for(FIGURA figura : v){
            String nombre = figura.getClass().getSimpleName();
            double area = figura.area();
            System.out.printf("Figura: %s -> Area: %.2f%n",nombre, area);
        }
        System.out.printf("SUMA TOTAL: %.3f%n", res);
    }
}
