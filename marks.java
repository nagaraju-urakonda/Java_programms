import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name :");
        String name = sc.next();
        System.out.println("Enter roll number :");
        int rollno = sc.nextInt();
        System.out.println("Enter subject marks :");
        int marks = 0;
        int total = 0;
        boolean fail = false;
        int avg =0;
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter Marks for Subject "+" "+ i);
            marks = sc.nextInt();
            total += marks;
            if (marks < 35) {
                fail = true;
            }
        }
        avg = total / 5;
        System.out.println("----------RESULT---------");
        System.out.println("Student Name"+ ":"+name);
        System.out.println("Student Name"+ ":"+rollno);
        
        
        System.out.println("Total marks :"+total);
        if (fail) {
            System.out.println("Fail");
        }
        else if (avg >= 90 && avg <= 100) {
            System.out.println("Average :"+ avg);
            System.out.println("A+");
        }
        else if (avg >= 80 && avg <= 89) {
            System.out.println("Average :"+ avg);
            System.out.println("A");
        }
        else if (avg >= 70 && avg <= 79) {
            System.out.println("Average :"+ avg);
            System.out.println("B");
        }
    }
}
