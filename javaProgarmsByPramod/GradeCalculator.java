package javaProgarmsByPramod;

public class GradeCalculator
{
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    
    public static void main(String[] args) {
        int score = 85; // Replace with your numerical score
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
