
package main;

import java.util.Scanner;

public class ProgramitaIF {

    public static void main(String[] args) {
     
        //Variales
        final double pi = 3.14;
        String opc;
        double largo, ancho,perimetro, area, radio,perimetroc, areac;  
        
        System.out.println("Seleccione una opcion: \n"
        +"Opcion 1 - Calcular perimetro y area de un rectangulo\n"
        +"Opcion 2 Calcular perimetro y area de un circulo\n");  
        Scanner entrada = new Scanner(System.in);    
        opc=entrada.nextLine();
    
        if(opc.equals("1")){
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
        else if(opc.equals("2")){
            System.out.println("Ingrese radio ");
            radio = entrada.nextDouble();
            entrada.nextLine();     
            perimetroc=radio*2*pi;
            areac=radio*radio*pi;
            System.out.println("El perimetro es: "+perimetroc+" el area es: "+areac);
            }
        else{
            System.out.println("ERROR, LAS OPCIONES SON 1 Y 2");
            }
    }
}
