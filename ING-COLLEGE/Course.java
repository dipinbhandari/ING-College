public class Course {
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    public Course(String courseID, String courseName, int duration){
        this.courseID=courseID;
            this.courseName=courseName;
            this.duration=duration;
            courseLeader="";
    } 
   
    public String getCourseID(){ 
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }   
    public String getCourseLeader(){
      return courseLeader;
    }   
    public int getDuration(){
        return duration;
    }
    public void setnewCourseLeader(String cleader){
        this.courseLeader=cleader;
    }
    public void setnewcourseName(String courseName){
        this.courseName=courseName;
    }
    public void displayDetail(){
    System.out.println("The  name of  course ID is "+ courseID);
    System.out.println("The  name of course Name is " + courseName);
    System.out.println("The  whole duration is " + duration);
    if(courseLeader!= ("")){
    System.out.println("The name of course leader is " + courseLeader);
        }
    }

}