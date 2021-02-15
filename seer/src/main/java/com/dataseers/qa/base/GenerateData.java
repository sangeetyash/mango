package com.dataseers.qa.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {

	static String randomstring="abcdefghijklmnopqrstuvwxyz";
	static String randomnumber="1234567890";

	public static String generateRandomString(int length){
		return RandomStringUtils.randomAlphabetic(length);
	}
	
	public static String generateRandomNumber(int length){
		return RandomStringUtils.randomNumeric(length);
	}
	
	
	 public static String generateRandomIP() {
         return randomIP() + "." + randomIP() + "." + randomIP() + "." + randomIP();
     }

     public static int randomIP() {
         return new Random().nextInt((255 - 1) + 1) + 1;
     }
	
	public static String generateRandomAlphaNumeric(int length){
		return RandomStringUtils.randomAlphanumeric(length);
	}
	
	public static String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
		String allowedChars=randomstring +   //alphabets
				randomnumber +   //numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}
	
	public String generateEmail(int length) {
		String allowedChars=randomstring +   //alphabets
				randomnumber +   //numbers
				"_-.";   //special characters
		String email="";
		String temp=RandomStringUtils.random(length,allowedChars);
		email=temp.substring(0,temp.length()-9)+"@test.org";
		return email;
	}
	
	public String generateUrl(int length) {
		String allowedChars=randomstring +   //alphabets
				randomnumber +   //numbers
				"_-.";   //special characters
		String url="";
		String temp=RandomStringUtils.random(length,allowedChars);
		url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
		return url;
	}
	public static String generateIMEI() {
        int pos;
        int[] str = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int sum = 0;
        int final_digit;
        int t;
        int len_offset;
        int len = 15;
        String imei = "";

        String[] rbi = new String[]{"01", "10", "30", "33", "35", "44", "45", "49", "50", "51", "52", "53", "54", "86", "91", "98", "99"};
        String[] arr = rbi[(int) Math.floor(Math.random() * rbi.length)].split("");
        str[0] = Integer.parseInt(arr[0]);
        str[1] = Integer.parseInt(arr[1]);
        pos = 2;

        while (pos < len - 1) {
            str[pos++] = (int) (Math.floor(Math.random() * 10) % 10);
        }

        len_offset = (len + 1) % 2;
        for (pos = 0; pos < len - 1; pos++) {
            if ((pos + len_offset) % 2 != 0) {
                t = str[pos] * 2;
                if (t > 9) {
                    t -= 9;
                }
                sum += t;
            } else {
                sum += str[pos];
            }
        }

        final_digit = (10 - (sum % 10)) % 10;
        str[len - 1] = final_digit;

        for (int d : str) {
            imei += String.valueOf(d);
        }

        return imei;
    }
	public static String generateRandomDate(String Format, String startDate, String endDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(Format);
		Calendar cal = Calendar.getInstance();
		cal.setTime(formatter.parse(startDate));
		Long value1 = cal.getTimeInMillis();

		cal.setTime(formatter.parse(endDate));
		Long value2 = cal.getTimeInMillis();

		long value3 = (long) (value1 + Math.random() * (value2 - value1));
		cal.setTimeInMillis(value3);
		return formatter.format(cal.getTime());
	}
	
	
	
}