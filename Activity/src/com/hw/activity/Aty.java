package com.hw.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Aty extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("onCreate1");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty);
		
	}
	protected void onStart() {
    	System.out.println("onStart1");
    	super.onStart();
    	
    }
	
	public void Press(View v) {
		finish();
	}
    @Override
    protected void onResume() {
    	System.out.println("onRsume1");
    	super.onResume();
    }
    @Override
    protected void onPause() {
    	System.out.println("onPause1");
    	super.onPause();
    }
    @Override
    protected void onStop() {
    	System.out.println("onStop1");
    	super.onStop();
    }
    @Override
    protected void onDestroy() {
    	System.out.println("onDestroy1");
    	super.onDestroy();
    }
    @Override
    protected void onRestart() {
    	System.out.println("onRestart1");
    	super.onRestart();
    }
    
    
    long firstTime=-1;
    long SecTime=-1;
    @Override
    public void onBackPressed() {
    	if(firstTime<0)
    	{
    		firstTime=System.currentTimeMillis();
    		Toast.makeText(this, "Press Again", Toast.LENGTH_SHORT).show();
    	}
    	else 
    	{
			SecTime=System.currentTimeMillis();
			if(SecTime-firstTime<2000)
			{	finish();
				//super.onBackPressed();
			}
			else
			{
				Toast.makeText(this, "Press Again", Toast.LENGTH_SHORT).show();
				//lastTime=currentTime;
				firstTime=SecTime;
			}
		}
    }
    
}
