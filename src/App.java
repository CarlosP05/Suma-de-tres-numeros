import java.util.Scanner;
//Calos Fernando Palma Urbina
//Carnet:2024-1628U
//1M7-S
public class App {
// agrego mis metodos
//descubro cual es el numeros mayor que ingreso el usuario
    public static int Mayor(int digito1, int digito2, int digito3){
        int Grande = digito1;
        if (digito2 > Grande ){
            Grande = digito2;            
        }
        if (digito3>Grande) {
            Grande = digito3;
        }
        return Grande;
    }
//se busca cuanto es la diferencia entre los dos numeros mas grandes 
    public static int difMayores(int digito2, int digito3, int digito1){
        int numMayor= Math.max (Math.max(digito1, digito2), digito3);
        int numMayor2= (digito1+ digito2+ digito3) - numMayor - Math.min(Math.min(digito2, digito1), digito3);
        return numMayor- numMayor2;
    }
    //tambien cuanto da la suma de los numeros mas pequeños
    public static int sumadelosmenores(int digito3, int digito1, int digito2){
        int numMenor= Math.min (Math.min(digito1, digito2), digito3);
        int numMenor2= (digito1+ digito2+ digito3) - numMenor - Math.max(Math.max(digito2, digito1), digito3);
        return numMenor+ numMenor2;
    }

    public static void main(String[] args) throws Exception {
        //ingresamos las variables y el scanner
        Scanner num = new Scanner(System.in);
        int digito1;
        int digito2;
        int digito3;
        //le damos la bienvanida al usuario y le pedimos que ingrese los digitos
        System.out.println("Bienvenido");
        System.out.println("por favor ingrese tres numeros diferentes");
        boolean continuar = true;
        //abrimos el boolean y tambien un do-while y el try-catch
        do {
            try {
                digito1= num.nextInt();
                digito2= num.nextInt();
                digito3= num.nextInt();
                //nos aseguramos que el usuario ingrese digitos diferentes entre si
                if (digito1 == digito2 || digito1 == digito3 || digito2 == digito3) {
                    System.out.println("los digitos deben ser diferentes ingrese nuevamente");
                } else {
                    //y le mostramos tanto las diferencia entre mayores, la suma de menores y cual numero es mayor
                continuar = false;
                System.out.println("el numero mayor es = "+Mayor(digito1, digito2, digito3));
                System.out.println("la diferencia entre los numeros mayores es de = "+difMayores(digito2, digito3, digito1));
                System.out.println("la suma de los menores es de = "+sumadelosmenores(digito3, digito1, digito2));
                }
                //nos aseguramos que el usuario solo ingrese numeros 
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Por favor ingrese numeros enteros y no letras");
                num.nextLine();
            }
            //terminamos
        } while (continuar);
        num.close();
    }
   
}
