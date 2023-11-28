public class InvalidRangeException extends RuntimeException{
    private int inferiorLimit;
    private int superiorLimit;
    public int getInferiorLimit() {
        return inferiorLimit;
    }
    public int getSuperiorLimit() {
        return superiorLimit;
    }
    InvalidRangeException(String message, int inferiorLimit, int superiorLimit){
        super(message);
        this.inferiorLimit=inferiorLimit;
        this.superiorLimit=superiorLimit;
    }

}
