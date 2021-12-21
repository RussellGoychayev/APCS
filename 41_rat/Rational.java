/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW41: Be Rational
 * 2021-12-1
 * time spent - 0.3 hours
 *
 * Disco-
 *
 * QCC- ...
 *
*/

public class Rational{
  private int numer , denom;

  public Rational(){
    this.numer = 0;
    this.denom = 1;
  }

  public Rational(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;

    if (denom == 0) {
      System.out.println("Invalid denominator.");
      numer=0;
      denom=1;
    }
  }

  public String toString(){
    return (numer + "/" + denom);
  }

  public static float floatValue(Rational r){
	  return ((float)r.numer/(float)r.denom);
  }

  public void multiply(Rational s){
	  this.numer=(this.numer*s.numer);
	  this.denom=(this.denom*s.denom);
  }

  public void divide(Rational s){
	  this.numer=(this.numer*s.denom);
	  this.denom=(this.denom*s.numer);
  }

  public static void main(String[] args){
    Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
    System.out.println(r.toString());
	System.out.println(floatValue(r));
	r.multiply(s);
	System.out.println(r.toString());
	r.divide(s);
	System.out.println(r.toString());

  }
}
