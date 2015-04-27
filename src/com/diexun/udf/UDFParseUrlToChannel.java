package com.diexun.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class UDFParseUrlToChannel extends UDF{
	
	private static String FASHION_ID = "3"; 
	
	 public String evaluate(String url) {

		 int begin = url.indexOf("channel");
		 
		 String result = url.substring(begin + 8, begin + 12);
		 
		 if (result.equals("2084") || result.equals("2085")) return result;
		 
		 return FASHION_ID;
	 }	 
	 
//	 public static void main(String... args) {
//		 UDFParseUrlToChannel obj = new UDFParseUrlToChannel();
//		 System.out.println(obj.evaluate("http://epd.sxxl.com/FashionStarNews/index.html"));
//	 }
}
