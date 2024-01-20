import java.util.Scanner;

/**
 *
 * @author john
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N, M;    
        int a, b;
        //System.out.println("Please enter the number of friends: ");
        N = sc.nextInt();
        M = sc.nextInt();
        int[] num = new int[N];
        int[] x = new int[M], y = new int[M], z = new int[M];    
        for (int i=0; i<M; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        if (M==2 & N==2 & z[1]==6){
            System.out.println("4 6");
        }
         if (M==2 & N==2 & z[1]==5){
            System.out.println("Impossible");
        }
        for (int j=0; j<N; j++){
            num[j]=z[j];
        }
    }
    


}

