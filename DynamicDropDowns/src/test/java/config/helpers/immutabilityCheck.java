package config.helpers;

public class immutabilityCheck {
    private int numbersEggs;
    private StringBuilder builder;

    public StringBuilder getBuilder() {
        return builder;
    }

    public immutabilityCheck(StringBuilder b){
        builder = b;
    }

    public int getNumbersEggs() {
        return numbersEggs;
    }

    public immutabilityCheck(int numbersEggs) {
        this.numbersEggs = numbersEggs;
    }
}
