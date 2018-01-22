
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INT105
 */
public class Scores2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stdNo;
        System.out.print("Rnter The Number Of Student : ");
        stdNo = sc.nextInt();
        double[][] scores = new double[stdNo][2];
        for (int i = 0; i < stdNo; i++) {
            System.out.print("Enter midterm and Final scores of student  " + (i+1) + ": ");
            scores[i][0] = sc.nextDouble();
            scores[i][1] = sc.nextDouble();
        }
        for(int i = 0;i<stdNo;i++){
            System.out.print("Student "+(i+1)+" Scores : mid ="+scores[i][0]+" and Final = "+scores[i][1]);
            System.out.println("ผลรวม "+(i+1)+" mid+final ="+(scores[i][0]+scores[i][1]));
        }
    }

}
