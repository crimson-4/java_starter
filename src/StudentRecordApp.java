import  java.util.*;
public class StudentRecordApp
{
   static Scanner scanner =new Scanner(System.in);
    static List<Student> students= new ArrayList<>();
    static    void addStudent(){
        scanner.nextLine();
        String name=scanner.nextLine();
        int id=students.size();


        Student st=new Student(id,name);
        students.add(st);
        System.out.println("Student "+name+"added with id: "+(id));
    }
    static  void addGrade(){
        System.out.println("Enter the roll number");
        int rno=scanner.nextInt();
        System.out.println("Enter the grade");
        int grade= scanner.nextInt();
        Student student= students.get(rno);
        student.setGrade((char)grade);
    }
    static  void viewStudentsByRoll(){
        System.out.println("Enter the roll number");
        int rollNo=scanner.nextInt();
        scanner.nextLine();
        Student student =students.get(rollNo);
        System.out.println(student);
    }
    static  void viewAllStudents(){
        if(students.isEmpty())
        {
            System.out.println("No student to display");
            return;
        }
        for(Student student:students)
        {
            student.displayInfo();
        }
    }

     public static void main(String[] args) {

         while(true)
         {
             System.out.println("\n--- Student Record Menu ---");
             System.out.println("1. Add Student");
             System.out.println("2. Add Grade to Student");
             System.out.println("3. View Student by Roll No");
             System.out.println("4. View All Students");
             System.out.println("5. Exit");
             System.out.print("Enter your choice: ");
             int choice= scanner.nextInt();
             switch (choice)
             {
                 case  1->addStudent();
                 case  2->addGrade();
                 case  3->viewStudentsByRoll();
                 case  4->viewAllStudents();
             }
         }

    }
}

class Student {
    private final int id;
    private final String name;
    private  final ArrayList<Integer> grades;
    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
        grades=new ArrayList<>();
    }

    public void setGrade(char grade) {
        this.grades.add((int)grade);
    }

    public  void displayInfo(){
        System.out.println("Student Id : " +id);
        System.out.println("Student Name: "+name);
        for(int i=0;i<grades.size();i++)
        {
            System.out.println(grades.get(i)+" ");
        }
    }

}



