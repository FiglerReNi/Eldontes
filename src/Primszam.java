/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Primszam {
    public static void main(String[]args){
        int a=(int)(Math.random()*99)+2;
        System.out.println("A generált szám: "+a);
        int oszto=0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                oszto++;
            }   
            }
        if(oszto==2){
            System.out.println("A szám prímszám");
        }
        else{
            System.out.println("A szám nem prímszám");
        }                          
    }   
}
