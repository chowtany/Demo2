/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package animal;

import java.util.Scanner;
/**
 *
 * @author Tanya Chowdhary
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner sc= new Scanner(System.in);
    
    System.out.println("Print name of animal" );
    
    String name=sc.next();
    
     System.out.println("Print age of animal" );
        int age=sc.nextInt();
        
     Bear b1=new Bear(name,age);
     
      System.out.println("Name of animal is " + b1.getName() + "." + " Age of animal is " + b1.getAge() + ".");
      // System.out.println("Age of animal is " + b1.getAge() + ".");
     int [] li=new int[3];
     Bear[] animallist=new Bear[3];
     for(int i=0;i<animallist.length;i++){
          System.out.println("Print name of animal" );
           String name1=sc.next();
           
            System.out.println("Print age of animal" );
           int age1=sc.nextInt();
          
           Bear b2=new Bear(name1, age1);
           animallist [i]=b2;
     }
     
   for(Bear b2:animallist)
        {
            System.out.println(b2.getName());
              System.out.println(b2.getAge());
        }
    }

    
}
