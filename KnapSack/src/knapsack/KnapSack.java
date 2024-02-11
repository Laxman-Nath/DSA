// knapsack using greedy approach
package knapsack;
import java.util.Arrays;


public class KnapSack {
    static void swap(float  x,float y){     
       
                float temp=x;
                x=y;
                y=temp;
      
    }
static void Sort(float  A[],float  B[],float C[]){
    int n=A.length;
    for(int i=0;i<n;i++){
          for(int j=0;j<n-i-1;j++){
            if(A[j]<A[j+1]){
              float temp1=A[j];
              A[j]=A[j+1];
              A[j+1]=temp1;
              float temp2=B[j];
              B[j]=B[j+1];
              B[j+1]=temp2;
              float temp3=C[j];
              C[j]=C[j+1];
              C[j+1]=temp3;
            }
        }
    }
}
    
    public static void main(String[] args) {
        float W=60;
        float P=0.0f;
        float w[]={5,10,20,30,40};
        float p[]={30,20,100,90,160};
        int k=0;
        float div[]=new float[w.length];
        for(int i=0;i<w.length;i++){
            div[i]=p[i]/w[i];
        }
        Sort(div,w,p);



        for(int i=0;i<w.length;i++){
             if(W>0 && w[i]<=W){
                W=W-w[i];
                P=P+p[i];
                k=i;
         }
            else{
                break;
            }
        }
        
        if(W>0){
            P=P+(p[k+1]*(float)(W/w[k+1]));
        }
        System.out.println("The total profit is:"+P);
        
    }
    
}
