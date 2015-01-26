package com.ccm.mardi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MonActivite extends Activity {

	protected static final String TAG = null;
	private Button monBouton;
	private TextView monTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_activite);

        monBouton = (Button) findViewById(R.id.bouttonId);
        monTextView=(TextView)findViewById(R.id.textViewId);
        
        if(savedInstanceState!=null){
        	int v = savedInstanceState.getInt("cledonnee");
        	monTextView.setText(v);
        }

        monBouton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				monTextView.setText("Salut Bobi !");
				Log.i(TAG, "logcat message");
			}
		});
    }
    
    
 	private int i=12;
 	@Override
 	protected void onSaveInstanceState(Bundle outState){
 		super.onSaveInstanceState(outState);
 		outState.putInt("cledonnee", i);
 		Log.i(TAG, "ok");
 	}
}
