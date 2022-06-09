public class NonAcademicCourse extends Course{
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered; 
    private boolean isRemoved;

    public NonAcademicCourse(String courseID,String courseName,int duration,String prerequisite){
        super(courseID,courseName,duration);
        this.prerequisite=prerequisite;
        startDate="";
        completionDate="";
        examDate="";
        this.isRegistered=false;
        this.isRemoved=false;
    }

    public String getinstructorName(){
        return instructorName;
    }

    public String getstartDate(){
        return startDate;
    }

    public String getcompletionDate(){
        return completionDate;
    }

    public String getexamDate(){
        return examDate;
    }

    public String getprerequisite(){
        return prerequisite;
    }

    public  boolean getisRegistered(){
        return isRegistered;
    }

    public boolean getisRemove(){
        return isRemoved;
    }

    public void setinstructorName(String instructorName){
        if(isRegistered==false){
            this.instructorName=instructorName;
        }
        else{
            System.out.println("the instructorName cannot be changed");
        }
    }

    public void register(String courseLeader,String instructorName,String startDate,String completionDate,String examDate){
        if(!isRegistered){
            super.setnewCourseLeader(courseLeader);
            this.setinstructorName(instructorName);
            this.startDate= startDate;
            this.examDate = examDate;
            this.completionDate=completionDate;
            isRegistered=true;
            isRemoved=false;
        }
        else{
            System.out.println("The NonAcademicCourse is already registered");

        }
    }

    public void remove(){
        if(isRemoved==true){
            System.out.println("the nonAcademicCourse is already removed");
        }
        else{
            super.setnewCourseLeader("");
            instructorName="";
            startDate="";
            examDate="";
            isRegistered=false;
            isRemoved=true;
        }
    }

    public void displayDetail(){
        super.displayDetail();
        if(isRegistered==true){
            System.out.println("instructor name"+ instructorName);
            System.out.println(" starting date with"+ startDate);
            System.out.println("completion  date"+ completionDate);
            System.out.println("exam data"+ examDate);
            System.out.println(" the  prerequistie"+ prerequisite);
        }
    }
}

