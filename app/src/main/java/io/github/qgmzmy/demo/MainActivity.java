package io.github.qgmzmy.demo;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.service.autofill.OnClickAction;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
private Button bn;     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=(Button) findViewById(R.id.nextActivity);
		bn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent tz=new Intent();
					tz.setClass(MainActivity.this,demo.class);
					startActivity(tz);
					Toast.makeText(MainActivity.this,"切换成功",Toast.LENGTH_SHORT).show();
				}
			});
    }
	
}
