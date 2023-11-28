import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------1");
        Person person = new Person();
            try {
                person.setAge(45);
                person.setName(" ", "Moraru");
            }catch (InvalidAgeException | InvalidNameException e){
                System.out.println("Error "+e);
            }finally {
                person.setAge(45);
                person.setFirstName("Ion");
                person.setLastName("Moraru");
                System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
            }
        System.out.println("-------------------------------2");
Numbers numbers=new Numbers();
try {
    numbers.divideBy(0);
}catch (IllegalArgumentException  e) {
    System.out.println(e);
}finally {
    numbers.divideBy(3);
    System.out.println("Numarul nou este -->"+numbers.getNumber());
        }
        System.out.println("-------------------------------3");
try{ numbers.countDivisibleBy7Numbers(100,90);
    }catch (InvalidRangeException e){
    System.out.println(e);
    }finally {
    numbers.setInferiorLimit(5);
    numbers.setSuperiorLimit(90);
    System.out.println("intre "+numbers.getInferiorLimit()+" si "
            +numbers.getSuperiorLimit()+" sunt "+
            numbers.countDivisibleBy7Numbers(numbers.getInferiorLimit(),numbers.getSuperiorLimit())+
    " cifre divizibile cu 7");
    }
}
}





