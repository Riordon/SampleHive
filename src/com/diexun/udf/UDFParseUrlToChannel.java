package com.diexun.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class UDFParseUrlToChannel extends UDF{
	
	 public String evaluate(String url) {
		 if (url == null) return null;
		 
		 int begin = url.indexOf("channel");
		 
		 String result = url.substring(begin + 8, begin + 12);
		 if ((result != "2084") && (result != "2085")) return "";
		 
		 return result;
	 }
	 
//	 
//	 public static void main(String... args) {
//		 UDFParseUrlToChannel obj = new UDFParseUrlToChannel();
//		 System.out.println(obj.evaluate("http://epd.sxxl.com/BrandGallery/themeList/channel/2084.html"));
//	 }
}
