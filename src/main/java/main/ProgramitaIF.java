
package main;

import java.util.Scanner;

public class ProgramitaIF {

    public static void main(String[] args) {
        System.out.println("Seleccione una opcion: \n"
        +"Opcion 1 - Calcular perimetro y area de un rectangulo\n"
        +"Opcion 2 Calcular perimetro y area de un circulo\n");
     int opc;   
     Scanner entrada = new Scanner(System.in);    
    opc=entrada.nextInt();
    entrada.nextLine();
    
     if(opc == 1){
         System.out.println("Ingrese largo: ");
         double largo;
         largo = entrada.nextDouble();
         entrada.nextLine();
         System.out.println("Ingrese ancho: ");
         double ancho;
         ancho = entrada.nextDouble();
         entrada.nextLine();
         double perimetro;
         perimetro = largo*2 + ancho*2;
         double area;
         area = largo*ancho;
         System.out.println("El perimetro es: "+perimetro+" el area es: "+area);
     }       
     else if(opc==2){
         System.out.println("Ingrese radio ");
         double radio;
         final double pi = 3.1415;
         radio = entrada.nextDouble();
         entrada.nextLine();
         double perimetroc, areac;
         perimetroc=radio*2*pi;
         areac=radio*radio*pi;
         System.out.println("El perimetro es: "+perimetroc+" el area es: "+areac);
     }
     else{
     System.out.println("ERROR, LAS OPCIONES SON 1 Y 2");
     }
    }
}
