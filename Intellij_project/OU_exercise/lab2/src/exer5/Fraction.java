package exer5;

public class Fraction {
    private int tso;
    private int mso;
    public Fraction(){
        this.tso=0;
        this.mso=1;
    }
    public Fraction(int tso,int mso){
        this.tso=tso;
        this.mso=mso;
    }

    public int getMso() {
        return mso;
    }

    public void setMso(int mso) {
        this.mso = mso;
    }

    public int getTso() {
        return tso;
    }

    public void setTso(int tso) {
        this.tso = tso;
    }

    public String toString(){
        return tso+"/"+mso;
    }
    public void display(){
        System.out.println(this.toString());
    }

    public static int findGreatestDivisor(int tso, int mso){
        int tmp;
        while (tso != 0) {
            tmp = mso % tso;
            mso = tso;
            tso = tmp;
        }
        return mso;
    }
    public void gcd(){
        int gcd=findGreatestDivisor(this.tso,this.mso);
        this.tso/=gcd;
        this.mso/=gcd;
        if(mso<0)
        {
            this.mso=-this.mso;
            this.tso=-this.tso;
        }
        /*System.out.println("fraction shortly: "+tso+"/"+mso);*/
    }
    public int comparePhanSo(Fraction other) {
        this.gcd();
        other.gcd();
        int thisValue = this.tso * other.mso;
        int otherValue = other.tso * this.mso;
        return Integer.compare(thisValue, otherValue);
    }
    public int comparePhanSo(int tso,int mso) {
        Fraction other=new Fraction(tso,mso);
        this.gcd();
        other.gcd();
        int thisValue = this.tso * other.mso;
        int otherValue = other.tso * this.mso;
        return Integer.compare(thisValue, otherValue);
    }
    public Fraction plus(Fraction anotherFraction){
        int newTso=tso*anotherFraction.mso+anotherFraction.tso*mso;
        int newMso=mso*anotherFraction.mso;
        Fraction fr=new Fraction(newTso,newMso);
        fr.gcd();
        return fr;
    }
    public Fraction minus(Fraction anotherFraction){
        int newTso=tso*anotherFraction.mso-anotherFraction.tso*mso;
        int newMso=mso*anotherFraction.mso;
        Fraction fr=new Fraction(newTso,newMso);
        fr.gcd();
        return fr;
    }
    public Fraction multi(Fraction anotherFraction){
        int newTso=tso*anotherFraction.tso;
        int newMso=mso*anotherFraction.mso;
        Fraction fr=new Fraction(newTso,newMso);
        fr.gcd();
        return fr;
    }
    public Fraction divide(Fraction anotherFraction){
        int newTso=tso*anotherFraction.mso;
        int newMso=mso*anotherFraction.tso;
        Fraction fr=new Fraction(newTso,newMso);
        fr.gcd();
        return fr;
    }
    public Fraction findMAx(Fraction Max){
        if(tso* Max.mso>Max.tso*mso)
        {
            Max.tso=tso;
            Max.mso=mso;
        }
        return Max;
    }
    public Fraction findMin(Fraction Min){
        if(tso* Min.mso<Min.tso*mso)
        {
            Min.tso=tso;
            Min.mso=mso;
        }
        return Min;
    }

    public String compareFraction(Fraction anotherFraction){
        if(tso* anotherFraction.mso==anotherFraction.tso*mso)
            return "lon hon";
        else if(tso* anotherFraction.mso>anotherFraction.tso*mso)
            return tso+"/"+mso+" lon hon "+ anotherFraction.tso+"/"+ anotherFraction.mso;
        else return tso+"/"+mso+" nho hon "+ anotherFraction.tso+"/"+ anotherFraction.mso;
    }
}
