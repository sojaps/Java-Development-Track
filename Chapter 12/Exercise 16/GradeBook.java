import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook implements Serializable{
    private int[][] grades = new int[12][5];
    private transient Scanner classInput = new Scanner(System.in);

    public void getGrades(){
        int id =0;
        do {
            System.out.printf("\nENTERING SCORES FOR STUDENT ID %d\n\n",id+1);
            System.out.println(id);
            System.out.print(grades.length);
            for (int i = 0; i <5; i++) {
                System.out.printf("Enter score for exam %d: ",i+1);
                grades[id][i]=Integer.parseInt(classInput.nextLine());
            }
            id++;
        } while (id<grades.length);
    }

    public void showGrades(){
        int counter=1;
        int counter2=1;
        for (int[] is : grades) {
            System.out.printf("==============Student %d==============\n\n",counter);
            for (int i : is) {
                System.out.printf("Score %d: %d",counter2,i );
                counter2++;
            }
            counter++;
            counter2=1;
        }
    }

    public void studentAvg(int studentNumber){
        int sum=0;
        for (int is : grades[studentNumber-1]) {
            sum +=is;
        }
        System.out.printf("Student %d average: %d",studentNumber,sum/5);
    }

    public void testAvg(int testNumber){
        int sum=0;
        for (int[] is : grades) {
            sum += is[testNumber];
        }
        System.out.printf("Test %d average: %d",testNumber,sum/12);
    }
}
