package com.ochabmateusz.cres.cresregisterusermicr.jsonParser;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class JsonToObj {
	
	private String link;
	
	
	public ArrayList<String> readJson() {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		JSONParser parser=new JSONParser();
		try {
			
			Object object=parser.parse(new FileReader(this.link));
			JSONObject jsonObject=(JSONObject) object;
			String nick=(String) jsonObject.get("nick");
			String password=(String) jsonObject.get("password");
			String name=(String) jsonObject.get("name");
			arrayList.add(name);
			arrayList.add(nick);
			arrayList.add(password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return arrayList;
	}

}
