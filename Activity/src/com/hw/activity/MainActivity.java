package com.hw.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btnStartAty;
		

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	System.out.println("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStartAty=(Button) findViewById(R.id.btnStartAty);
        btnStartAty.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(MainActivity.this, "Hellow", Toast.LENGTH_SHORT).show();
				System.out.println("pressButton");
				Intent i=new Intent(MainActivity.this,Aty.class);
				startActivity(i);
			}
		});
    }

    @Override
    protected void onStart() {
    	System.out.println("onStart");
    	super.onStart();
    	
    }
    @Override
    protected void onResume() {
    	System.out.println("onRsume");
    	super.onResume();
    }
    @Override
    protected void onPause() {
    	System.out.println("onPause");
    	super.onPause();
    }
    @Override
    protected void onStop() {
    	System.out.println("onStop");
    	super.onStop();
    }
    @Override
    protected void onDestroy() {
    	System.out.println("onDestroy");
    	super.onDestroy();
    }
    @Override
    protected void onRestart() {
    	System.out.println("onRestart");
    	super.onRestart();
    }
    
}
