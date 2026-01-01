package CourseSystem_;

public class Student {
    private int duration;
    private String courseType;
//    private String courseId;
//    private int fee;
    private OnlineCourse onlineCourse;
    private OfflineCourse offlineCourse;

  public Student(int duration,String courseType){
      this.duration=duration;
      this.courseType=courseType;
  }
    public Student(){

    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public OnlineCourse getOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public OfflineCourse getOfflineCourse() {
        return offlineCourse;
    }

    public void setOfflineCourse(OfflineCourse offlineCourse) {
        this.offlineCourse = offlineCourse;
    }
}
