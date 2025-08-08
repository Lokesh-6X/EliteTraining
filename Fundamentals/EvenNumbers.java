import java.util.*;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            for(int i = 2;i<=n;i+=2){
                System.out.print(i+" ");
            }
        }else{
            for(int i = -2;i>=n;i-=2){
                System.out.print(i+" ");
            }
        }
        
    }
}
