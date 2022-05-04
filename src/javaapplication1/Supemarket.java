
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Supemarket{
   public static void main (String[] args){
   
      Stack<String> caja1 = new Stack<>();
      Stack<String> caja2 = new Stack<>();
      Stack<String> caja3 = new Stack<>();
      
      Stack<Integer> carros = new Stack<>();
      
      ArrayList<String> clientes_mercando =  new ArrayList<String>();
      
      Scanner entrada = new Scanner(System.in);
      String nombre = null, aux;
      int action = 0, status = 1;
      
      for(int i=1; i<=25; i++){
         carros.push(i);
      }
      
      do{
         System.out.println("Ingrese su nombre");
         nombre = entrada.next();//String
         System.out.println("Ingrese la acción");
         System.out.println("1. Mercar");
         System.out.println("2. Pagar");
         action = Integer.parseInt(entrada.next());
      
         if(action==1 || action==2){
            switch(action){
               //caso mercar
               case 1:{
                  clientes_mercando.add(nombre);
                  System.out.println("Clientes mercando: " + clientes_mercando);
                  break;
               }
               // caso pagar
               case 2:{
            
                  //Caja1 es la más vacía
                  if( (caja1.size() < caja2.size()) && (caja1.size() < caja3.size()) ){
                     caja1.push(nombre);
                  }
                  //Caja2 es la más vacía
                  else if( (caja2.size() < caja1.size()) && (caja3.size() < caja3.size()) ){
                     caja2.push(nombre);
                  }
                  //Caja3 es la más vacía
                  else if( (caja3.size() < caja1.size()) && (caja3.size() < caja2.size()) ){
                     caja3.push(nombre);
                  } else{
                     caja1.push(nombre);
                  }
               }
            }
         } else {
            System.out.println("Ingrese un valor válido, 1 para mercar, 2 para pagar");
         }
      
         System.out.println(clientes_mercando);
         System.out.println(carros);
         System.out.println(caja1);
         System.out.println(caja2);
         System.out.println(caja3);
         
         System.out.println("Por favor ingrese, 0 para salir, 1 para continuar");
         status = Integer.parseInt(entrada.next());
      }while(status == 1);
   }
}


