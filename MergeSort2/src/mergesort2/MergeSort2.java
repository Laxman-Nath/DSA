/*Merge sort code in java.Here we are generating random numbers between 1 to 100 
and storing them into the file.Then we sort those numbers using Merge sort and again
store them into the another file.Also we are calculating the time for sorting.
*/
package mergesort2;
import java.util.Random;
import java.io.FileWriter;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
class Sorting{
    int A[]=new int[100000];
    Random r=new Random();
    void fillingArray(){
        for(int i=0;i<A.length;i++){
            A[i]=r.nextInt(100)+1;
        }
    }
    void storingUnsorted() throws Exception{
        FileWriter f1=new FileWriter("D:/MergeSortUnsorted.txt");
        for(int i=0;i<A.length;i++){
            f1.write(A[i]+",");
    }
    }
     void storingSorted() throws Exception{
        FileWriter f2=new FileWriter("D:/MergeSortSorted.txt");
        for(int i=0;i<A.length;i++){
            f2.write(A[i]+",");
    }
     }
        
    void mergeSort(int A[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(A,l,mid);
            mergeSort(A,mid+1,r);
            merge(A,l,mid,r);
        }
        
    }
    
     void merge(int A[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int B[]=new int [r+1];
        while(i<=mid && j<=r){
            if(A[i]<A[j]){
                B[k]=A[i];
                i++;
                k++;
            }
            else{
                B[k]=A[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            B[k]=A[i];
            i++;
            k++;
        }
        while(j<=r){
            B[k]=A[j];
            j++;
            k++;
        }
        for(i=l;i<=r;i++)
        {
            A[i]=B[i];
        }
    }
    
}
public class MergeSort2 {

            
    public static void main(String[] args) throws Exception {
       Sorting s=new Sorting();
       s.fillingArray();
       s.storingUnsorted();
       LocalTime starttime=LocalTime.now();
       System.out.println("Sorting started at:"+starttime);
       s.mergeSort(s.A, 0, s.A.length-1);
       LocalTime endtime=LocalTime.now();
       System.out.println("Sorting ended at:"+endtime);
       long hours=ChronoUnit.HOURS.between(starttime, endtime);
       long minutes=ChronoUnit.MINUTES.between(starttime, endtime)%60;
       long seconds=ChronoUnit.SECONDS.between(starttime, endtime)%60;
       long milleseconds=ChronoUnit.MILLIS.between(starttime, endtime)%1000;
       System.out.println("The total time taken for sorting is:"+hours+" hours "+minutes
        +" minutes "+seconds+" seconds "+milleseconds+" millis");
       s.storingSorted();
    }
    
}
