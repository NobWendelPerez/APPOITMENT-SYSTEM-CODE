/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("1.Cedula  2.Brangay Clearance 3.ID");
   Scanner input=new Scanner(System.in);
    System.out.println("Selected");
    int nm1=input.nextInt();
    
   if(nm1==1){
   System.out.println("What day you prefer\n1.Monday \n2.Tuesday \n3.Wednesday \n4.Thursday \n5.Friday \n6.Saturday\nSelected:" );
   }else if (nm1==2) {
   System.out.println("What day you prefer \n1.Monday \n2. Tuesday \n3. Wednesday \n4. Thursday \n5. Friday \n6 Saturday\nSelected:");
   }else if (nm1==3){
   System.out.print("What day you prefer \n1.Monday \n2. Tuesday \n3.Wednesday \n4. Thursday \n5.Friday \n6 Saturday\nSelected:");
   }else{
           System.out.print("Eror type again!\n"); 
   }
  int nm2=input.nextInt(); 
  
  if (nm2==1){
     System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");
 
  }else if (nm2==2){
       System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");
  }else if (nm2==3) {
       System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");

  }else if (nm2==4){
       System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");

  }else if (nm2==5){
       System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");

  }else if (nm2==6){
       System.out.print("What do you prefer \n1.`(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) breaktime \n4.(1:00-2:30) 5.(2:30-4:00) \nSelected:");

  }else{ System.out.print("Error type again!!:");}
  
  int nm3=input.nextInt();
  String cd="cedula"; String cd2=("Barangay Clearance"); 
  String cd3=("Brangay id");
  
  
  if(nm1==1){
     System.out.print("you choose:"+cd);
  }else if (nm1==2){
  System.out.print("you choose:"+cd2);
  } else if (nm1==3){
    System.out.print("you choose:"+cd3);
  }else{
  System.out.print("Errora type again");
  }
  String day1="monday";String day2="Tuesday";String day3="Wednesday";String day4="Thursday";String day5="friday";String day6="saturday";
   
 if (nm2==1){
     System.out.print("\nDay:"+day1);
 }else if (nm2==2){
     System.out.print("\nDay:"+day2);
 }else if (nm2==3){
      System.out.print("\nDay:"+day3);
 }else if (nm2==4){
      System.out.print("\nDay:"+day4);
 }else if (nm2==5){
      System.out.print("\nDay:"+day5);

 }else if (nm2==6){
      System.out.print("\nDay:"+day6);

 }else {
     System.out.print("Error Type again:");}
 
 String time1="(7:30-9:00)";String time2="(9:00-10:30)";String time3="(10:30-12:00)";
 String time4="(1:00-2:30)";String time5="(2:30-4:00)";
 
 if (nm3==1){
 System.out.print("\nTime:"+time1);
 }else if(nm3==2){
  System.out.print("\nTime:"+time2);
 }else if (nm3==3){
  System.out.print("\nTime:"+time3);
 }else if (nm3==4){
  System.out.print("\nTime:"+time4);
 }else if (nm3==5){
  System.out.print("\nTime:"+time5);
 }else{
    System.out.print("Error type again!!:");
  
 
 
 }
 }
    
  
    
  
      
    
    

