/*Bubble sort code in java.Here we are generating random numbers between 1 to 100 
and storing them into the file.Then we sort those numbers using bubble sort and again
store them into the another file.Also here we are calculating the time for sorting.
*/
package bubblesort;
import java.util.*;
import java.time.LocalTime;
import java.io.FileWriter;
import java.time.temporal.ChronoUnit;

public class BubbleSort {

    
    public static void main(String[] args) throws Exception {
        FileWriter Writer=new FileWriter("D:/BubblesortUnsorted.txt");
        FileWriter Writer2=new FileWriter("D:/BubblesortSorted.txt");
        int A[]=new int[100000];
        int temp,n=100000;
        Random r=new Random();
        for(int i=0;i<100000;i++){
        A[i]=1+r.nextInt(100); // Generating random numbers 
        }
       
        for(int i=0;i<100000;i++){
             
            Writer.write(A[i]+","); // Writing unsorted numbers into the file
        }
        
        LocalTime starttime=LocalTime.now();
        System.out.println("Sorting started at:"+starttime);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        LocalTime endtime=LocalTime.now();
        System.out.println("Sorting ended at:"+endtime);
        long hours=ChronoUnit.HOURS.between(starttime,endtime);
        long minutes=ChronoUnit.MINUTES.between(starttime,endtime)%60;
        long seconds=ChronoUnit.SECONDS.between(starttime, endtime)%60;
       long milleseconds=ChronoUnit.MILLIS.between(starttime, endtime)%1000;
       System.out.println("The total time taken for sorting is:"+hours+" hours "+minutes
        +" minutes "+seconds+" seconds "+milleseconds+" milliseconds");
        for(int i=0;i<100000;i++){
             
            Writer2.write(A[i]+",");// Writting sorted numbers into the file
        }
       
        
        
    }
    
}
