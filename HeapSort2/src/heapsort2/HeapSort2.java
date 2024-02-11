// Heap sort code in java
package heapsort2;
public class HeapSort2 {
 static void heapSort(int A[]){
            int n=A.length;
        for(int i=n/2;i>=0;i--){
            maxHeapify(A,i,n);
        }
        for(int i=n-1;i>0;i--){
            int temp=A[i];
            A[i]=A[0];
            A[0]=temp;
            n=n-1;
            maxHeapify(A,0,n);
        }
            
        }
    
   static void maxHeapify(int A[],int i,int n){
         int max=i;
        int l=2*i+1;
        int r=2*i+2;
      
        if(l<n && A[l]>A[max]){
            max=l;
        }
        if(r<n && A[r]>A[max]){
            max=r;
        }
        if(max!=i){
            int temp=A[max];
            A[max]=A[i];
             A[i]=temp;
            maxHeapify(A,max,n);
    }

    }
    
    public static void main(String[] args) {
            int A[]={10,9,8,7,6,5,4,32,32,1};
            heapSort(A);
            for(int i=0;i<A.length;i++){
                System.out.println(A[i]);
            }
   
    }
}
