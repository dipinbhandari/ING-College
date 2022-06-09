public class AcademicCourse extends Course{
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private float numberOfAssessments;
    private boolean isRegistered;
    private boolean Clear;
    private int duration;

    public AcademicCourse(String courseID,String courseName,int duration,String level,String credit,float numberOfAssessments){
        super(courseID,courseName,duration);
        this.level=level;
        this.credit= credit;
        this.numberOfAssessments=numberOfAssessments;
        lecturerName= "";
        startingDate= "";
        completionDate = "";
        isRegistered= false;

    }

    public String getlecturerName(){
        return this.lecturerName;
    }

    public String getlevel(){
        return this.level;
    }

    public String getcredit(){
        return this.credit;
    }

    public String getstartingDate(){
        return this.startingDate;
    }

    public String getcompletionDate(){
        return this.completionDate;
    }

    public float getnumberOfAssessments(){
        return this.numberOfAssessments;
    }

    public boolean getisRegistered(){
        return this.isRegistered;
    }

    public boolean clear(){
        return this.Clear;
    }

    public void setnewlecturerName(String lecturerName){
        this.lecturerName= lecturerName;
    }

    public void setnewnumberOfAssessments(float numberOfAssessments){
        this.numberOfAssessments= numberOfAssessments;
    }

    public void register( String courseLeaderName, 
    String lecturerName, 
    String startingDate, 
    String completionDate){
        if(isRegistered==true){
            System.out.println("The lecturer name is: "+lecturerName+","+
                "Starting Date and completion date is: "+
                startingDate+"and"+completionDate+"respectively");
        }

        else {
            super.setnewCourseLeader(courseLeaderName);            
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            isRegistered=true;

        }

    }

    public void clearAcademic(){
        if(Clear == false){
            startingDate = "";
            duration = -1;
            super.setnewcourseName("");
            Clear= true;
            isRegistered =false;
        }else{
            System.out.println("The CourseID is already Removed.");
        }
    }

    public void displayDetail(){
        super.displayDetail();

        if(isRegistered==true){
            System.out.println("The Lecturer name is: "+getlecturerName());
            System.out.println("The Level name is: "+getlevel());
            System.out.println("The Credit name is: "+ getcredit());
            System.out.println("The Starting date  start with: "+getstartingDate());
            System.out.println("The Completion date  began with: "+getcompletionDate());
            System.out.println(" assessment  number is: "+getnumberOfAssessments());
        }
    }   
}
