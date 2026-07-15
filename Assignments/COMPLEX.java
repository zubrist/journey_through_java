package Assignments;

public class COMPLEX {
    // instance variables
    public double real;
    public double imag;

    // default constructor: 0.0 + 0.0i
    public COMPLEX() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    // parameterized constructor
    public COMPLEX(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString in format "(x + yi)" (handles negative imaginary part)
    @Override
    public String toString() {
        if (imag >= 0) return String.format("(%.4f + %.4fi)", real, imag);
        else return String.format("(%.4f - %.4fi)", real, -imag);
    }

    // magnitude: sqrt(x*x + y*y)
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // argument: atan2(y, x)
    public double argument() {
        return Math.atan2(imag, real);
    }

    // add A and B, store result in this instance and return this
    public COMPLEX add(COMPLEX A, COMPLEX B) {
        this.real = A.real + B.real;
        this.imag = A.imag + B.imag;
        return this;
    }

    // subtract B from A, store result in this instance and return this
    public COMPLEX subtract(COMPLEX A, COMPLEX B) {
        this.real = A.real - B.real;
        this.imag = A.imag - B.imag;
        return this;
    }

    // conjugate: x - yi, modify this and return this
    public COMPLEX conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
