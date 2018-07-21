
package programa;

public class arreglobidimi {

    public static void main(String[] args) {
     int[][] bidimensional    = new int[3][3];
     bidimensional[0][0]= 25;
     bidimensional[0][1]= 25;
     bidimensional[0][2]= 25;
     bidimensional[1][0]= 35;
     bidimensional[1][1]= 35;
     bidimensional[1][2]= 35;
     bidimensional[2][0]= 45;
     bidimensional[2][1]= 45;
     bidimensional[2][2]= 128;


     int mayor = 0;
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional.length; j++) {
               
              if(bidimensional[i][j] > bidimensional[i][j] -1 )  
                mayor = bidimensional[i][j];
                  }
        }
        System.out.println("mayor es : "+ mayor);
       
     
    }
}
