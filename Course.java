package CourseSystem_;

public abstract class Course  implements CourseInterface {
    private String courseId;
    private int fee;
    private StudentInterface student;
    public void enroll(){
        this.fee=student.getDuration()*500;
        System.out.println(student.getDuration());

    }



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    public StudentInterface getStudent() {
        return student;
    }

    public void setStudent(StudentInterface student) {
        this.student = student;
    }
}
