import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class calcu{

   public static void main (String[] args){
      
      int status=1, operation, value1, value2, result=0; 
      Scanner input = new Scanner(System.in);
      Stack<Integer> memory = new Stack<>();
      
      do{
         System.out.println("Type operation");
         System.out.println("1. Sum");
         System.out.println("2. Subtract");
         System.out.println("3. Multiplication");
         System.out.println("4. Divide");
         System.out.println("5. Exit");
         System.out.print("\n");
         
         System.out.print("==>");
         operation = Integer.parseInt(input.next());
         
         switch(operation){
         
            //Sum operation code
            case 1:{
               System.out.println("Type first number");
               System.out.print("==>");
               value1 = Integer.parseInt(input.next());
               
               System.out.println("Type second number");
               System.out.print("==>");
               value2 = Integer.parseInt(input.next());
               
               System.out.print("Result ==>");
               result = (value1+value2);
               System.out.println(result);
               
               break;
            }
            //Subtract operation code
            case 2:{
               System.out.println("Type first number");
               System.out.print("==>");
               value1 = Integer.parseInt(input.next());
               
               System.out.println("Type second number");
               System.out.print("==>");
               value2 = Integer.parseInt(input.next());
               
               System.out.print("Result ==>");
               result = (value1-value2);
               System.out.println(result);
               break;
            }
            case 3:{
               System.out.println("Type first number");
               System.out.print("==>");
               value1 = Integer.parseInt(input.next());
               
               System.out.println("Type second number");
               System.out.print("==>");
               value2 = Integer.parseInt(input.next());
               
               System.out.print("Result ==>");
               result = (value1*value2);
               System.out.println(result);
               break;
            }
            case 4:{
               System.out.println("Type first number");
               System.out.print("==>");
               value1 = Integer.parseInt(input.next());
               
               System.out.println("Type second number");
               System.out.print("==>");
               value2 = Integer.parseInt(input.next());
               
               System.out.print("Result ==>");
               result = (value1/value2);
               System.out.println(result);
               break;
            }
            case 5:{
               status = 0;
               break;
            }
            default: {
               System.out.println("Invalid operation");
               break;
            }
         }
         
         System.out.print("\n");
         System.out.println("Type 1 to continue, 2 to save, 3 to show saved info and 0 to exit");
         System.out.print("==>");
         status = Integer.parseInt(input.next());
         
         if(status==2){
            status = 1;
            memory.push(result);  
            System.out.println("Saved");
            System.out.print("\n");
         }
         else if(status==3){
            System.out.print("\n");
            System.out.println(memory);
            status = 1;
            System.out.print("\n");
         }
         else{
           System.out.println("Not saved"); 
         }
         
      }while(status==1);

   }

}