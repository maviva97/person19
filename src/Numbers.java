public class Numbers {


    private int number;

    public void setInferiorLimit(int inferiorLimit) {
        this.inferiorLimit = inferiorLimit;
    }

    public void setSuperiorLimit(int superiorLimit) {
        this.superiorLimit = superiorLimit;
    }

    private int inferiorLimit;

    public int getInferiorLimit() {
        return inferiorLimit;
    }

    public int getSuperiorLimit() {
        return superiorLimit;
    }

    private int superiorLimit;

    public void divideBy(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Numarul trebuie sa fie diferit de zero!");
        } else this.number = number;
    }

    public int getNumber() {
        return number;
    }

    int counter;
    int i;
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {

        if (superiorLimit < inferiorLimit) {
            throw new InvalidRangeException("Limita superioara nu poate fi mai mica ca Limita inferioara", inferiorLimit, superiorLimit);
        }else
            for (i = inferiorLimit; i <= superiorLimit; i++)
                if (i % 7 == 0)
                    counter++;
                    return counter;


    }
}










