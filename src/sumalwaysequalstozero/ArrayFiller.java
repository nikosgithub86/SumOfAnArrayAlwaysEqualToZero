package sumalwaysequalstozero;
public class ArrayFiller {
private int N;
private int[]A;
public int[] makeAnArray(){
    A = new int[N];
    return A;
}
public int returnSumAlwaysZero(int[] A){
    int sum =0;
    for(int i=0;i<A.length;i++){
        sum += A[i];
    }
    
   return sum;
    
}

    public void fill(){
        int j =0;
       if(A.length%2==0){
            for(int i=0;i<A.length/2;i++){
                A[i] = ((-1)*N) +i;
            }
            for(int i =A.length-1; i>=A.length/2;i--){
                  
              A[i]= N-j;
              j++;
           }
        }
       else if(A.length%2!=0){
           A[(A.length-1)/2] = 0;
           for(int i =0;i<(A.length-1)/2;i++){
               A[i]=((-1)*N) +i;
           }
            for(int i =A.length-1;i>(A.length-1)/2;i--){
               
                    A[i]= N-j;
                j++;
       }
    }
    
}

    public ArrayFiller() {
    }
    
    
    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }

}
