package com.example.ic5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.util.Log;

class GetMethodEx  {
	
		//text1.setText(editText.getText());
		
		public String getInternetData() throws Exception{
			BufferedReader in= null;
			String data=null;
					try{
						HttpClient client = new DefaultHttpClient();
						URI website = new URI("http://www.mybringback.com");
						HttpGet request = new HttpGet();
						request.setURI(website);
						HttpResponse response = client.execute(request);
						in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
						StringBuffer sb = new StringBuffer("");
						String l = "";
						String nl = System.getProperty("line.seperator");
						while ((l = in.readLine()) != null){
							sb.append(l + nl);
						}
						in.close();
						data = sb.toString();
						return data;
					}finally {
						if (in != null){
							try{
								in.close();
								return data;
								
							}catch (Exception e){
								e.printStackTrace();
							}
						}
					}
	
			
		}
		
		
	}
	

