/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccc;

import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author john
 */
public class Surmising_Sprinter_Speed {
    
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat ("0.00");
        int num;
        double speed, maxSpeed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of observations: ");
        num = sc.nextInt();
        int[][] record = new int[num][2];
        for (int i=0; i<num; i++){
                System.out.println("Please enter the time recorded: ");
                record[i][0] = sc.nextInt();
                System.out.println("Please enter the distance recorded: ");
                record[i][1] = sc.nextInt();                
        }
        /*
        for (int i=0; i<num; i++){
            for (int j=0; j<2; j++){
                System.out.println(record[i][j]);
            }
        }
        */
        // Algorithm: 比较次数：n x (n-1) / 2
        for (int i=0; i<num-1; i++){
            for (int j=i; j<num-1; j++){
                double dd = record[i][1]-record[j+1][1];
                double td = record[i][0]-record[j+1][0];
                speed = Math.abs(dd/td);
                //speed = (record[i][1]-record[j+1][1])/(record[i][0]-record[j+1][0]);
                //System.out.println(speed+", "+(record[i][1]-record[j+1][1])+", "+(record[i][0]-record[j+1][0])+", "+(record[i][1]-record[j+1][1])/(record[i][0]-record[j+1][0]));
                if (speed > maxSpeed){
                    maxSpeed = speed;
                }
            }
        }
        //System.out.println("Maximum Speed: "+df.format(maxSpeed));
        System.out.println("Maximum Speed: "+maxSpeed);
    }
    
}
