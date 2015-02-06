package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

@SuppressWarnings("unused")
public class MainActivity extends Activity {
	
	private Button buttonclick1;
	private CheckBox checkBox1;
	
protected void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	buttonclick1 = (Button)findViewById(R.id.buttonclick1);
	buttonclick1.setText(getResources().getString(R.string.b1));
	
	
	checkBox1=(CheckBox)findViewById(R.id.checkBox1);
	checkBox1.setText("what");
	
	
	buttonclick1.setText(Html.fromHtml("<b>" + getResources().getString(R.string.b1)+ "<b/>"));
}

}
    
   