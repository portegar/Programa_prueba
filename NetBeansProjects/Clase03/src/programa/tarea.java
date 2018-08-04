
package programa;

public class tarea {


    public static void main(String[] args) {
     double notas[] = new double[6] ;
      String nombres[] = new String[6];
      
      
        nombres[0]= "marco";
        nombres[1]= "maria";
        nombres[2]= "claudia";
        nombres[3]= "romulo";
        nombres[4]= "paula";
        nombres[5]= "carlos";
        
        notas[0]=12;
        notas[1]=9;
        notas[2]=5;
        notas[3]=15;
        notas[4]=1;
        notas[5]=10;
       
        for (int i = 0; i < notas.length; i++) {
            
             if (notas[i] > 16)
                 {
                 System.out.println(nombres[i] +" NOTA: "+  notas[i] + " MUY BIEN");
                 }
                    else  if (notas[i]< 10)
                      System.out.println(nombres[i] +" NOTA: "+  notas[i] + " APOYO");
                         else if (notas[i]> 11 || notas[i]<=105) 
                             {
                              System.out.println(nombres[i] +" NOTA: "+  notas[i] + " MEJORANDO");           
                      
                             }
                    
                      
                  } 
           
              }
        }
//            for (int j = 0; j < nombres.length; j++) {
//            if (notas[i]< 10)
//             System.out.println(nombres[0] + notas[0] + "APOYO"); 
//            if (notas[i]> 11 || notas[i]<=105) 
//             System.out.println(nombres[0] + notas[0] + "mejorando"); 
//            }
     
        
      
       
