import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Font;

public class INGCollege
{
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel lbCourse,lbCourseID2, lbCourseName,lbAcademic,lbLevel,lbCourseLeader, lbCredit, lbDuration,lbNumberofAssessment,lbStartingDate,lbComplete,lbNone,lbPrerequitise,lbInstructor,lbLecturerName, lbexamDate;
    private JTextField txtCourseID,txtCourseID2,txtdipinCourseID,txtexamDate,txtcourseleader,txtCompletionDate1,txtstartingdate,txtNonCourseID,txtNon1CourseID, txtCourseLeader1,txtLecturerName,txtClearAcademic, txtCourseName,txtNonCourseName,txtLevel,txtCredit,txtNumberofAssessment,txtNonDuration,txtDuration,txtStartDate,txtCompletionDate,txtPrerequitise,txtInstructor;
    private JButton btnA,ddAcademic,btnAddNonAcademicbtn,AddDisplayAcademic,btnClearAcademic,btnRegister;

    private ArrayList<Course> courses= new ArrayList<Course> ();
    private JLabel lblCompletionDate;

    public INGCollege(){
        initialFrame();
        myFrameA();
        myFrameB();
        frame.setVisible(true);
    }

    public String gettxtCourseID(){
        return txtCourseID.getText();
    }

    public String gettxtdipinCourseID(){
        return txtdipinCourseID.getText();
    }

    public String gettxtNonCourseID(){
        return txtNonCourseID.getText();
    }

    public String gettxtNon1CourseID(){
        return txtNon1CourseID.getText();
    }

    public String gettxtCourseLeader(){
        return txtCourseLeader1.getText();
    }

    public String getCourseLeader(){
        return txtcourseleader.getText();
    }

    public String gettxtCourseName(){
        return txtCourseName.getText();
    }

    public String gettxtNonCourseName(){
        return txtNonCourseName.getText();
    }

    public String gettxtLevel(){
        return txtLevel.getText();
    }

    public String gettxtexamDate(){
        return txtexamDate.getText();
    }

    public String getStartingDate(){
        return txtstartingdate.getText();

    }

    public String gettxtLecturerName(){
        return txtLecturerName.getText();
    }

    public String gettxtCredit(){
        return txtCredit.getText();
    }

    public int gettxtDuration(){
        String Duration = txtDuration.getText();
        int DurationNum = -1;
        try{
            DurationNum = Integer.parseInt(Duration);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Incorrect value for Duration .\nPlease add numeric value","Invalid Input",0);
        }
        return DurationNum;
    }

    public int gettxtNonDuration(){
        String Duration = txtNonDuration.getText();
        int DurationNum = -1;
        try{
            DurationNum = Integer.parseInt(Duration);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Incorrect value for Duration .\nPlease add numeric value","Invalid Input",0);
        }
        return DurationNum;
    }

    public int gettxtNumberofAssessment(){
        String NumberofAssessment = txtNumberofAssessment.getText();
        int NumberofAssessmentNum = -1;
        try{
            NumberofAssessmentNum = Integer.parseInt(NumberofAssessment);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Incorrect value for numberofassessment.\nPlease add numeric value","Invalid Input",0);
        }
        return NumberofAssessmentNum;
    }

    public String gettxtStartingDate(){
        return txtStartDate.getText();

    }
    public String getNonCourseID(){
        return txtNonCourseID.getText();
    }

    public String gettxtCompletionDate(){
        return txtCompletionDate.getText();
    }

    public String getCompletionDate(){
        return txtCompletionDate1.getText();
    }

    public String gettxtPrerequitise(){
        return txtPrerequitise.getText();
    }

    public String gettxtInstructor(){
        return txtInstructor.getText();
    }
    
    public String getCourseID1(){
        return txtCourseID2.getText();
    }

    public void initialFrame(){
        frame = new JFrame("COURSE-REGISTRATION                                                                                                                                                                                                                                                        ∴@dipin-bhandari∴");
        frame.setLayout(null);
        frame.setFont(new Font("Verdana",Font.PLAIN,16));
        frame.setSize(1100,1100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLUE);

        panel1 = new JPanel(); 
        frame.add(panel1);
        panel1.setBounds(0,0,550,790);
        panel1.setLayout(null);
        panel1.setBackground(Color.GRAY);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        panel2 = new JPanel();
        frame.add(panel2);
        panel2.setBounds(250,0,850,800);
        panel2.setLayout(null);
        panel2.setBackground(Color.GRAY);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    }

    public void myFrameA(){
        lbAcademic= new JLabel("ACADEMIC COURSE");
        lbAcademic.setForeground(Color.WHITE);
        panel1.add(lbAcademic);
        lbAcademic.setBounds(220,12,250,80);
        lbAcademic.setFont(new Font("Verdana",Font.PLAIN,16));

        lbCourse = new JLabel("CourseID:");
        panel1.add(lbCourse);
        lbCourse.setBounds(14,100,125,30);

        txtCourseID = new JTextField();
        panel1.add(txtCourseID);
        txtCourseID.setBounds(80,100,150,35);

        lbCourse = new JLabel("Course Name:");
        panel1.add(lbCourse);
        lbCourse.setBounds(270,103,129,35);

        txtCourseName = new JTextField();
        panel1.add(txtCourseName);
        txtCourseName.setBounds(360,103,150,35);

        lbLevel = new JLabel("Level:");
        panel1.add(lbLevel);
        lbLevel.setBounds(35,150,200,30);

        txtLevel = new JTextField();
        panel1.add(txtLevel);
        txtLevel.setBounds(77,150,155,35);

        lbCredit = new JLabel("Credit:");
        panel1.add(lbCredit);
        lbCredit.setBounds(315,150,129,35);

        txtCredit = new JTextField();
        panel1.add(txtCredit);
        txtCredit.setBounds(360,150,150,35);

        lbDuration = new JLabel("Duration:");
        panel1.add(lbDuration);
        lbDuration.setBounds(20,200,125,30);

        txtDuration = new JTextField();
        panel1.add(txtDuration);
        txtDuration.setBounds(77,200,155,35);

        lbNumberofAssessment = new JLabel("NumberofAsess:");
        panel1.add(lbNumberofAssessment);
        lbNumberofAssessment.setBounds(255,200,125,30);

        txtNumberofAssessment= new JTextField();
        panel1.add(txtNumberofAssessment);
        txtNumberofAssessment.setBounds(360,205,150,35);

        JButton btnAddAcademic=new JButton("Add");
        btnAddAcademic.setBackground(Color.GREEN);
        btnAddAcademic.setBounds(10,260,150,45);
        panel1.add(btnAddAcademic);
        btnAddAcademic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae){
                    addAcademicCourse();
                }
            });

        lbCourse=new JLabel("Course ID:");
        panel1.add(lbCourse);
        lbCourse.setBounds(30,330,160,45);

        txtdipinCourseID=new JTextField();
        panel1.add(txtdipinCourseID);
        txtdipinCourseID.setBounds(100,330,150,35);

        lbCourseLeader=new JLabel("CourseLeader:");
        panel1.add(lbCourseLeader);
        lbCourseLeader.setBounds(6,390,125,30);

        txtcourseleader=new JTextField();
        panel1.add(txtcourseleader);
        txtcourseleader.setBounds(100,390,150,35);

        lbStartingDate= new JLabel("StartingDate:");
        panel1.add(lbStartingDate);
        lbStartingDate.setBounds(295,330,125,30);

        txtstartingdate=new JTextField();
        panel1.add(txtstartingdate);
        txtstartingdate.setBounds(380,330,150,35);

        lbLecturerName=new JLabel("LecturerName:");
        panel1.add(lbLecturerName);
        lbLecturerName.setBounds(7,450,125,30);

        txtLecturerName=new JTextField();
        panel1.add(txtLecturerName);
        txtLecturerName.setBounds(100,450,150,35);

        lbComplete=new JLabel("CompletionDate:");
        panel1.add(lbComplete);
        lbComplete.setBounds(275,390,125,30);

        txtCompletionDate=new JTextField();
        panel1.add(txtCompletionDate);
        txtCompletionDate.setBounds(380,390,150,35);

        JButton btnRegisterAcademic=new JButton("Register");
        btnRegisterAcademic.setBackground(Color.BLUE);
        btnRegisterAcademic.setBounds(20,510,150,40);
        panel1.add(btnRegisterAcademic);
        btnRegisterAcademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    isRegistered();
                }
            });

        JButton btnDisplayAcademic=new JButton("Display");
        btnDisplayAcademic.setBounds(200,510,150,40);
        panel1.add(btnDisplayAcademic);
        btnDisplayAcademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    displayDetail();

                }
            });

        JButton btnClearAcademic=new JButton("Clear");
        btnClearAcademic.setBackground(Color.RED);
        btnClearAcademic.setBounds(380,510,150,40);
        panel1.add(btnClearAcademic);
        btnClearAcademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    clearAcademic();
                }
            });

    }

    public void myFrameB(){
        lbNone= new JLabel("NonAcademicCourse");
        lbNone.setForeground(Color.WHITE);
        panel2.add(lbNone);
        lbNone.setBounds(410,10,250,80);
        lbNone.setFont(new Font("Verdana",Font.PLAIN,19));

        lbCourse = new JLabel("CourseID:");
        panel2.add(lbCourse);
        lbCourse.setBounds(330,100,125,30);

        txtNonCourseID = new JTextField();
        panel2.add(txtNonCourseID);
        txtNonCourseID.setBounds(400,100,150,35);

        lbCourse = new JLabel("CourseName:");
        panel2.add(lbCourse);
        lbCourse.setBounds(310,150,129,35);

        txtNonCourseName = new JTextField();
        panel2.add(txtNonCourseName);
        txtNonCourseName.setBounds(402,150,150,35);

        lbDuration=new JLabel("Duration:");
        panel2.add(lbDuration);
        lbDuration.setBounds(590,100,129,30);

        txtNonDuration=new JTextField();
        panel2.add(txtNonDuration);
        txtNonDuration.setBounds(656,100,150,35);

        lbPrerequitise=new JLabel("Prerequities:");
        panel2.add(lbPrerequitise);
        lbPrerequitise.setBounds(570,150,129,30);

        txtPrerequitise=new JTextField();
        panel2.add(txtPrerequitise);
        txtPrerequitise.setBounds(659,150,150,35);

        JButton btnAddNonAcademic=new JButton("Add");
        btnAddNonAcademic.setBackground(Color.GREEN);
        btnAddNonAcademic.setBounds(680,210,150,45);
        panel2.add(btnAddNonAcademic);
        btnAddNonAcademic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae){
                    addNonAcademicCourse();
                }
            });

        lbCourse=new JLabel("Course ID:");
        panel2.add(lbCourse);
        lbCourse.setBounds(345,350,125,30);

        txtNon1CourseID=new JTextField();
        panel2.add(txtNon1CourseID);
        txtNon1CourseID.setBounds(420,350,150,35);

        lbCourseLeader= new JLabel("CourseLeader:");
        panel2.add(lbCourseLeader);
        lbCourseLeader.setBounds(580,350,150,35);

        txtCourseLeader1=new JTextField();
        panel2.add(txtCourseLeader1);
        txtCourseLeader1.setBounds(680,350,150,35);

        lbexamDate= new JLabel("Exam Date:");
        panel2.add(lbexamDate);
        lbexamDate.setBounds(600,390,150,35);

        txtexamDate=new JTextField();
        panel2.add(txtexamDate);
        txtexamDate.setBounds(680,390,150,35);

        lblCompletionDate= new JLabel("Completion Date:");
        panel2.add(lblCompletionDate);
        lblCompletionDate.setBounds(571,430,150,35);

        txtCompletionDate1=new JTextField();
        panel2.add(txtCompletionDate1);
        txtCompletionDate1.setBounds(680,430,150,35);

        lbInstructor=new JLabel("Instructor Name:");
        panel2.add(lbInstructor);
        lbInstructor.setBounds(310,390,125,30);

        txtInstructor=new JTextField();
        panel2.add(txtInstructor);
        txtInstructor.setBounds(420,390,150,35);

        lbStartingDate=new JLabel("StartDate:");
        panel2.add(lbStartingDate);
        lbStartingDate.setBounds(350,430,125,30);

        txtStartDate=new JTextField();
        panel2.add(txtStartDate);
        txtStartDate.setBounds(420,430,150,35);

        lbCourseID2=new JLabel("CourseID:");
        panel2.add(lbCourseID2);
        lbCourseID2.setBounds(412,588,125,30);

        txtCourseID2=new JTextField();
        panel2.add(txtCourseID2);
        txtCourseID2.setBounds(480,585,150,40);

        JButton btnRegisterNonAcademic=new JButton("Register");
        btnRegisterNonAcademic.setBackground(Color.BLUE);
        btnRegisterNonAcademic.setBounds(310,510,150,40);
        panel2.add(btnRegisterNonAcademic);
        btnRegisterNonAcademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){

                    NonRegistered();
                }
            });

        JButton btnNonDisplayAcademic=new JButton("Display");
        btnNonDisplayAcademic.setBounds(480,510,150,40);
        panel2.add(btnNonDisplayAcademic);
        btnNonDisplayAcademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    NondisplayDetail();

                }
            });

        JButton btnNonClear=new JButton("Clear");
        btnNonClear.setBackground(Color.RED);
        btnNonClear.setBounds(655,510,150,40);
        panel2.add(btnNonClear);
        btnNonClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    NonclearAcademic();
                }
            });

        JButton btnRemove=new JButton("Remove");
        btnRemove.setBackground(Color.RED);
        btnRemove.setBounds(660,585,150,40);
        panel2.add(btnRemove);
        btnRemove.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    isRemoved();
                }
            });

    }

    public void addAcademicCourse(){
        String courseId = this.gettxtCourseID();
        String courseName = this.gettxtCourseName();
        int duration = this.gettxtDuration();
        int numberofAssessment = this.gettxtNumberofAssessment();
        String level = this.gettxtLevel();
        String credit=this.gettxtCredit();
        boolean flag = false;
        if(courseId.equals("") || courseName.equals("") || level.equals("")|| duration == -1 || numberofAssessment ==-1 || credit.equals("")){
            JOptionPane.showMessageDialog(frame,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }else{
            if(courses.isEmpty()){
                flag = true;
            }
            else{
                for(Course cou : courses){ 
                    if(cou.getCourseID().equals(courseId)){ 
                        JOptionPane.showMessageDialog(frame,"The courseid is already added ","Repeated Data",2);
                        return;
                    }else{
                        flag = true;
                    }
                }
            }

            if(flag == true){
                courses.add(new AcademicCourse(courseId,courseName,duration,level,credit,numberofAssessment));
                String message = "CourseID: " + courseId + "\nCourseName : " + courseName + "\nDuration : " + duration+ "\nNumberofAssessment : " + 
                    numberofAssessment + "\nLevel : " + level + "\nCredit:"+ credit;
                JOptionPane.showMessageDialog(frame,message,"Data Added",1);
            }
        }
    }

    public void addNonAcademicCourse(){
        String courseId = this.gettxtNonCourseID();
        String courseName = this.gettxtNonCourseName();
        int duration = this.gettxtNonDuration();
        String prerequitise= this. gettxtPrerequitise();
        boolean flag = false;
        if(courseId.equals("") || courseName.equals("") || duration == -1 || prerequitise.equals("")){
            JOptionPane.showMessageDialog(frame,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }else{
            if(courses.isEmpty()){
                flag = true;
            }
            else{
                for(Course cou : courses){ 
                    if(cou.getCourseID().equals(courseId)){ 
                        JOptionPane.showMessageDialog(frame,"The courseid is already added","Repeated Data",2);
                        return;
                    }else{
                        flag = true;
                    }
                }
            }

            if(flag == true){
                courses.add(new NonAcademicCourse(courseId,courseName,duration,prerequitise));
                String message = "CourseID: " + courseId + "\nCourseName : " + courseName + "\nDuration : " + duration+ "\nprerequitise :" + prerequitise;
                JOptionPane.showMessageDialog(frame,message,"Data Added",1);
            }
        }
    }

    public void isRegistered(){ 
        String course1 = this.gettxtdipinCourseID();
        String LecturerName =  this.gettxtLecturerName();
        String CourseLeader = this.getCourseLeader();
        String StartingDate = this.getStartingDate();
        String CompletionDate = this.gettxtCompletionDate();
        boolean flag=false;

        if(course1.equals("") || LecturerName.equals("") || CourseLeader.equals("") || StartingDate.equals("") ||CompletionDate.equals(""))
        {
            JOptionPane.showMessageDialog(frame,"fields are empty.","Empty Field",2);
            return;
        }
        else
        {
            if(courses.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"add course to register","Register",1);
                return;
            }
            else
            {
                for(Course co : courses){
                    if(co instanceof AcademicCourse)
                    {
                        if(co.getCourseID().equals(course1))
                        {
                            AcademicCourse acm = (AcademicCourse) co;
                            if(acm.getisRegistered() == true)
                            {
                                JOptionPane.showMessageDialog(frame," Already registered.","Registered",1);
                                return;
                            }
                            else
                            {
                                acm.register(CourseLeader,LecturerName,StartingDate,CompletionDate);
                                String message = "Lecturer_Name : " + LecturerName + "\nCourse Leader : " + CourseLeader + "\nStarting Date : " +StartingDate + "\nCompletion Date : " + CompletionDate;
                                JOptionPane.showMessageDialog(frame,message,"Data Added",1);
                                return;
                            }
                        }
                    }
                }
                JOptionPane.showMessageDialog(frame,"invalid id","Incorrect Input",2);
            }
        }
    }

    public void displayDetail(){
        int count=0;
        if(courses.isEmpty()){
            count = 0;
        }else{
            for(Course cou : courses){
                if(cou instanceof AcademicCourse){
                    AcademicCourse ad = (AcademicCourse) cou;
                    ad.displayDetail();
                    count++;
                }
            }
        }  
        if(count==0){
            JOptionPane.showMessageDialog(panel1,"The add AcademicCourse to display.","Display",1);
            return;
        }

    }

    public void isRemoved(){
        String course= this.getCourseID1();
        if(course.equals("")){
                JOptionPane.showMessageDialog(frame,"Enter course id to remove.","removed",1);
                return;
            }else{
                if(courses.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"add course id to remove.","remove",1);
                    return;
                }else{
                    for(Course cos:courses){
                        if(cos.getCourseID().equals(course)){
                            if(cos instanceof NonAcademicCourse){
                                NonAcademicCourse nacm = (NonAcademicCourse) cos;
                                if(nacm.getisRemove() == false){
                                    nacm.remove();
                                    JOptionPane.showMessageDialog(frame," remove sucessfull","remove",1);
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(frame,"already remove","remove",1);
                                    return;
                                }
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(frame,"it does not exist.","remove",1);
                }
            }
    }

    public void clearAcademic() {
        txtCourseID.setText("");
        txtCourseName.setText("");
        txtLevel.setText("");
        txtCredit.setText("");
        txtDuration.setText("");
        txtNumberofAssessment.setText("");
        txtdipinCourseID.setText("");
        txtcourseleader.setText("");
        txtstartingdate.setText("");
        txtLecturerName.setText("");
        txtCompletionDate.setText("");
        
    }

    public void NonclearAcademic() {
        txtNonCourseID.setText("");
        txtNonCourseName.setText("");
        txtPrerequitise.setText("");
        txtNonDuration.setText("");
        txtCourseLeader1.setText("");
        txtexamDate.setText("");
        txtStartDate.setText("");
        txtInstructor.setText("");
        txtCompletionDate1.setText("");
        txtNon1CourseID.setText("");
        txtCourseID2.setText("");
    }

    public void NonRegistered(){ 
        String NonCourseID = this.gettxtNonCourseID();
        String NonCourseName  =  this.gettxtNonCourseName();
        String Prerequitise = this.gettxtPrerequitise();
        int NonDuration = this.gettxtNonDuration();
        String CourseLeader1 = this.gettxtCourseLeader();
        String examDate = this.gettxtexamDate();
        String StartDate = this.gettxtStartingDate();
        String Instructor = this.gettxtInstructor();
        String CompletionDate1 = this.getCompletionDate();
        String Non1CourseID = this.gettxtNon1CourseID();
        boolean flag=false;

        if(NonCourseID.equals("") || NonCourseName.equals("") || Prerequitise.equals("") || StartDate.equals("") ||CompletionDate1.equals("")||examDate.equals("")|| Instructor.equals("")||Non1CourseID.equals(""))
        {
            JOptionPane.showMessageDialog(frame,"fields are empty.","Empty Field",2);
            return;
        }
        else
        {
            if(courses.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"add course to register","Register",1);
                return;
            }
            else
            {
                for(Course co : courses){
                    if(co instanceof NonAcademicCourse)
                    {
                        if(getNonCourseID().equals(NonCourseID))
                        {
                            NonAcademicCourse acm = (NonAcademicCourse) co;
                            if(acm.getisRegistered() == true)
                            {
                                JOptionPane.showMessageDialog(frame," Already registered.","Appoint",1);
                                return;
                            }
                            else
                            {
                                acm.register(CourseLeader1,Instructor,StartDate,CompletionDate1,examDate);
                                String message = "Instructor : " + Instructor + "\nCourseLeader1 : " + CourseLeader1 + "\nStartDate : " +StartDate + "\nCompletion Date1 : " + CompletionDate1 + "\nexamDate: " +examDate;
                                JOptionPane.showMessageDialog(frame,message,"Data Added",1);
                                return;
                            }
                        }
                    }
                }
                JOptionPane.showMessageDialog(frame,"invalid id","Incorrect Input",3);
            }
        }

    }

    public void  NondisplayDetail(){
        int count=0;
        if(courses.isEmpty()){
            count = 0;
        }else{
            for(Course cou : courses){
                if(cou instanceof NonAcademicCourse){
                    NonAcademicCourse Nad = (NonAcademicCourse) cou;
                    Nad.displayDetail();
                    count++;
                }
            }
        }  
        if(count==0){
            JOptionPane.showMessageDialog(panel1,"The add NonAcademicCourse to display.","Display",1);
            return;
        }
    }

    public static void main(String [] args){
        new INGCollege().frame.setVisible(true);
    }
}
