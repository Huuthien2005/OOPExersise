package exer3;

public class ITStudent extends Student{
    protected int sID;
    public ITStudent(){
        super();
    }
    public ITStudent(int sID,String sName,double gpa){
        super(sName,gpa);
        this.sID=sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getsID() {
        return sID;
    }

    public String getRank(){
        if(super.getGpa()<=5)
            return "C";
        else if(super.getGpa()>5&&super.getGpa()<=8)
            return "B";
        else if(super.getGpa()>8&&super.getGpa()<=10)
            return "A";
        else return "undefined";
    }
    public String toString(){
        return getsName()+" - "+getsID()+" - "+getGpa();
    }
}
