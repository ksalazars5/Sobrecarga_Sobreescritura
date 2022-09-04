package Operacion_Suma;

public class Operacion_Suma {
    public void sumaTotal(int valor1, int valor2){ //Metodo 1
        int resultado = valor1 + valor2;
        System.out.println("El resultado es: "+resultado);
    }

    public void sumaTotal(double v1, double v2){ //Sobrecarga del metodo 1
        double result = v1 + v2;
        System.out.println("\nEl resultado es: "+result);
    }

    public interface Main {
        void sumaTotal(int valor1, int valor2);

        void sumaTotal(double v1, double v2);
    }
}
