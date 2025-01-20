package exer3;

public class MathStudent extends Student {
    private String sID;
    public MathStudent(){}
    public MathStudent(String sName,double gpa,String sID){
        super(sName,gpa);
        this.sID=sID;
    }
    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsID() {
        return sID;
    }

    @Override
    public String getRank() {
        if(getGpa()>=5)
            return "Passed";
        else if(getGpa()<5)
            return "Failed";
        else return "undefined";
    }
}
