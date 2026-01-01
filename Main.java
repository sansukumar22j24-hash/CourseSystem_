package CourseSystem_;
import java.util.Scanner;
//Scanner file imported from the util package
public class Main {
    public static void main(String [] args) {
//created the student object and pass the value in in the constructor 3,online
        Student student1 = new Student(3, "Online");
// taking the input fron the Terminal using the scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Duration ");
       // taking the input from terminal and save in the integer input in a
        int a = sc.nextInt();
        // to access the string input from the terminal we are using the sc.nextLINE
        sc.nextLine();
        //  // taking the input from terminal and save in the string input in b
        System.out.println("Enter the course ");
        String b = sc.nextLine();
        // afetr storing the sting close the scanner using the sc.close();
        sc.close();

        Student student2 = new Student();
        // creating the student object using the new key word and initialize the default value when the object is created ;
        student2.setDuration(a);
        //using the student2 it get student Contract and go to the student object and searchthe method and that method call again to me and it ask that what i want to pass in the  parameter thin i say pass the  a;
        student2.setCourseType(b);
        // like this also happen
        {// default i open the block
            // check the student1 course type equals to the online then go to the if block else it goe to the else block
            if (student1.getCourseType() == "Online") {
                // wen the object is created here  it initialize the courseid and fee
                OnlineCourse onlineCourse = new OnlineCourse("Abc", 1000);
                //convey the onlinecourse to student
                student1.setOnlineCourse(onlineCourse);
              //  convey the changed studentto online course
                onlineCourse.setStudent(student1);
                // enroll() is call usinthe onlineCourse contract and then it call that method
                onlineCourse.enroll();
                // System.out.println( onlineCourse.getFee());
                if(student1.getCourseType() == "Online"){
                    System.out.println("Student 1 Fee: " + student1.getOnlineCourse().getFee());

                }
                else{
                    System.out.println("Student 1 Fee: " + student1.getOfflineCourse().getFee());}

            } else {
                OfflineCourse offlineCourse = new OfflineCourse("Abc", 500);
                student1.setOfflineCourse(offlineCourse);
                offlineCourse.setStudent(student1);
                offlineCourse.enroll();
                //System.out.println(offlineCourse.getFee());
                if(student1.getCourseType() == "Online"){
                    System.out.println("Student 1 Fee: " + student1.getOnlineCourse().getFee());

                }
                else{
                    System.out.println("Student 1 Fee: " + student1.getOfflineCourse().getFee());}

            }

        }
        {
            if (student2.getCourseType() == "Offline") {
                OnlineCourse onlineCourse = new OnlineCourse("Abc", 500);
                student2.setOnlineCourse(onlineCourse);
                onlineCourse.setStudent(student2);
                onlineCourse.enroll();
                System.out.println(onlineCourse.getFee());

            } else {
                OfflineCourse offlineCourse = new OfflineCourse("Abc", 1000);
                student2.setOfflineCourse(offlineCourse);
                offlineCourse.setStudent(student2);
                offlineCourse.enroll();
                // offlineCourse.getFee();
            }
            System.out.println("Student 2 Fee: " + student2.getOfflineCourse().getFee());
        }

//        System.out.println("CourseId: " + student1.getOnlineCourse().getCourseId());
//
//        System.out.println("CourseId: " + student2.getOfflineCourse().getCourseId());


    }
}
//    System.out.println(  student1.getOnlineCourse().getStudent());
////
//    System.out.println(student1.getOnlineCourse().getFee());
////    student1.setFee(onlineCourse.getFee());
//           // System.out.println(student2.getOfflineCourse().getFee());
/// /            student2.setFee(offlineCourse.getFee());
/// ///            System.out.println(  student2.getOnlineCourse().getStudent());
/// ////
/// //    // System.out.println(  student1.getOfflineCourse().getStudent());
/// //
/// //    System.out.println(  student1.getOfflineCourse().getStudent());
/// //
//System.out.println(student2.getOnlineCourse().getFee())
// System.out.println(  student2.getOfflineCourse().getStudent());