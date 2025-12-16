package day1124;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UseURLEncoder {

   public static void main(String[] args) throws UnsupportedEncodingException {
      
      String name="홍길동";
      System.out.println(name);
      
      String enName=URLEncoder.encode(name,"UTF-8");
      System.out.println(enName);
      //id=%ED%99%8D%EA%B8%B8%EB%8F%99
   }//main

}//class
