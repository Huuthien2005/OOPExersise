package exer4;

public class NoTermAccount extends Account{
    public NoTermAccount(String accountName,String phoneNumber, String email,double balance){
        super(accountName,phoneNumber,email,balance);
    }

    @Override
    public void display() {
        super.display();
    }

}
