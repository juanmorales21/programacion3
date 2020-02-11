
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan David Morales
 */
public class matriznxn {
    public static void main(String[]args)
    {
        int sumadiag[]=new int [50];
        int dumadiag2[]=new int [50];
     int nF=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n: "));
    int matriz[][]=new int[nF][nF];
    for (int i=0;i<nF;i++)
    {
        for (int j=0;j<nF;j++)
        {
            matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ["+(i+1)+","+(j+1)+"] de la matriz"));
           if((i)==(j))
            {
                sumadiag[i]=matriz[i][j];
            } 
           if(i+j==nF-1)
           {
               dumadiag2[i]=matriz[i][j];
           }
        }
    }
    String resultado="";
    for (int i=0;i<nF;i++)
    {
        for (int j=0;j<nF;j++)
        {
            resultado+=matriz[i][j];
            resultado+="    ";
        }
        resultado+="\n";
    }
    int suma=0,suma1=0;
    for(int elemento:sumadiag)
    {
        suma=suma+elemento;
    }
    for(int elemento:dumadiag2)
    {
        suma1=suma1+elemento;
    }
    JOptionPane.showInputDialog(null,resultado);
       JOptionPane.showInputDialog("La suma de las diagonales es: "+suma+"  La suma de la diagonal secundaria es :"+suma1);
    }

}
