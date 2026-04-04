package com.harammal.exercises.oop_basic;

import java.util.Objects;

/**
 * An immutable rational number supporting addition and multiplication with other rational numbers.
 */
public class RationalNumber {
    private final int numerator;
    private final int denominator;

    /**
     * Constructs a rational number and reduces it to its simplest form.
     * @param numerator the numerator of the rational number
     * @param denominator the denominator of the rational number
     */
    public RationalNumber(int numerator, int denominator) {
        int gCD = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / gCD;
        this.denominator = denominator / gCD;
    }

    /**
     * Returns the numerator of the rational number.
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator of the rational number.
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Returns the sum of the current rational number and another.
     * @param o the rational number to add
     * @return a new {@code RationalNumber} representing the sum
     */
    public RationalNumber add(RationalNumber o) {
        int lCM = leastCommonMultiple(denominator, o.getDenominator());
        int num = numerator * (lCM / denominator) + o.getNumerator() * (lCM / o.getDenominator());

        return new RationalNumber(num, lCM);
    }

    /**
     * Returns the product of the current number and another
     * @param o the rational number to multiply by
     * @return a new {@code RationalNumber} representing the product
     */
    public RationalNumber multiply(RationalNumber o) {
        return new RationalNumber(numerator * o.getNumerator(), denominator * o.getDenominator());
    }

    /**
     * Returns the greatest common divisor of two integer numbers
     * @param a the first integer number
     * @param b the second integer number
     * @return the greatest common divisor
     */
    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    /**
     * Returns the least common multiple of the two integer numbers
     * @param a the first integer number
     * @param b the second integer number
     * @return the least common multiple
     */
    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{numerator=" + numerator + ", denominator=" + denominator + "}";
    }
}
