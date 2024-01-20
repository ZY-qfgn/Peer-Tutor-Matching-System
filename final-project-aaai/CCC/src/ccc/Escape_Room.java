/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc;

import java.io.*;

/**
 *
 * @author john
 */
public class Escape_Room {
    
    public static void main(String[] args) throws IOException{
        int m, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of rows: ");
        m = Integer.parseInt(br.readLine());
        System.out.println("Please enter the number of columns: ");
        n = Integer.parseInt(br.readLine());
        int room[][] = new int[m][n];
        for (int i=0; i<room.length; i++){
            for (int j=0; j<room[0].length; j++){
                System.out.println("Please enter the number in the room: ");
                room[i][j] = Integer.parseInt(br.readLine());
            }
        }
        /*
        for (int i=0; i<room.length; i++){
            for (int j=0; j<room[0].length; j++){
                System.out.print(room[i][j]+"\t");
            }
            System.out.println();
        }
        */
        System.out.println(escapeRoom(room, 0, 0));
    }
    
    public static boolean escapeRoom(int[][] ar, int a, int b){
        if (ar[0][0] == 1){
            if (ar.length == 1 && ar[0].length == 1){
                return true;
            }
            return false;
        }
        else{
            if (ar.length == 1 && ar[0].length == 1){
                return false;
            }
            int i=1;
            //for (int i=0; i<(int)Math.sqrt(ar[a][b]); i++){
            while (i<=Math.sqrt(ar[a][b])){
                if (ar[a][b] % i == 0){
                    int x = i;
                    int y = ar[a][b] / i;
                    System.out.println("x: "+x+", y: "+y);
                    if (x==ar.length && y==ar[0].length || y==ar.length && x==ar[0].length){
                        System.out.println("Almost");
                        return true;
                    }
                    else if (x<=ar.length && y<=ar[0].length || y<=ar.length && x<=ar[0].length){
                        System.out.println("Here");
                        escapeRoom(ar, x, y);
                    }
                }
                System.out.println("Is it");
                i++;
            }
           return false;
        } 
        
    }
}
