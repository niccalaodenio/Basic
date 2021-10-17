/*
File Name: Score.java
Programmer: Nicca Laodenio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Score
  {
    public static void main(String[]args)
      {
         double total_item = 100, Score, Grades;
         Scanner input = new Scanner(System.in);
         System.out.print("Input your score and press 'enter key':");
         	Score = input.nextInt();
         Grades = (Score/total_item)* 50 + 50;
         System.out.println("The sum of two numbers:" + Grades);
      }
  }