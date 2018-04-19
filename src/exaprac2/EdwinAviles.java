
package exaprac2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: EdwinAviles
 * Fecha: 19/04/2018
 * Version: 1.0
 * Copyrigt: Ernesto Aviles
 * @author Ernesto Aviles
 */
public class EdwinAviles {
    
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("##.##");
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        int n=100;
        String nombreP[]=new String[n];
        int cantidadP[]=new int[n];
        double precioP[]=new double[n];
        double total[]=new double[n];
        int b=0;
        
        do {
            for (int i = 0; i < n; i++) {
                b=Integer.parseInt(JOptionPane.showInputDialog("Selecione una opcion: \n1) Agregar Compra \n2) Calcular compra \n 3) Salir"));
                if (b==1) {
                    nombreP[i]=JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                    cantidadP[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
                    precioP[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                    double pr=(cantidadP[i]*precioP[i]);
                    total[i]=pr+(pr*0.13);
                    if (total[i]>200) {
                        total[i]=total[i]-(total[i]*0.2);
                    }else{
                        if (total[i]>500) {
                            total[i]=total[i]-(total[i]*0.22);
                        }else{
                            if (total[i]>800) {
                                total[i]=total[i]-(total[i]*0.3);
                            }
                        }
                    }
                    
                    
                }
                if (b==2) {
                    for (int j = 0; j < n; j++) {
                        if (cantidadP[j]==0) {
                            //j=n+1;
                        }else{
                        JOptionPane.showMessageDialog(null, "Producto "+nombreP[j]+" -- Cantidad:"+cantidadP[j]+" -- precio: "+precioP[j]+" -- Total: "+total[j]);
                        }                                           
                        //i=i-1;
                    }
                }
                if (b==3) {
                    i=n+1;
                    break;
                }
            }
            
        } while (b!=3);
        
    }
    
}
