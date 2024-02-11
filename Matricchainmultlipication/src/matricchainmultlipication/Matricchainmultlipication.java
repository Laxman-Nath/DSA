// Matrix chain multlipication
package matricchainmultlipication;

public class Matricchainmultlipication {


    public static void main(String[] args) {
        int P[]={5,10,15,20,30};
        int n=P.length-1;
        int m[][]=new int[n][n];
        int s[][]=new int[n][n];
        for(int i=0;i<n;i++){
            m[i][i]=0;
        }
        for(int l=2;l<=n;l++){
            for(int i=0;i<n-l+1;i++){
                int j=i+l-1;
                 m[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int  q=m[i][k]+m[k+1][j]+P[i]*P[k+1]*P[j+1];
                    if(q<m[i][j]){
                        m[i][j]=q;
                        s[i][j]=k+1;
                    }
                    }
                }
            }
        System.out.println("The m-matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.format("%02d ", m[i][j]);
        }
            System.out.println("");
        }
        System.out.println("The s-matrix is:");
                for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(s[i][j]+"   ");
        }
            System.out.println();
        }
        
    }
    
}
