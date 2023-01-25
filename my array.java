package myactivities;
import java.util.scanner;

public class fillArray {

 public static void main(strings[] args){
 
  scanner keyboard = scanner(system.in);
  
  int[] numbers = new int[5];
  
  for(int i = 0;i < numbers.length;i++){
    
    system.out.print("Enter number" + (i+1) + ": ");
    numbers[i] = keyboard.nextInt();
  }
   
   for(int i=0; i < numbers.length; i++){
     
     system.out.println("Index" + i + "has the value of" + numbers[i]);
   }
 }

}
