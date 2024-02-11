// from array returning how many numbers contain even number of digits
package evennumberofdigits;


public class EvenNumberOfDigits {

    static int countDigits(int n){
        int i=0;
        while(n!=0){
            n=n/10;
            i++;
        }
        return i;
    }
   static int countEven(int A[]){
       int count=0;
       int j;
       for(int i=0;i<A.length;i++){
         j=countDigits(A[i]);
         if(j%2==0){
             count++;
         }
       }
       return count;
   }
    public static void main(String[] args) {
        int A[]={12,345,2,6,7896};
    System.out.println("The total number of numbers having even number of digits were "
   +countEven(A) );
    }
    
}
