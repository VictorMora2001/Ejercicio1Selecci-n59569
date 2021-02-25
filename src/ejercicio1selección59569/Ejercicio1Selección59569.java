/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1selección59569;

/**
 *
 * @author amigo
 */
public class Ejercicio1Selección59569 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datosUsuario = new Scanner(System.in);
        
        System.out.println("Introduce el primer número");
        int numero1 = datosUsuario.nextInt();
        
        System.out.println("Introduce el segundo número");
        int numero2 = datosUsuario.nextInt();
        
        System.out.println("Introduce el tercer número");
        int numero3 = datosUsuario.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3){
        
            System.out.println("El número " + numero1 + " es el mayor");
                    
        if(numero2 > numero1 && numero2 > numero3){
        
            System.out.println("El número " + numero2 + " es el mayor");
                    
        if(numero3 > numero1 && numero3 > numero2){
        
            System.out.println("El número " + numero3 + " es el mayor"); 
        
            
            
        }
    }
    
}
