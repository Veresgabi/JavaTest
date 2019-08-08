package hu.flowacademy;

public final class NewtonTelescope extends Telescope {

    double secondMirrorSize;

    public NewtonTelescope (double fLength, double secondMirrorSize) {
        super(fLength);
        this.secondMirrorSize = secondMirrorSize;
    }

    public double getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(double secondMirrorSize) {
        this.secondMirrorSize = secondMirrorSize;
    }

    @Override
    public boolean hasColorError() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + secondMirrorSize;
    }
}
