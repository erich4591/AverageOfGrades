import java.util.Scanner;

public class AverageOfGrades {
	
	public static void main (String[] args) throws java.lang.Exception {
		
    double average = 0;
    double i = 0;
    int student = 0;
    boolean flag = true;
    Scanner input = new Scanner(System.in);
    System.out.println("Display student's average: -1");
    System.out.println("Terminate pragram: -2");
    while(flag) {
        System.out.printf("Student: ");
        System.out.println(student);
        System.out.print("Enter Your Score: ");
        

        double score = input.nextDouble();
        if(score!=-1){
            average=average+score;
            i=i+1;
        }

        if(score==-1) {
            System.out.printf("Average: ");
            System.out.println(average/i);
            //reset values
            average = 0;
            i = 0;
            student=student+1;
        }
        if(score==-2) {
        	System.out.println("Program terminated.");
            flag = false;
        }
    }
	}
}

