package org.speech_lab.refactoring_zemi2018.chapter1;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        double result = daysRented * 3;

        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        int result = 1;

        if(daysRented > 1){
            result ++;
        }

        return result;
    }
}
