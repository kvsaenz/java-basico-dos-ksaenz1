package src;

public class Main {
    public static void main(String[] args) {
        // Sumar los numeros de 1 a 10 usando while

        int sumaTotal = 0;
        int i = 1;
        while (i <= 10){
            sumaTotal = sumaTotal + i;
            i++;
        }
        System.out.println("la suma total de los numeros de 1 a 10, usando un while fue: " + sumaTotal);
    }
}