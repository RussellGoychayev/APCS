/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW42: Be More Rational
 * 2021-12-1
 * time spent - 0.5 hours
 *
 * Disco -
 * Many discos
 * QCC-
 * is gcd defined for negative ints?
 * is it good or bad to have multiple return statements in a method?
 */

public class Rational{
  public int numer, denom;

  public Rational(){
    this.numer = 0;
    this.denom = 1;
  }

  public Rational(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;

    if (denom == 0) {
      System.out.println("Invalid denominator.");
      this.numer=0;
      this.denom=1;
    }
  }

  public String toString(){
    return numer + "/" + denom;
  }

  public static float floatValue(Rational r){
	  return (float)r.numer/(float)r.denom;
  }

  public void multiply(Rational s){
	  this.numer *= s.numer;
	  this.denom *= s.denom;
  }

  public void divide(Rational s){
	  this.numer *= s.denom;
	  this.denom *= s.numer;
  }

  public void add(Rational s){
    this.numer = this.numer*s.denom + s.numer*this.denom;
    this.denom *= s.denom;
  }

  public void subtract(Rational s){
    this.numer = this.numer*s.denom - s.numer*this.denom;
    this.denom *= s.denom;
  }

  public static int gcd(int uno, int dos){//find the gcd of two ints
    int gcd = 1;
    //if uno == dos
    if (uno == dos){
      gcd = uno;
    }
    //if uno < dos
    else if (uno < dos){
      for (int i=1; i<=uno; i++){//increment up to and including uno,
        if (uno%i==0 && dos%i==0){//checking to see if each value fits
          gcd = i;//if a value fits, then gcd takes that value
        }
      }
    }
    //if dos < uno
    else {
      for (int i=1; i<=dos; i++){
        if (uno%i==0 && dos%i==0){
          gcd = i;
        }
      }
    }

    return gcd;
  }

  public int gcd() {//finds the gcd of the numer and denom of a Rational
    return gcd(this.numer, this.denom);
  }
  //old (doesnt work):
  /**
  public Rational reduce(){
    this.numer /= this.gcd();
    this.denom /= this.gcd();
    return this;
  }
  **/

  //new:
  public Rational reduce(){
    int tempGcd = this.gcd();
    this.numer /= tempGcd;
    this.denom /= tempGcd;
    return this;
  }

  public int compareTo(Rational Ronald){
    //returns -1, 0, or 1 corresponding to < = >
    int compareTo = 42;

    if (this.reduce().numer < Ronald.reduce().numer){
      compareTo = -1;
    }

    else if (this.reduce().numer == Ronald.reduce().numer){
      compareTo = 0;
    }

    else {
      compareTo = 1;
    }

    return compareTo;
  }

  public static void main(String[] args){
    Rational x = new Rational();
    System.out.println(x.gcd());
    Rational r = new Rational(2,3); //Stores the rational number 2/3
    Rational s = new Rational(1,2); //Stores the rational number 1/2
    Rational t = new Rational(4,18); //Stores the rational number 4/18
    r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
    System.out.println(t.reduce()); //Changes t to 2/9
    Rational oops = new Rational(1, 0);
    System.out.println(oops.reduce());
    Rational tres = new Rational(10,10);
    System.out.println(tres.reduce());
  }
}
