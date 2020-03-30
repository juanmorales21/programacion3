/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.temperatura;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan David Morales
 */
public class EjercicioTemperatura {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> personas=new ArrayList();
         ArrayList <String> listatemperaturas=new ArrayList();
           ArrayList <String> listatemperaturas2=new ArrayList();
        
        Scanner escnombre=new Scanner (System.in);
        Scanner escparentesco=new Scanner (System.in);
        Scanner escedad=new Scanner (System.in);
        Scanner escontinuar=new Scanner (System.in);
         Scanner escnomtemp=new Scanner (System.in);
          Scanner esctemp=new Scanner (System.in);
          Scanner escnompersonas=new Scanner(System.in);
        
        String nombre;
        int edad;
        String parentesco;
        int temperatura;
        int continuar;
        int nomtemp;
        int nompersona;
        System.out.println("CREDITOS: DANIEL GONZALEZ DELGADO -- JUAN DAVID MORALES");
        System.out.println("Desea ingresar una  persona:   SI(1)||NO(2)");
            continuar=escontinuar.nextInt();
        while (continuar==1)
        {
            System.out.println("Ingrese el nombre de la persona: ");
            nombre=escnombre.nextLine();
            System.out.println("Ingrese la edad de la persona: ");
            edad=escedad.nextInt();
            System.out.println("Ingrese el parentesco de la persona: ");
            parentesco=escparentesco.nextLine();
            personas.add( nombre+"      "+edad+"      "+parentesco);
            listatemperaturas.add(nombre);
            
            System.out.println("Desea ingresar otra persona:   SI(1)||NO(2)");
            continuar=escontinuar.nextInt();
        } 
         System.out.println("");
        System.out.println("LISTA DE LA FAMILIA:");
        
       for(int i=0;i<personas.size();i++)
        {
      System.out.println("Integrante numero ´"+i+"´: "+personas.get(i));
        }
         System.out.println("");
        System.out.println("Desea ingresar una  temperatura:   SI(1)||NO(2)");
            continuar=escontinuar.nextInt();
          
            
            
       while (continuar==1)
        {
            System.out.println("Ingrese el numero del integrante: ");
            nompersona=escnompersonas.nextInt();
                System.out.println("Ingrese la temperatura: ");
                temperatura=esctemp.nextInt();
                listatemperaturas2.add(listatemperaturas.get(nompersona)+" "+temperatura);
        System.out.println("Desea ingresar otra temperatura:   SI(1)||NO(2)");
            continuar=escontinuar.nextInt();
        } 
             System.out.println("");
       System.out.println("LISTA DE LA FAMILIA:");

       for(int i=0;i<personas.size();i++)
        {
      System.out.println("Posicion ´"+i+"´: "+personas.get(i));
        }
        System.out.println("");
       System.out.println("LISTA DE TEMPERATURAS:");
        for(int i=0;i<listatemperaturas2.size();i++)
        {
      System.out.println(listatemperaturas2.get(i)+ " grados centigrados");
        }
        System.out.println("CREDITOS: DANIEL GONZALEZ DELGADO -- JUAN DAVID MORALES");
        }
    
}
