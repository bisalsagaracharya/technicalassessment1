//import java.util.Random;
//
//public class GenerateOTP {
//	
// 
//	//declaring a of return type String
//	//which on calling provides the otp
//	    public static String generateOTP()  { 
//	    	//int randomPin declared to store the otp
//	        //since we using Math.random() hence we have to type cast it int
//	        //because Math.random() returns decimal value
//	        int randomPin   =(int) (Math.random()*9000)+1000;
//	        String otp  = String.valueOf(randomPin);
//	        return otp; //returning value of otp
//	    }
//	  public static void main(String args[]){  
//		   //method to call and print otp
//	        String otpSting  =generateOTP();
//	        //function calling
//	        System.out.println("OTP : "+otpSting);
//	    }
//	} 
//// Here we are using Math.random() function.
//// class in Java 
//
//package com.stackroute.userservice.generateotp;
//
//public class OTPGenerate {
//    public static String generateOTP(String s, int n) {
//        String str = s;
//        int length = n;
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            int index = (int) (str.length() * Math.random());
//            builder.append(str.charAt(index));
//        }
//        return builder.toString();
//    }
//    public static int generateId() {
//        String s = "123456789";
//        int n = 4;
//        String str = generateOTP(s, n);
//        String finalId = str;
//        int id = Integer.parseInt(finalId);
//        return id;
//
//    }
//}