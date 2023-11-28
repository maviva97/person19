import javax.naming.InvalidNameException;

public class Person {
 private String firstName;
 private String lastName;
    private  int age;

//    public Person(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
    public void setAge(int age)throws InvalidAgeException{
        if (age<0 || age>150){
            throw  new InvalidAgeException("Varsta nepotrivita!",age);
        }
        this.age=age;
    }
    public void setName(String firstName,String lastName) throws InvalidNameException {
        if (firstName != null || firstName.length() == 0 || lastName != null || lastName.length() == 0) {
            throw new InvalidNameException("Numele este gol");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }
public int getAge(){
        return age;
}
public String getFirstName(){
        return firstName;
}
public String getLastName(){
        return lastName;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
