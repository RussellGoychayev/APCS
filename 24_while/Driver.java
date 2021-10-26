// Abdullah Faruque, Russell Goychayev (Team Bozos)
// APCS
// HW24: Get It While You Can
// 2021-10-25
// time spent- 1.5 hours

/*
DISCO: while loops let you keep flipping till you meet the requirements. 
QCC:number of matches is always DOB*33. Why?
*/

public class Driver {


public static void bozos(int x, int y, int dob){
	Coin a= new Coin("penny");
	Coin b= new Coin("quarter");
	int matches=0;
	int flips=0;
	while ((a.getHeadsCtr()+b.getHeadsCtr()<x) || (matches<y) || (matches<65536) || ((matches%dob != 0))){
		a.flip();
		b.flip();
		flips++;
		if(a.equals(b)){
			matches+=1;
		}
	
	}

  	System.out.println("Matches: " + matches);
	System.out.println("Flips: " + flips);
	System.out.println("coin a headcount: " + a.getHeadsCtr());
	System.out.println("coin b headcount: " + b.getHeadsCtr());
}
public static void main(String[] args){
	bozos(2000,2000,2005);
}
}
