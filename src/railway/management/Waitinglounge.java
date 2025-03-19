/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.management;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class Waitinglounge {
      void lounge(){
          Scanner sc = new Scanner(System.in);
          int a = 0;
          ArrayList obj = new ArrayList(); 
          int i = 0; 
          while (i != 5) {
              System.out.println("1- Enter the person name");
              System.out.println("2- Removal of record");
              System.out.println("3- Searching for existing record"); 
              System.out.println("4- Complete list of Waiting lounge"); 
          System.out.println("5- Return to main menu./n/n");
          
          System.out.print("Enter an option : ");
       i = sc.nextInt();
     switch (i) {
         case 1:
             a++;
             if(a<=15){
             System.out.print("Enter name of passenger : ");
             String name = sc.next();
             obj.add(name);
             }
             else{
                 System.out.print("Waiting Area is already full\n");
                 a--;
             }
             break;
         case 2:
             System.out.print("Enter name of person to remove : ");
             String name = sc.next();
             obj.remove(name);
             break;
         case 3:
             System.out.print("Enter name of person to search for in records : ");
             String name2 = sc.next();
             boolean check = obj.contains(name2);
             if(check == true){
             System.out.println(name2+" is present in records./n");
             }
             if(check == false){
                 System.out.println(name2+" is not present in records./n");
             }
             break;
         case 4:
             int list = obj.size();
             System.out.println("Currently "+list+" pessengers present in waiting area.");
             Collections.sort(obj);
             for(int j = 0 ; j < list ; j++){
                 System.out.println(obj.get(j));
             }
             break;
         case 5:
             break;
         default:
             System.out.println("Invaid button pressed..... Try again!!!!");
     }

 }
          }
          }

