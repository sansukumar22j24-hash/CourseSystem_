package CourseSystem_;

public interface CourseInterface {
    public void enroll();
    public String getCourseId();
    public void setCourseId(String courseId);
    public int getFee();
    public void setFee(int fee);
    public StudentInterface getStudent();
    public void setStudent(StudentInterface student);


}
