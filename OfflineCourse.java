package CourseSystem_;

public class OfflineCourse extends Course{
    private String courseId;
    private int fee;
    private Student student;
    public OfflineCourse (){

    }
    public OfflineCourse ( String courseId,int fee){
        this.courseId=courseId;
        this.fee=fee;
    }
}
