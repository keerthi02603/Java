/*3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value*/

import java.util.Scanner;

class UniqueNumbers{
 public static void main(String...siri){
 Scanner sc=new Scanner(System.in);
 int a[]=new int[5];
 int count=0,i,j;
 
 for(i=0;i<5;i++){
 System.out.print("enter the numbers between 10 and 100:");
 int n=sc.nextInt();
 if(n>=10&&n<=100){
 boolean duplicate=false;
  for(j=0;j<count;j++){
     if(a[j]==n){
     duplicate=true;
     break;
         }
        }
        if(duplicate){
          System.out.println("Duplicate number! Not added to the set.");
        }
        else{
        a[count]=n;
        count++;
        System.out.print("UNIQUE VALUES:");
        for(j=0;j<count;j++){
         System.out.print(a[j]+" ");
         }
         System.out.println();
         }
 }
 else{
 System.out.println("Invalid number!Please enter a number between 10 and 100");
 i--;
 }
 }
}}

