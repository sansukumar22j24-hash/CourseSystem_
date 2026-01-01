package CourseSystem_;

public class OnlineCourse extends Course {
    private String courseId;
    private int fee;
    private Student student;
    public OnlineCourse (){

    }

    public OnlineCourse ( String courseId,int fee){
this.courseId=courseId;
this.fee=fee;
    }

}
