package hu.flowacademy;

public final class RefactorTelescope extends Telescope {

    int numberOfLenses;

    public RefactorTelescope (double fLength, int numberOfLenses) {
        super(fLength);
        this.numberOfLenses = numberOfLenses;
    }

    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) {
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public boolean hasColorError() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + numberOfLenses;
    }
}
