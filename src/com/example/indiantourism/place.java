package com.example.indiantourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class place extends Activity implements OnClickListener {
	private ImageButton i1,i2,i3,i4,i5;
	private TextView t1,t2,t3,t4,t5;
	 
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.activity_main);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView5);
		i1=(ImageButton)findViewById(R.id.imageButton1);
		i2=(ImageButton)findViewById(R.id.imageButton2);
		i3=(ImageButton)findViewById(R.id.imageButton3);
		i4=(ImageButton)findViewById(R.id.imageButton4);
		i5=(ImageButton)findViewById(R.id.imageButton5);
		i1.setOnClickListener(this);
		i2.setOnClickListener(this);
		i3.setOnClickListener(this);
		i4.setOnClickListener(this);
		i5.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0==i1)
		{
			Intent intent=new Intent(this,suntalekhola.class);
			startActivity(intent);
		}
	
		if(arg0==i2)
		{
			Intent intent=new Intent(this,tiger.class);
			startActivity(intent);
		}
		if(arg0==i3)
		{
			Intent intent=new Intent(this,batasia.class);
			startActivity(intent);
		}
		if(arg0==i4)
		{
			Intent intent=new Intent(this,bhuia.class);
			startActivity(intent);
		}
		if(arg0==i5)
		{
			Intent intent=new Intent(this,park.class);
			startActivity(intent);
		}
	
		
	}

}
