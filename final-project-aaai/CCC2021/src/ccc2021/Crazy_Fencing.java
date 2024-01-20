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
public class Crazy_Fencing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numf;    
        System.out.println("Please enter the number of fences: ");
        numf = sc.nextInt();
        int[] height = new int[numf+1];
        int[] width = new int[numf];
        
        System.out.println("Please enter the heights of each fence: ");
        for (int i=0; i<height.length; i++){           
            height[i] = sc.nextInt();
        }
        System.out.println("Please enter the widths of each fence: ");
        for (int i=0; i<width.length; i++){           
            width[i] = sc.nextInt();
        }
        
        double area=0;
        for (int i=0; i<numf; i++){
            area += (double)(height[i]+height[i+1])*width[i]/2;
        }
        
        System.out.println(area);
    }
    
}
