/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW49: Rational Standards Compliance
 * 2021-12-22
 * time spent - 0.5 hours
 *
 * Disco- try litearlly tries things, and when it fails, it doesn;t break the whole program.
 *
 * QCC- why not jsut keep the input a rational if we are going to make it a rational at some point anyways? idk
 also i think the error message for compareto is not working?
 *
*/
public class Rational{
 private int numer , denom;
 private static int n, d, gcd;

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

 public double floatValue(){
   return ((double)numer/denom);
 }

 public void multiply(Rational s){
   this.numer=(this.numer*s.numer);
   this.denom=(this.denom*s.denom);
 }

 public void divide(Rational s){
   if (s.numer == 0){
     System.out.println("Div by 0 err.");
   }
   else{
     this.numer=(this.numer*s.denom);
     this.denom=(this.denom*s.numer);
   }
 }

 public void add(Rational s){
   this.numer=( (this.numer*s.denom) + (this.denom*s.numer) );
   this.denom=(this.denom*s.denom);
 }

 public void subtract(Rational s){
   this.numer=( (this.numer*s.denom) - (this.denom*s.numer) );
   this.denom=(this.denom*s.denom);
 }

 public static int gcd(Rational r){
   n = r.numer;
   d = r.denom;
   if (n == 0){
     System.out.println("Numerator is 0, gcd set to 1");
     return 1;
   }
   while(d != n){
     if(n > d) {
       n = n - d;
     }
     else{
       d = d - n;
     }
   }
   return d;
 }

 public void reduce(){
   gcd = gcd(this);
   numer = numer / gcd;
   denom = denom / gcd;
 }

 public int compareTo(Object r){
    if (!(r instanceof Rational)) {
      throw new ClassCastException("\ncompareTo() input not a Rational");
    }
    Rational joe = (Rational)r;
  if ( ( this.floatValue() - joe.floatValue() ) != 0){
    if ( ( this.floatValue() - joe.floatValue() ) > 0){
      return 1;
    }
    return -1;
  }
  return 0;
 }

 public boolean equals(Object r){
    if (!(r instanceof Rational)) {
      return false; } // simply wont allow it
   Rational joe = (Rational)r; //make sure we working with rationals
   joe.reduce();
   this.reduce();
   return ((this.numer == joe.denom) && (this.numer == joe.denom));
 }
}
