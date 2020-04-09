/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class ParosParatlan {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Hány számról szeretné eldönteni, hogy páros vagy páratlan?");
       int a=sc.nextInt();
       while(a>0){
           System.out.println("Kérem a számot: ");
           int b=sc.nextInt();
           if(b%2==0){
               System.out.println("A szám páros");
           }
           else{
               System.out.println("A szám páratlan");
           }    
           a--;
       }
    }
}
