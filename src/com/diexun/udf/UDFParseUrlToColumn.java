package com.diexun.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class UDFParseUrlToColumn extends UDF{
	
	 public String evaluate(String url) {
		 if (url == null) return null;
		 
		 int begin = url.indexOf("epd.sxxl.com");
		 
		 String tempUrl = url.substring(begin + 13);
		 int end = tempUrl.indexOf("/");
		 
		 return tempUrl.substring(0, end);
	 }
	 
//	 
//	 public static void main(String... args) {
//		 UDFParseUrlToColumn obj = new UDFParseUrlToColumn();
//		 System.out.println(obj.evaluate("http://epd.sxxl.com/BrandGallery/themeList/channel/2084.html"));
//	 }
}
