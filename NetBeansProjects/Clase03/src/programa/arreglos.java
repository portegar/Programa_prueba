
package programa;


public class arreglos {
    public static void main(String[] args) {
     

     
     int  notas[]={20,58,5858};
      int mayor = 0 ;
      
        for (int i = 0; i < notas.length ; i++) {
            for (int j = 1; j < notas.length; j++) {
               if(notas[i] > notas[j])
                    mayor = notas[i];
               
                
            }
        }
        System.out.println(mayor);

           
            
        }
     
    }
    

