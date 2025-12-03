import java.util.Scanner;

public class M07StudentGrading {

    static void displayStudentGrade(String name, char grade){
        System.out.printf("%s got %c grade!", name, grade);
    }

    static char calculateGrade(int score){
        if(score>=90 && score<=100)
            return 'A';
        else if(score>=80 && score<=89)
            return 'B';
        else if(score>=70 && score<=79)
            return 'C';
        else if(score>=60 && score<=69)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        displayStudentGrade(name,calculateGrade(score));
        scanner.close();
    }
}
