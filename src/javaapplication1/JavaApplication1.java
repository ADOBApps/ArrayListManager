/*
 * 
 */
package javaapplication1;

/**
 *
 * @author ADOB
 */
 
 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Collections;
 // Tambien podemos importar todo el paquete de utilidad:
 //import java.util.*;
 
 
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
     
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        * Util
        */
        Scanner in = new Scanner(System.in);
        ArrayList<String> myarraylist = new ArrayList<String>();
        int c, ch, i, j;
        String str = null, str1;
        
        do{
         System.out.println("Administrando ArrayList");
         System.out.println("*************************");
         System.out.println("1. Adiciona un elemento al final");
         System.out.println("2. Insertar en una posicion particular");
         System.out.println("3. Buscar");
         System.out.println("4. Listar la cadena que empiece con la letra");
         System.out.println("5. Tamaño");
         System.out.println("6. Eliminar elemento");
         System.out.println("7. Ordenar de la A=>Z");
         System.out.println("8. Mostrar");
         System.out.println("*************************");
         System.out.println("Ingrese la opcion");
         
         c = Integer.parseInt(in.next());
         
         switch(c){
            case 1:{
               System.out.println("Digite la cadena: ");
               str = in.next();
               myarraylist.add(str);
               System.out.println("Se acaba de agregar " + str + "al arraylist");
               break;
            }
            case 2:{
               System.out.println("Digite la cadena: ");
               str = in.next();
               System.out.println("Digite la posicion: ");
               
               //el valor ingresado debe ser un entero
               i = in.nextInt();
               
               //consultamos la ultima posicion ocupada y la asignamos a j para evitar errores
               j = myarraylist.size();
               
               //Si la posicion indicada es mayor al size actual, rellenamos posiciones anteriores
               if(j<i){
                  for(int aux=j; aux<i; ++aux){
                     //Vamos a rellenar las posiciones anteriores a la indicada por el usuario
                     myarraylist.add(aux, "");
                  }
                  //agregamos la posicion que indica el usuario
                  myarraylist.add(i, str);
               } 
               else {
                  //agregamos la posicion que indica el usuario
                  myarraylist.add(i, str);
               }
               System.out.println("ArrayList: " + myarraylist);
               
               break;
            }
            case 3:{
               System.out.println("Digite la cadena que desea buscar: ");
               str = in.next();
               
               //Verificamos que la cadena este en el arraylist
               if(myarraylist.contains(str)){
                  //obtenemos su posicion
                  i = myarraylist.indexOf(str);
                  
                  //mostramos su posicion
                  System.out.println("La cadena se encuentra en la posicion: "+i);
               }else{
                  System.out.println("Cadena no encontrada");
               }
               break;
            }
            case 4:{
               System.out.println("Ingrese la letra la cadena");
               str = in.next();
               int f = 0;
               for(int k=0; k<myarraylist.size(); ++k){
                  String element = myarraylist.get(k);
                  if(element.startsWith(str)){
                     System.out.println(f+" "+element);
                     ++f;
                  }
               }
               break;
            }
            case 5:{
               System.out.println("Numero de elementos: " + myarraylist.size());
               break;
            }
            case 6:{
               System.out.println("Cadena que desea remover");
               str = in.next();
               
               if( myarraylist.contains(str) ){
                  myarraylist.remove(str);
                  System.out.println("Cadena eliminada");
                  System.out.println("ArrayList: "+ myarraylist);
               } else{
                  System.out.println("Cadena no encontrada");
               }
               break;
            }
            case 7:{
               System.out.println("Elementos ordenados alfabeticamente");
               //Usamos el metodo Collections.sort(), requiere importar java.util.Collections
               Collections.sort(myarraylist);
               
               /*
               * recorremos el arraylist para que se haga efectivo el ordenamiento
               * si solo se usa System.out.println(myarraylist); se imprime el ArrayList original
               */
               for(int k=0; k<myarraylist.size();++k){
                  System.out.println(myarraylist.get(k));
               }
               break;
            }
            case 8:{
               System.out.println("Elementos: ");
               int aux2 = 0;
               for(int k=0; k<myarraylist.size();++k){
                  System.out.println(aux2 +". "+ myarraylist.get(k));
                  ++aux2;
               }
               break;
            }
         }
         
         System.out.println("Por favor ingrese, 0 para salir, 1 para continuar");
         ch = Integer.parseInt(in.next());
        }while(ch == 1);
     
    }
    
}
