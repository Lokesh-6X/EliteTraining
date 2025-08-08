import java.util.*;

public class GenerateTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}
