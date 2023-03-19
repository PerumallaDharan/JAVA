// Write a java program to find the addition, subtraction, multiplication, 
// and division of two complex numbers using inheritance.

// Create an abstract class Complex.

// From this extends a child class Addition, Subtraction, Multiplication, and 
// Division.

// All of these child classes should contain the same methods.
// Input format

// Input consists of four double-type variables.

// Which denotes the real and imaginary parts of the first complex number,

// Followed by the real and imaginary parts of the second complex number.
// Output format

// The output consists of the Addition, Subtraction, Multiplication, and 
// Division of the two input complex numbers.
// Sample testcases
// Input 1
// 2 6
// 4 2
// Output 1
// Addition:
// 	6.0000 +8.0000 i
// Subtraction:
// 	-2.0000 +4.0000 i
// Multiplication:
// 	-4.0000 +28.0000 i
// Division:
// 	1.0000 +1.0000 i

// Whitelist
// Set 1:
// abstract class Complex
// class Addition extends Complex
// class Subtraction extends Complex
// class Multiplication extends Complex
// class Division extends Complex 

import java.util.Scanner;

abstract class Complex {
    abstract float Real(float real1, float real2);

    abstract float Imaginary(float imag1, float imag2);

    abstract float Real1(float real1, float real2, float imag1, float imag2);

    abstract float Imaginary1(float real1, float real2, float imag1, float imag2);
}

class Addition extends Complex {
    float Real(float real1, float real2) {
        return real1 + real2;
    }

    float Imaginary(float imag1, float imag2) {
        return imag1 + imag2;
    }

    float Imaginary1(float real1, float real2, float imag1, float imag2) {
        return 0;
    }

    float Real1(float real1, float real2, float imag1, float imag2) {
        return 0;
    }
}

class Subtraction extends Complex {
    float Real(float real1, float real2) {
        return real1 - real2;
    }

    float Imaginary(float imag1, float imag2) {
        return imag1 - imag2;
    }

    float Imaginary1(float real1, float real2, float imag1, float imag2) {
        return 0;
    }

    float Real1(float real1, float real2, float imag1, float imag2) {
        return 0;
    }
}

class Multiplication extends Complex {
    float Real1(float real1, float real2, float imag1, float imag2) {
        return ((real1 * real2) - (imag1 * imag2));
    }

    float Imaginary1(float real1, float real2, float imag1, float imag2) {
        return ((real1 * imag2) + (imag1 * real2));
    }

    float Imaginary(float imag1, float imag2) {
        return 0;
    }

    float Real(float real1, float real2) {
        return 0;
    }
}

class Division extends Complex {
    float Real1(float real1, float real2, float imag1, float imag2) {
        return (((real1 * real2) + (imag1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
    }

    float Imaginary1(float real1, float real2, float imag1, float imag2) {
        return (((imag1 * real2) - (real1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
    }

    float Imaginary(float imag1, float imag2) {
        return 0;
    }

    float Real(float real1, float real2) {
        return 0;
    }
}

class Code2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float real1 = scan.nextFloat();
        float imag1 = scan.nextFloat();
        float real2 = scan.nextFloat();
        float imag2 = scan.nextFloat();
        Complex b;
        b = new Addition();
        System.out.printf("Addition:\n\t%.4f", b.Real(real1, real2));
        if (b.Imaginary(imag1, imag2) >= 0) {
            System.out.print(" +");
        } else {
            System.out.print(" ");
        }
        System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
        b = new Subtraction();
        System.out.printf("\nSubtraction:\n\t%.4f", b.Real(real1, real2));
        if (b.Imaginary(imag1, imag2) >= 0) {
            System.out.print(" +");
        } else {
            System.out.print(" ");
        }
        System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
        b = new Multiplication();
        System.out.printf("\nMultiplication:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
        if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
            System.out.print(" +");
        } else {
            System.out.print(" ");
        }
        System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));
        b = new Division();
        System.out.printf("\nDivision:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
        if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
            System.out.print(" +");
        } else {
            System.out.print(" ");
        }
        System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));

        scan.close();
    }

}
