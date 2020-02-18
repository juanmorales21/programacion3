/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pasteldecumpleaños;

/**
 *
 * @author Juan David Morales
 */
import java.util.Scanner;
public class Pasteldecumpleaños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int x=0;
       int contador=0;
Scanner leer= new Scanner(System.in);
System.out.println("Digite los años que esta cumpliendo la persona");
int años=leer.nextInt();
int velas[]=new int[años];
System.out.println("Digite las alturas de las velas");
       for(int i=0;i<años;i++)
{
velas[i]=leer.nextInt();

}
 for(int i=0;i<años;i++)
{
    if(velas[i]>x)
    {
     x=velas[i];
    }
}
  for(int i=0;i<años;i++)
{
    if(velas[i]==x)
    {
        contador++;
    }
}
       System.out.println("El numero de velas que se apagaran son: "+contador);
    }

}
