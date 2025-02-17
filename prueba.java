import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el numero: ");
            int numero = sc.nextInt();
            if (numero % 2 != 0) {throw new Exception("El numero es impar");}
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}