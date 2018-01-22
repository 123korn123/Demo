/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass2;

import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class InClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Student : ");
        int numStd = sc.nextInt();

        System.out.print("Enter " + numStd + " Scores : ");
        double[] scores = getScores(numStd);

        double top = getBestScore(scores);

//        double top2 = 0;
//        for(int x =1;x<numStd;x++){
//            if(scores[x]>top2){
//                top2 = scores[x];
//        }
//        }
        for (int x = 0; x < scores.length; x++) {
            System.out.println("Student " + x + " Scores Is " + scores[x] + " And Grade is " + grade(scores[x], top));
        }
        System.out.println("Best Scores : " + getBestScore(scores));
    }

    public static char grade(double score, double top) {
        char grade;

        if (score >= top - 10) {
            grade = 'A';
        } else if (score >= top - 20) {
            grade = 'B';
        } else if (score >= top - 30) {
            grade = 'C';
        } else if (score >= top - 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;

    }

    public static double getBestScore(double[] theScores) {
        double theBest = theScores[0];
        for (int i = 0; i < theScores.length; i++) {
            if (theScores[i] > theBest) {
                theBest = theScores[i];
            }
        }
        return theBest;
    }

    public static double[] getScores(int isScores) {
        Scanner sc = new Scanner(System.in);
        double scores[] = new double[isScores]; 
        for (int i = 0; i < isScores; i++) {
            scores[i] = sc.nextDouble();
        }
        return scores;
    }
}

//        for(int i = 0;i<numStd;i++){
//            scores[i]=sc.nextDouble();
//        for(double tempScore:scores){
//            System.out.println("-----------"+tempScore);
// TODO code application logic here

