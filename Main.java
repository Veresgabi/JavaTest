package hu.flowacademy;

public class Main {

    public static void main(String[] args) {

	NewtonTelescope telescope1 = new NewtonTelescope(30.12, 16.12);
	RefactorTelescope telescope2 = new RefactorTelescope(20.22,10);
	System.out.println(telescope1.toString());
	System.out.println(telescope2.toString());
    }
}
