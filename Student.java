package CourseSystem_;



public  class Student implements StudentInterface{
    private int duration;
    private String courseType;
    private CourseInterface onlineCourse;
    private CourseInterface offlineCourse;

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

    public CourseInterface getOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(CourseInterface onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public CourseInterface getOfflineCourse() {
        return offlineCourse;
    }

    public void setOfflineCourse(CourseInterface offlineCourse) {
        this.offlineCourse = offlineCourse;
    }
}
