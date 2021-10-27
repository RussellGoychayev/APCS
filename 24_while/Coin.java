// Abdullah Faruque, Russell Goychayev (Team Bozos)
// APCS
// HW24: Get It While You Can
// 2021-10-25
// time spent- 1.5 hours

/*
DISCO: while loops let you keep flipping till you meet the requirements. 
QCC:number of matches is always DOB*33. Why?
*/


public class Coin {

    //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;
 //heads = 1, tails = 0;


    /***
     *  Coin() -- default constuctor
     *  precond:
     *  postcond:
     ***/


    public Coin() {
        bias=0.5;
        flip();
    }


    /***
        Coin(String) -- overloaded constructor
        precond: input is one of
        "penny",
        "nickel",
        "dime",
        "quarter",
        "half dollar",
        "dollar"
        postcond:
    ***/
    public Coin(String s) {
        name = s;
        bias=0.5;
        flip();
    }


    /***
        Coin(String,String) --
        precond:
        postcond:
    ***/
    public Coin(String s, String nowFace) {
        name = s;
        bias=0.5;
        upFace = nowFace;
    }


    // Accessors...
    // ----------------------------
    public String getUpFace() {
        return upFace;
    }

    public int getFlipCtr() {
        return flipCtr;
    }

    public double getValue() {
        return value;
    }

    public int getHeadsCtr() {
        return headsCtr;
    }

    public int getTailsCtr() {
        return tailsCtr;
    }
    // ----------------------------


    /***
     * assignValue() -- set a Coin's monetary value based on its name
     * precond:  input String is a valid coin name ("penny", "nickel", etc.)
     * postcond: instvar value gets appropriate value
     * Returns value assigned.
     ***/
    private double assignValue(String s) {
        if (s == "penny") {
            value = 0.01;
            return value;
        } else if (s == "nickel") {
            value = 0.05;
            return value;
        } else if (s == "dime") {
            value = 0.10;
            return value;
        } else if (s == "quarter") {
            value = 0.25;
            return value;
        } else if (s == "half dollar") {
            value = 0.50;
            return value;
        } else if (s == "dollar") {
            value = 1.00;
            return value;
        } else {
            value=0.01;
            return value;//if input is not penny,dime,etc, set it to penny by default...
        }
    }


    /***
        reset() -- initialize a Coin
        precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
        postcond: Coin's attribs reset to starting vals
    ***/
    public void reset(String s, double d) {
        if ((s == "heads" || s == "tails") && (0.0 <= d) && (d<=1.0)) {
            upFace = s;
            bias = d;
        }
    }


    /***
     * String flip() -- simulates a Coin flip
     * precond:  bias is a double on interval [0.0,1.0]
     * (1.0 indicates always heads, 0.0 always tails)
     * postcond: upFace updated to reflect result of flip.
     * flipCtr incremented by 1.
     * Either headsCtr or tailsCtr incremented by 1, as approp.
     * Returns "heads" or "tails"
     ***/
    public String flip() {
        if (Math.random() > bias) {
            upFace = "heads";
            headsCtr += 1;
        } else {
            upFace = "tails";
            tailsCtr += 1;
        }
        flipCtr += 1;
        return upFace;
    }


    /***
     * boolean equals(Coin) -- checks to see if 2 coins have same face up
     * precond: other is not null
     * postcond: Returns true if both coins showing heads
     * or both showing tails. False otherwise.
     ***/
    public boolean equals(Coin other) {
        if (other != null) {
            return (other.getUpFace() == upFace);
        } else {
            return false;
        }
    }


    /***
     * String toString() -- overrides toString() provided by Java
     * precond: n/a
     * postcond: Return String comprised of name and current face
     ***/
    public String toString() {
        return name + " -- " + upFace;
    }

} //end class
