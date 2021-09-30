public class Time{
  public static void main(String[] args){
    double hour = 1;
    double minute = 37;
    double second = 21;
    double secondsElapsed = (hour * 60 * 60) + (minute * 60) + second;

    System.out.println("Seconds elapsed: " + secondsElapsed);
    System.out.println("Seconds remaining: " + (24 * 60 * 60 - second));
    System.out.println("Fraction of Day Elapsed: " + (second / (24 * 60 * 60)));
    System.out.println("Seconds since midnight: " + (((hour % 24) * 60 * 60) + (minute * 60) + second));
  }
}
