// Knapsack problem using dynamic programming approach
package dynaknapsack;
public class DynaKnapSack {
    public static void main(String[] args) {
       int w[]={1,3,4,5};
       int v[]={1,4,5,7};
       int W=7;
     int c[][]=new int[w.length+1][W+1];
     for(int i=0;i<=W;i++){
         c[0][i]=0;
     }
     for(int j=0;j<=w.length;j++){
         c[j][0]=0;
     }
     for(int i=1;i<=w.length;i++){
         for(int j=1;j<=W;j++){
             if(w[i-1]<=j){
                 if((v[i-1]+c[i-1][j-w[i-1]])>c[i-1][j]){
                     c[i][j]=v[i-1]+c[i-1][j-w[i-1]];
                 }
                 else{
                     c[i][j]=c[i-1][j];
                 }
             }
             else{
                   c[i][j]=c[i-1][j];
             }
         }
     }
     for(int i=0;i<=w.length;i++){
         for(int j=0;j<=W;j++){
             System.out.format("%02d ", c[i][j]);
         }
         System.out.println();
     }
    }
    
}
