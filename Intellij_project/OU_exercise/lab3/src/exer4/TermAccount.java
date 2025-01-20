package exer4;

import java.time.LocalDate;
import java.util.Formatter;

public class TermAccount extends Account{
    private KyHan term;
    private LocalDate maturityDate;
    public TermAccount(String accountName,String phoneNumber,String email,double balance,KyHan term){
        super(accountName,phoneNumber,email,balance);
        this.term=term;
        this.maturityDate=termDate();
    }
    public LocalDate termDate(){
        LocalDate createdDay=LocalDate.now();
        switch(term){
            case ONE_WEEK:
                return createdDay.plusWeeks(1);
            case ONE_MONTH:
                return createdDay.plusMonths(1);
            case ONE_YEAR:
                return createdDay.plusYears(1);
            default:
                return createdDay;
        }
    }
    public void searchAccount(String keyword){
        if(super.getAccountNumber().equalsIgnoreCase(keyword)||super.getNameAccount().equalsIgnoreCase(keyword)){
            super.display();
            System.out.println("Type of term: "+term);
            System.out.println("Maturity Date: "+maturityDate.format(Config.FORMATTER));
        }
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Type of term: "+term);
        System.out.println("Maturity Date: "+maturityDate.format(Config.FORMATTER));
    }


}
