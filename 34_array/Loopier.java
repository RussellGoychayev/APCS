/*
* Team Green -- Abdullah Faruque, Neil Lin, Russell Goychayev
* APCS
* HW34: A Pirate's Life for Me
* 2021-11-12
* time spent: 1 hr

* DISC- you can not change the length of an array. Using for(int i:(name of array)) you can cycle the contents inside of an array
* QCC- For the recursive linearsearch method, I was only able to make it return the last instance of the input number, if it comes up more than once...
*/

public class Loopier {

    public static void generateArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10);
        }
    }

    public static String arrayToString(int[] a) {
        String output = "";
        for (int i: a) {
            output += String.valueOf(i) + " ";
        }
        return output;
    }

    public static int linSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }

    public static int linSearchR(int[] a, int target) {
        if (a.length == 0) return -1;
        if (a[a.length - 1] == target) {
            return a.length - 1;
        } else {
            int[] b = new int[a.length - 1];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            a = b;
            return linSearchR(a, target);
        }
    }

    public static int freq(int[] a, int target) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                counter++;
            }
        }
        return counter;
    }

    public static int freqR(int[] a, int target) {
        if (a.length == 0) {
            return 0;
        } else {
            int[] b = new int[a.length - 1];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            if (a[a.length - 1] == target) {
                return 1 + freqR(b, target);
            } else {
                return freqR(b, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        generateArray(array);
        System.out.println(arrayToString(array));
		System.out.println(linSearch(array, 5));
        System.out.println(linSearchR(array, 5));
		System.out.println(freq(array, 5));
		System.out.println(freqR(array, 5));


    }
}
