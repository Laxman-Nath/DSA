// String editing problem in java using dynamic programming
package stringeditingproblem;


public class StringEditingProblem {

   
    public static void main(String[] args) {
        String str1="adceg";
        String str2="abcfg";
        int T[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                if(i==0 && j==0){
                    T[i][j]=0;
                }
               else if(i==0){
                   T[i][j]=T[i][j-1]+1;
               }
               else if(j==0){
                   T[i][j]=T[i-1][j]+1;
               }
               else{
                   if(str1.charAt(i-1)==str2.charAt(j-1)){
                       T[i][j]=T[i-1][j-1];
                   }
                   else{
                       int a=T[i][j-1];
                       int b=T[i-1][j];
                       int c=T[i-1][j-1];
                       int min1=Integer.min(a,b);
                       int min2=Integer.min(min1, c);
                       if(min2==a ){
                           T[i][j]=T[i][j-1]+1;
                       }
                       if(min2==b){
                           T[i][j]=T[i-1][j]+1;
                       }
                       if(min2==c){
                           T[i][j]=T[i-1][j-1]+1;
                       }
                   }
               }
            }
        }
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                System.out.format("%02d ",T[i][j]);
            }
            System.out.println();
        }
    }
    
}
