package hu.flowacademy;

public abstract class Telescope {

    double fLength;

    public Telescope(double fLength) {
        this.fLength = fLength;
    }

    public double getfLength() {
        return fLength;
    }

    public void setfLength(double fLength) {
        this.fLength = fLength;
    }

    public String ToString() {
        return "telescope " + this.fLength;
    }

    public abstract boolean hasColorError();
}
