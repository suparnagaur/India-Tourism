package com.example.indiantourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ProgressBar pb;
	private int ps=0;
	private TextView tv1;
	private Handler hr=new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pb=(ProgressBar)findViewById(R.id.progressBar1);
		tv1=(TextView)findViewById(R.id.textView1);
		new Thread(new Runnable(){
			public void run() {
				while(ps<100)
				{
					ps+=1;
					hr.post(new Runnable(){
						public void run()
						{
							pb.setProgress(ps);
							tv1.setText(ps+"/"+pb.getMax());
						}
					});
					
					
					try
					{
						Thread.sleep(200);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
			}
	
		
		
	}).start();
		Intent intent = new Intent(MainActivity.this, tabs.class);
		startActivity(intent);
	
	}
}
