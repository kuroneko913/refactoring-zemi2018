package org.speech_lab.refactoring_zemi2018.chapter1;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
	_movie = movie;
	_daysRented = daysRented;
    }

    public int getDaysRented(){
	return _daysRented;
    }

<<<<<<< HEAD
  public Movie getMovie() {
    return _movie;
  }

  double getCharge(){
    return _movie.getCharge(_daysRented);
  }

  int getFrequentRenterPoints(){
    return _movie.getFrequentRenterPoints(_daysRented);
  }
=======
    public Movie getMovie() {
	return _movie;
    }

    double getCharge() {
	return getMovie().getCharge(getDaysRented());
    }

    int getFrequentRenterPoints() {
	return getMovie().getFrequentRenterPoints(getDaysRented());
    }
>>>>>>> ken1-develop
}
