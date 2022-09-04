package Operacion_Suma;

public class Valores implements Operacion_Suma.Main {

    @Override
    public void sumaTotal(int valor1, int valor2){ //Metodo 1 y sobrecarga del metodo
        int resultado = valor1 + valor2;
        System.out.println(resultado);
    }


    @Override
    public void sumaTotal(double v1, double v2){ //Sobrecarga del metodo 1
        double result = v1 + v2;
        System.out.println(result);
    }
}
