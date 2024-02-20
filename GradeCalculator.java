package practice1;

import java.util.Scanner;

public class GradeCaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n = sc.nextInt();

		float[] marks = new float[5];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks of Subject " + (i + 1) + ":");
			marks[i] = sc.nextFloat();
		}
		float totalmarks = 0;
		float average = 0;
		for (int i = 0; i < n; i++) {
			totalmarks += marks[i];
		}
		average = (totalmarks / n);
		char grade;
		if (average >= 90) {
			grade = 'S';
		} else if (average >= 80) {
			grade = 'A';
		} else if (average >= 70) {
			grade = 'B';
		} else if (average >= 60) {
			grade = 'C';
		} else if (average >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("\nResults:");
		System.out.println("Total Marks: " + totalmarks);
		System.out.println("Average Percentage: " + average + "%");
		System.out.println("Grade: " + grade);

	}

}
