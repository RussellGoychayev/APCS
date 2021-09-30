public class Date{
  public static void main(String[] args){
    String dayofweek = "Thursday ";
    String dayofmonth = "16 ";
    String month = "July ";
    String year = "2015";

    System.out.println("American format: ");
    System.out.println(dayofweek + "," + month + dayofmonth + "," + year);
    System.out.println("European format: ");
    System.out.println(dayofweek + month + dayofmonth + year);
  }
}
