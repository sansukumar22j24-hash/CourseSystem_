package CourseSystem_;

public class OnlineCourse extends Course  implements OnlineCourseInterface{

    public OnlineCourse (){

    }

    public OnlineCourse ( String courseId,int fee){
        this.setCourseId(courseId);
        this.setFee(fee);
        //this.setStudent(student);

    }

}
