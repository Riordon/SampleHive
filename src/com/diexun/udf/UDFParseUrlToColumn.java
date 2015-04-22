package com.diexun.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class UDFParseUrlToColumn extends UDF{
	private static String[] columns = {"HotConcern","BrandGallery","InspiredTheme","FashionBulletin",
									   "TrendAnalysis","Planning","ColorTrend","PatternTrend",
									   "Design","Tanalysis","WindowAnalysis","Book",
									   "ColorAnalysis","RunwayTrends","DesignPlus"};
	private int colums_length = columns.length;
	
	public String evaluate(String url) {
		 if (url == null) return null;
		 
		 int begin = url.indexOf("epd.sxxl.com");
		 
		 String tempUrl = url.substring(begin + 13);
		 int end = tempUrl.indexOf("/");
		 String result = tempUrl.substring(0, end);
		 
		 for (int i = 0; i < colums_length; i++) {
			 if(columns[i].indexOf(result) != -1) return result;
		 }
		 
		 return null;
	 }
	 
//	 
//	 public static void main(String... args) {
//		 UDFParseUrlToColumn obj = new UDFParseUrlToColumn();
//		 System.out.println(obj.evaluate("http://epd.sxxl.com/BrandGallery/themeList/channel/2084.html"));
//	 }
}
