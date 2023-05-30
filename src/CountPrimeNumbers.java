public class CountPrimeNumbers {
    public static void main(String[] args) {
        int n=10;
        int count =0;
        --n;
        while(n>=2){
            boolean b=true;
            for(int i=2;i<=n/2;i++) if(n%i==0) b=false;
            if(b) count++;
            n--;
        }
        System.out.println(count);
    }
}
