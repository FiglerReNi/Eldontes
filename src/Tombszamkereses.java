/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Tombszamkereses {
    public static void main(String[]args){
        int N=15;
        int[] a=new int[N];
        int b=(int)(Math.random()*31);
        System.out.println("A keresett szám: "+b);
        for (int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*31);
            System.out.print(a[i]+" ");
        }
        int i=0;
        while((i<N)&&(a[i]!=b)){
            i++;
        }
        System.out.println();
        if(i<N){           
            System.out.println("A keresett szám a tömbben van");
        }
        else{
            System.out.println("A keresett szám nincs a tömbben");
               }     
    }   
}
