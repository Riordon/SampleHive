package com.diexun.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class UDFCheckUrl extends UDF{
	
	private static String[] columns = {"HotConcern", "ColorAnalysis", "BrandGallery", "InspiredTheme",
									   "FashionBulletin", "TrendAnalysis", "Planning", "ColorTrend",
									   "PatternTrend", "Design", "Tanalysis", "WindowAnalysis",
									   "Book", "RunwayTrends", "DesignPlus", "FashionStarNews",
									   "FashionStreetSnap", "FashionEditorTalk", "FashionLifeStyle"};
	
	private static int columns_length = columns.length;
	
	 public boolean evaluate(String url) {
		 if (url.contains("http://epd.sxxl.com/Search")) return false;
		 
		 for (int i = 0; i < columns_length; i++) {
			 if (url.contains(columns[i])) return true;
		 }
		 
		 return false;
	 }
	 
//	 
//	 public static void main(String... args) {
//		 UDFParseUrlToChannel obj = new UDFParseUrlToChannel();
//		 System.out.println(obj.evaluate("http://epd.sxxl.com/BrandGallery/themeList/channel/2084.html"));
//	 }
}
