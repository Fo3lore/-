//              ЛАБОРАТОРНАЯ РАБОТА 1     ||   ВЫПОЛНИЛ:   ПИГАРЕВ Н.А. 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Student{

    String name;
    int course;
    float stipendia;

    public Student(String name, int course, float stipendia){
            this.name = name;
            this.course = course;
            this.stipendia = stipendia;
    }

    void print(){
            System.out.printf("%20s %4d %15f \n", name, course, stipendia);
        }
    
    void printToFile(PrintStream stream) {
            stream.printf("%20s %4d %15f \n", name, course, stipendia);
        }    
    public static void main(String[] args) {
        Student students[] = new Student[12];

        students[0] = new Student("John A.A.",1,1400);
        students[1] = new Student("Den B.A.",3,3000);
        students[2] = new Student("Kristian C.C.",2,2100);
        students[3] = new Student("Lock B.A.",1,1400);
        students[4] = new Student("Kemeron D.A.",1,1600);
        students[5] = new Student("Peris V.V.",4,4000);
        students[6] = new Student("Merlen B.A.",2,2100);
        students[7] = new Student("Falk M.M.",3,2900);
        students[8] = new Student("Rtus T.R.",3,2800);
        students[9] = new Student("Koral L.D.",2,2500);
        students[10] = new Student("Gorand G.H.",2,2100);
        students[11] = new Student("Poor F.F.",1,1600);
        
        System.out.printf("%20s %6s %12s \n", "Студент","Курс","Стипендия");
        for (Student student : students) student.print();

    //Сортировка
        for (int i = 0; i < students.length; i++){ 
            int j_max = i;

            for (int j = i + 1; j < students.length;j++){
                if(students[j_max].stipendia < students[j].stipendia) j_max = j;
            }
            
            Student tmp = students[i];
            students[i] = students[j_max];
            students[j_max] = tmp;
        }

        System.out.printf("После сортировки по стипендии\n");
        for (Student student : students) student.print();

        try {
            PrintStream out = new PrintStream(new File("C:/Users/nikit/Desktop/mypackage/LB1_PIGAREV.txt"));
            for (Student student : students) {student.printToFile(out);}  

        } catch (FileNotFoundException e) {System.err.println(e.getMessage());}
    }
   
}
 

