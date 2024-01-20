/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc2021;

import java.util.*;
/**
 *
 * @author john
 */
public class Lunch_Concert {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N;   
        int pi, wi, di;       
        //System.out.println("Please enter the number of friends: ");
        N = sc.nextInt();
        int[] p = new int[N];
        int[] w = new int[N];
        int[] d = new int[N];
        //System.out.println("Please enter their position, speed, and range of hearing: ");
        for (int i=0; i<N; i++){
            pi = sc.nextInt();
            p[i] = pi;
            wi = sc.nextInt();
            w[i] = wi;
            di = sc.nextInt();
            d[i] = di;
        }
        double[] times = new double[findMax(p)-findMin(p)+1];
        double c=findMin(p);
        int x=0;
        while (c<=findMax(p)){
            double time=0; 
            for (int i = 0; i < N; i++){               
                int distance = (int) Math.abs(c-p[i]) - d[i];
                //System.out.println("d:"+distance);
                if (distance > 0){
                    double t = distance*w[i];
                    //System.out.println("time:"+t);
                    time+=t;                        
                }                                     
            } 
            times[x] = time; 
            //System.out.println("total time:"+time);     
            //System.out.println("pos:"+c);
            x++;
            c++;
        }
        for (int i=0; i<times.length; i++){
            //System.out.println(times[i]);
        }
        System.out.println(findMin(times));
        //System.out.println("c position: "+findMin(p)+findMinIndex(times));

    }
    
    public static int findMin(int[] num){
        int min = num[0];
        for (int i=1; i<num.length; i++){
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }
    
    public static int findMax(int[] num){
        int max = num[0];
        for (int i=1; i<num.length; i++){
            if (num[i] > max)
                max = num[i];
        }
        return max;
    }
    
    public static double findMin(double[] num){
        double min = num[0];
        for (int i=1; i<num.length; i++){
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }

}
