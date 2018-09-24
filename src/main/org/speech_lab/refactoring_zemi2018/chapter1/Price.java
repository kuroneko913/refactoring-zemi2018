package org.speech_lab.refactoring_zemi2018.chapter1;

public abstract class Price {
    public abstract int getPriceCode();
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
	return 1;
    }
}
