package com.example.indiantourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class tabs extends Activity implements OnClickListener
{
	private Button b1,b2,b3,b4;
	  
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0==b1)
		{
			Intent intent=new Intent(this,hotels.class);
			startActivity(intent);
		}
	
		if(arg0==b2)
		{
			Intent intent=new Intent(this,place.class);
			startActivity(intent);
		}
		if(arg0==b3)
		{
			Intent intent=new Intent(this,conveyance.class);
			startActivity(intent);
		}
		if(arg0==b4)
		{
			Intent intent=new Intent(this,maps.class);
			startActivity(intent);
		}
	
	}

}
