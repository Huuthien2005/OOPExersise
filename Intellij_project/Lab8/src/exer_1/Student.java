package exer_1;

public class Student extends Person {
    private String id;
    private double score;
    public Student(){
        super();
        this.id="";
        this.score=0.0;
    }
    public Student(String id,double score,String name,String birthYear){
        super(name,birthYear);
        this.id=id;
        this.score=score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student: {name: "+getName()+", birthYear: "+getBirthYear()+", id: "+id+", Score: "+score;
    }
}
