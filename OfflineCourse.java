package CourseSystem_;

public class OfflineCourse extends Course implements OfflineInterface{
//    private String courseId;
//    private int fee;

    public OfflineCourse (){

    }
    public OfflineCourse ( String courseId,int fee){   //,Student student){
        this.setCourseId(courseId);
        this.setFee(fee);
        //this.setStudent(student);
    }
}
