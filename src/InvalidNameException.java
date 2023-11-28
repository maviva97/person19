public class InvalidNameException extends RuntimeException{
    private String firstName;
    private String lastName;
    public InvalidNameException(String message, String firstName,String lastName) {
        super(message);
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public String getName() {
        return firstName+lastName;

    }
}
