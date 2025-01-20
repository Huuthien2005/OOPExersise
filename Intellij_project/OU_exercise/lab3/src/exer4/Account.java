package exer4;

import java.time.LocalDate;

public class Account {
    private static int nextAccountNumber=1;
    private String accountNumber;
    private String nameAccount;
    private String phoneNumber;
    private String email;
    private double balance;
    private LocalDate createdDate;
    private boolean isActive;
    public Account(String nameAccount,String phoneNumber,String email,double balance){
        this.accountNumber=String.format("%06d",nextAccountNumber++);
        this.nameAccount=nameAccount;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.balance=balance;
        this.createdDate=LocalDate.now();
        this.isActive=true;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Name: "+nameAccount);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Email: "+email);
        System.out.println("Money in bank account: "+balance);
        System.out.println(" created account date: "+createdDate);
        System.out.println("Active Account: "+isActive);
    }
}
