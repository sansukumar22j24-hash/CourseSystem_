package CourseSystem_;

public interface StudentInterface {
//    public StudentInterface(int duration,String courseType);
//
 public String getCourseType();
    public void setCourseType(String courseType);
    public int getDuration();
    public void setDuration(int duration);
    public CourseInterface getOnlineCourse();
    public void setOnlineCourse(CourseInterface onlineCourse);
    public CourseInterface getOfflineCourse();
    public void setOfflineCourse(CourseInterface offlineCourse);


}
