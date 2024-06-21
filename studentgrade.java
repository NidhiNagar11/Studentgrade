
import java.util.Scanner;

public class studentgrade {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the marks");
        for(int i =0 ;i<marks.length;i++){
            marks[i]=obj.nextInt();
            
        }
        int totalmarks =0;
        for(int element : marks){
          totalmarks += element;
        }
        int numberofsubj = marks.length;
       
        double averageMarks = (double) totalmarks / numberofsubj;
        double averagePercentage = (averageMarks / 100) * 100;

        String grade;
        if(averagePercentage >= 90){
            grade = "A+";
        }
        else if (averagePercentage >=80){
            grade = "A";
        }
        else if (averagePercentage >=60){
            grade = "B+";
        }
        else if( averagePercentage >= 40){
            grade = "B";
        }
        else
        {
            grade ="C";
        }
        System.out.println("Average Marks = "+ averageMarks);
        System.out.println("Average Percentage ="+ averagePercentage);
        System.out.println("Grade =" + grade);
    
      

        
    }
}
