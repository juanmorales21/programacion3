/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan David Morales
 */
public class sumanumerosimp {
    public static void main (String[]args)
    {
        
      int x;
      long y=0;
      for (x=0;x<=100000000;x++)
     {
       if((x%2)!=0)
       {
         y=y+x;
           
       }
       
     }
      System.out.println("La suma de los numeros impares de 1 a 100.000.000 es "+y);
    }
}
   
