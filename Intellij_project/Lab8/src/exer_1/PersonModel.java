package exer_1;

import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> a1=new ArrayList<>();
    public void add(T obj){
        a1.add(obj);
    }
    public void display(){
        for(T obj: a1){
            System.out.println(obj);
        }
    }
    public static void main(String[] args){
        PersonModel<Student> obj=new PersonModel<>();
        obj.add(new Student("2351050170",7.5,"thien","20/10/2005"));
        obj.add(new Student("2351050171",8.0,"Trung","23/3/2005"));
        obj.display();
        PersonModel<Employee> obj1=new PersonModel<>();
        obj1.add(new Employee("123",2000.0,"Trang","18/8/2005"));
        obj1.add(new Employee("124",1500.0,"Huyen","25/7/2002"));
        obj1.display();
        PersonModel<Person> obj2=new PersonModel<>();
        obj2.add(new Person("Thinh","27/7/1964"));
        obj2.add(new Person("Khuyen","10/12/1979"));
        obj2.display();
    }
}
