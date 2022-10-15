
package main;

import java.util.Scanner;

public class ProgramitaIF {

    public static void main(String[] args) {
     
        //Variales
        final double pi = 3.14;
        String opc;
        double largo, ancho,perimetro, area, radio;  
        
        System.out.println("Seleccione una opcion: \n"
        +"ingrese 1 o a Calcular perimetro y area de un rectangulo\n"
        +"Ingrese 2 o b Calcular perimetro y area de un circulo\n"
        +"Ingrese 0 o c para salir\n");  
        Scanner entrada = new Scanner(System.in);    
        opc=entrada.nextLine();
    
        if(opc.equals("1") || opc.equals("a") || opc.equals("A") ){
            System.out.println("Ingrese largo: ");
            largo = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese ancho: ");
            ancho = entrada.nextDouble();
            entrada.nextLine();
            perimetro = largo*2 + ancho*2;
            area = largo*ancho;
            System.out.println("El perimetro es: "+perimetro+" el area es: "+area);
            }       
        else if(opc.equals("2") || opc.equals("b") || opc.equals("B") ){
            System.out.println("Ingrese radio ");
            radio = entrada.nextDouble();
            entrada.nextLine();     
            perimetro=radio*2*pi;
            area=radio*radio*pi;
            System.out.println("El perimetro es: "+perimetro+" el area es: "+area);
            }
        else if ( opc.equals("0") || opc.equals("c") || opc.equals("C") ){
            System.out.println("Chau!");
            }
        else{
            System.out.print("Las opciones eran 0,1,2 o a,b,c, bye. Presione una tecla para salir");
            entrada.nextLine();
            }
    }
}
