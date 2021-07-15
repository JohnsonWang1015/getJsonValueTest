package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.entity.AQI;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class MainClass {

	public static void main(String[] args) {
		
		/*Path json = Paths.get("./mask.json");
		try {
			String lines = Files.readString(json);
			
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			Gson gson = builder.create();
			
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(lines);
			JsonArray array = null;
			
			if(element.isJsonArray()) {
				array = element.getAsJsonArray();
			}
			
			Iterator it = array.iterator();
			it.forEachRemaining(data -> System.out.printf("%s%n", gson.fromJson(data.toString(), Mask.class).getMaskData()));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//---------------------------------------------------------------
		
		Path aqi = Paths.get("./aqi.json");
		
		try {
			String lines = Files.readString(aqi);
			
			JsonParser parser = new JsonParser();
			JsonElement tree = parser.parse(lines);
			JsonArray array = tree.getAsJsonObject().get("records").getAsJsonArray();

			AQI data = null;
			for(JsonElement element : array) {
				//System.out.println(element);
				System.out.println(element.getAsJsonObject().get("SiteName") + "，AQI = " + element.getAsJsonObject().get("AQI").toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}