/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkopp22;
import java.util.ArrayList;
import java.util.Scanner;

public class Courseworkopp22 {

   
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList();
      Scanner hut=new Scanner(System.in);
      System.out.println("Enter students name(Enter exit when done)");
      int x = 0;
       while(true){
      System.out.println("Enter students name" +x);
      String y=hut.next();
      if(y.toLowerCase().equals("exit"))
      
               break;
      else{
     int mark[] = new int [6];
     int i;
     String grd;
     float sum=0, avg;
     Scanner scan = new Scanner(System.in);
     System.out.println("enter your 1st course");
     String a =scan.next();
     System.out.println("entered" +a);
       System.out.println("enter your 2nd course");
     String b =scan.next();
     System.out.println("entered" +b);
     
     System.out.println("enter your 3rd course");
     String c =scan.next();
     System.out.println("entered" +c);
     
     System.out.println("enter your 4th course");
     String d =scan.next();
     System.out.println("entered" +d);
     
     System.out.println("enter your 5th course");
     String e =scan.next();
     System.out.println("entered" +e);
     
     System.out.println("enter your 6th course");
     String f =scan.next();
     System.out.println("entered" +f);
     
     System.out.print("enter score ");
     for (i=0; i<6; i++)
     {
         mark[i] = scan.nextInt();
         sum = sum + mark[i];
     }
     avg = sum/6;
     System.out.print("your average grade is invalid");
          name.add(y);
          x++;
    }
    }
    
}
}