package exer5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FractionList extends Fraction{
    private ArrayList<Fraction> fractionList;
    public FractionList()
    {
        fractionList=new ArrayList<>();
    }
    public void addFraction(Fraction ps){
        fractionList.add(ps);
    }
    public void display(){
        for(Fraction fr: fractionList){
            fr.display();
        }
    }
    public Fraction sumFractionList(){
        Fraction sum=new Fraction(0,1);
        for(Fraction fr:fractionList){
            sum=sum.plus(fr);
        }
        sum.gcd();
        return sum;
    }
    public Fraction findMaxList(){
        Fraction max=fractionList.get(0);
        for(Fraction fr:fractionList){
            max=max.findMAx(fr);
        }
        return max;
    }
    public Fraction findMinList(){
        Fraction min=fractionList.get(0);
        for(Fraction fr:fractionList){
            min=min.findMin(fr);
        }
        return min;
    }
    public void removeElement(Fraction ps){
        for(Fraction fr: fractionList){
            if(ps.comparePhanSo(fr)==0)
            {
                fractionList.remove(fr);
                return;
            }
        }
        System.out.println("Not found");
    }
    public void removeElement(int tso,int mso){
        for(Fraction fr:fractionList){
            if(fr.comparePhanSo(tso,mso)==0)
            {
                fractionList.remove(fr);
                return;
            }
        }
        System.out.println("Not found");
    }
    public void sortFraction(){
        Collections.sort(fractionList,(ps1,ps2)-> {
            int left=ps1.getTso()*ps2.getMso();
            int right=ps1.getMso()*ps2.getTso();
            return Integer.compare(left,right);
        });

    }
}
