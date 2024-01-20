package ccc2021;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Morden_Art {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int M, N, K;    
        System.out.println("Please enter the number of rows: ");
        M = sc.nextInt();
        System.out.println("Please enter the number of columns: ");
        N = sc.nextInt();
        int[][] canva = new int[M][N];
        
        System.out.println("Please enter the number of tries: ");
        K = sc.nextInt();
        System.out.println("Please enter the details of those tries: ");
        for (int i = 0; i<K; i++){
            String direction = sc.next();
            int num = sc.nextInt();
            if (direction.equals("R")){
                for (int j=0; j<N; j++){
                    if (canva[num-1][j] ==0)
                        canva[num-1][j] = 1;
                    else
                        canva[num-1][j] = 0;
                }
            }
            else if (direction.equals("C")){
                for (int s=0; s<M; s++){
                    if (canva[s][num-1] == 0)
                        canva[s][num-1] = 1;
                    else
                        canva[s][num-1] = 0;
                }
            }
        }
        
        int gold=0;
        for (int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                gold += canva[i][j];
            }
        }
        System.out.print(gold);
    }
}
