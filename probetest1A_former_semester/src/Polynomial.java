// This class represents a polynomial. A polynomial is a sum of multiple monomials (class 'Monomial'),
// such as 3*x^1 + -1*x^2 + 1*x^5.
// 'Polynomial' uses a binary search tree to store its monomials. The degree of the monomial is the key.
// A specific degree exists at most once in the polynomial.
//
// TODO: define further classes for the implementation of the binary search tree, if needed
//  (either in this file or in separate files).
//  Implement this class without the use of classes from the Java Collection framework.

public class Polynomial {

    //TODO: declare variables.

    // Initializes this polynomial with multiple monomials. The coefficients of the monomials are
    // specified by 'coeffs', where coeffs[i] is the coefficient of the monomial of degree i.
    // Entries with value 0 are ignored, i.e. corresponding monomials are not stored in the polynomial.
    // Precondition (needs not be checked): coeffs != null, coeffs.length > 0.
    public Polynomial(int[] coeffs) {
        // TODO: implement constructor.

    }

    // Adds the monomial specified by 'coeff' and 'degree' to this polynomial, if coeff != 0,
    // otherwise 'add' has no effect.
    // If this polynomial already has a monomial of the same degree, no new monomial is added, instead
    // the coefficient of the monomial is modified accordingly ('combine' is called).
    public void add(int coeff, int degree) {
        // TODO: implement method.

    }

    // Adds all monomials of 'p' to this polynomial.
    // (The rules of 'add(int,int)' apply for each monomial to be added.)
    // Precondition (needs not be checked): p != null
    public void add(Polynomial p) {
        // TODO: implement method.

    }

    // Returns the value of the polynomial for a specified value of 'x'.
    public int eval(int x) {
        // TODO: implement method.
        return 0;

    }

    // Returns a polynomial representation in mathematical notation such as
    // "2*x^0 + 6*x^2 + -2*x^3", where monomials are ordered ascending according to
    // their degree. Note that a positive sign of the leftmost coefficient is
    // not shown.
    // Returns the string "0" if the polynomial has no monomials (is empty).
    public String toString() {
        // TODO: implement method.
        return "";

    }

}

