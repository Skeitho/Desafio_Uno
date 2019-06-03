package com.previred.test.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.previred.test.dto.GDDDTO;
import com.google.gson.Gson;


public class Consume {
	
	
	public GDDDTO consume(String urlEnv) {
		
		GDDDTO data = null;
        String response = null;
        
        
		
		try {

            URL url = new URL(urlEnv);//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String line;

            while ((line = br.readLine()) != null) {
                response = line;
            }
            conn.disconnect();
            
            data = new Gson().fromJson(response, GDDDTO.class);
            
            return data;

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
		
		return data;
	}

}
