import java.util.Scanner;

public class prueba {
    public static void verificacion( int numero) throws Exception {
        if(numero % 2 != 0) throw new Exception("El numero es impar");
        System.out.println("El numero es par");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Introduzca el numero: ");
            int numero = sc.nextInt();
            verificacion(numero);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}