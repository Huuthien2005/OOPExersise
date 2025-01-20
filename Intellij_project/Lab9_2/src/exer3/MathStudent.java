package exer3;

public class MathStudent extends Student{
    protected String sID;
    public MathStudent(){
    }
    public MathStudent(String sID,String sName,double gpa){
        super(sName,gpa);
        this.sID=sID;
    }

    public void setsID(String sID) {

        this.sID = sID;

    }

    public String getsID() {
        return sID;
    }

    public String getRank(){
        if(super.getGpa()>=5)
            return "Passed";
        else if(super.getGpa()<5)
            return "Failed";
        else return "undefined";
    }
    public String toString(){
        return getsName()+" - "+getsID()+" - "+getGpa();
    }
}
