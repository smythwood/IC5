package com.example.ic5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	String state;
	String population;
	
	TextView textView1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        
        
        
        
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
        	final TextView text1 = (TextView)findViewById(R.id.textView1);
        			final TextView text2 = (TextView)findViewById(R.id.textView1);
        	
        	EditText editText = (EditText) findViewById(R.id.editText1);
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.d("demo", "button clicked");
				
				GetMethodEx test = new GetMethodEx();
				
				String returned;
				
				try {
					returned = test.getInternetData();
					textView1.setText(returned);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Log.d("demo", editText.getText().toString());
				
				
				
				
				
				  text1.setVisibility(View.VISIBLE);
				   text2.setVisibility(View.VISIBLE);
				 //text1.setText(editText.getText());
				
			}
            
        });
        
        
        
        
        
        
        
        
    }
    
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    
    
    
    
    
}
