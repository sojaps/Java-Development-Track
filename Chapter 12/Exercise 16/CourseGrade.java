import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.Serializable;

public class CourseGrade {
    public static void main(String[] args)
    {
        boolean end = true;
        Scanner input = new Scanner(System.in);
        File file;
        FileOutputStream outputFile;
        ObjectOutputStream objectOutputFile;
        String filename;
        GradeBook gradeBook = new GradeBook();
        do {
            System.out.print("[1] Input grades of students\n[2] Get student average\n[3] Get test average\n[4] Export to text file\n\nChoose from the following options: ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    gradeBook.getGrades();
                    break;
                case 2:
                    System.out.print("Enter student number: ");
                    gradeBook.studentAvg(Integer.parseInt(input.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter test number: ");
                    gradeBook.testAvg(Integer.parseInt(input.nextLine()));
                    break;
                case 4:
                    System.out.print("Enter file name: ");
                    filename = input.nextLine();
                    file = new File(filename);
                    try {
                        outputFile = new FileOutputStream(filename);
                        if(!file.exists()){
                            objectOutputFile = new ObjectOutputStream(outputFile);
                            objectOutputFile.writeObject(gradeBook);
                        }
                        else{
                            objectOutputFile = new ObjectOutputStream(outputFile);
                            objectOutputFile.writeObject(gradeBook);
                        }
                        objectOutputFile.close();
                        outputFile.close();
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    end = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
                }
        } while (end);
    }
}
