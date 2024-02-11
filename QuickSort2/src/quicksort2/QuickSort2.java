// Quick Sort in java
package quicksort2;


public class QuickSort2 {
      
    static int partition(int A[],int l,int r){
        int x=l;
        int p=l;
        int y=r;
        while(x<y){
            while(A[x]<=A[p] && x<r){
                x++;
            }
             while(A[y]>=A[p] && y>l){
                y--;
            }
             if(x<y){
                int temp1=A[x];
                A[x]=A[y];
                A[y]=temp1;
             }
        }
        int temp=A[y];
        A[y]=A[p];
        A[p]=temp;
        return y;
    }
static void quickSort(int A[],int l,int r){
    if(l<r){
        int p=partition(A,l,r);
        quickSort(A, l, p-1);
        quickSort(A, p+1, r);
    }
}

    public static void main(String[] args) {
        int A[]={100000,10,9,5,7,8,2,1,100,200,400,500,1000,2000,3000,5000};
        quickSort(A, 0,A.length-1);
        for(int x:A){
            System.out.println(x);
        }
        }
    }
    

