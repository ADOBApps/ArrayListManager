import java.util.Scanner;


public class Counter{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      String test="", microstring;
      int start, end, counterR=0, counterL=0;
      
      System.out.println("Type a operation");
      System.out.print("==>");
      test = input.next();
      
      if( test.indexOf("(") != -1 || test.lastIndexOf(")") != -1 ){
         System.out.println("It has parentheses");
         
         for(int i = 0; i<test.length(); i++){
            microstring = Character.toString(test.charAt(i));
            if( microstring.equals("(") ){
               counterL = counterL+1;
            } else if( microstring.equals(")") ){
               counterR = counterR+1;
            }
         }
         if( counterR == counterL ){
            System.out.println("Parenthesis ok");
         }
         else{
            System.out.println("Error, expect same opening and close parentheses number");
         }
      }
       else{
         System.out.println("It do not have parentheses");
       }     
   }
}