import java.util.Scanner;
class Matrix {
    private int[][] mat1 = new int[3][3];
    
 
    public Matrix() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first matrix");
 
       
       for(int i = 0; i < 3; ++i) {
          for(int j = 0; j < 3; j++) {
             this.mat1[i][j] = sc.nextInt();
          }
       }
 
       
    }
 
    public void Display() {
        

   }

   public void Display() {
      int var1;
      int var2;
      for(var1 = 0; var1 < 3; ++var1) {
         for(var2 = 0; var2 < 3; ++var2) {
            this.mat3[var1][var2] = this.mat1[var1][var2] + this.mat2[var1][var2];
         }
      }

      System.out.println("the result is");

      for(var1 = 0; var1 < 3; ++var1) {
         for(var2 = 0; var2 < 3; ++var2) {
            System.out.print(this.mat3[var1][var2] + "\t");
         }

         System.out.println();
      }

   }
}
    
}
