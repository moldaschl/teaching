package at.hakwt;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialSecurityNumberCheck {

    public static void main(String[] args) {
        System.out.println("Sozialversicherungsnummer prüfen!");
        System.out.println("*********************************");
	    Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Sozialversicherungsnummer ein: ");
        String socialNo = sc.next();
        if ( socialNoIsReal(socialNo) ) {
            System.out.println("Korrekt");
        } else {
            System.out.println("Entweder es sind mehr als 10 Ziffern oder die Nummer ist nicht gültig");
        }
    }

    public static boolean socialNoIsReal(String socialNo) {
        if (socialNo.length() > 10 ) return false;
        ArrayList<Integer> runningNoMultipliers = new ArrayList<>();
        runningNoMultipliers.add(3);
        runningNoMultipliers.add(7);
        runningNoMultipliers.add(9);
        int sum = 0;
        int i = 0;
        for(int m : runningNoMultipliers) {
            sum += m * Character.getNumericValue(socialNo.charAt(i));
            i++;
        }

        ArrayList<Integer> birthDateMultipliers = new ArrayList<>();
        birthDateMultipliers.add(5);
        birthDateMultipliers.add(8);
        birthDateMultipliers.add(4);
        birthDateMultipliers.add(2);
        birthDateMultipliers.add(1);
        birthDateMultipliers.add(6);

        i = 4;
        for(int m : birthDateMultipliers) {
            sum += m * Character.getNumericValue(socialNo.charAt(i));
            i++;
        }
        int checkDigit = sum % 11;
        return checkDigit == Character.getNumericValue(socialNo.charAt(3));
    }

    public static boolean socialNoIsRealNoArrayList(String socialNo) {
        if (socialNo.length() > 10 ) return false;
        int[] multipliers = {3,7,9,-1,5,8,4,2,1,6};
        int sum = 0;
        for (int i = 0; i < socialNo.length(); i++) {
            if ( i == 3 ) {
                continue;
            }
            sum += Character.getNumericValue(socialNo.charAt(i)) * multipliers[i];
        }
        int checkDigit = sum % 11;
        return checkDigit == Character.getNumericValue(socialNo.charAt(3));
    }
}
