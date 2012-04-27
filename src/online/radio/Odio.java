package online.radio;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.view.View;
import android.view.View.OnClickListener;

public class Odio extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b = (Button)this.findViewById(R.id.btn_confirm);
        b.setOnClickListener(this);
    }
    
    public void onClick(View v){
    	
    	EditText var_url = (EditText)this.findViewById(R.id.txt_URL);
    	TextView var_confirm = (TextView)this.findViewById(R.id.txt_confirm);
    	ProgressBar var_PB = (ProgressBar)this.findViewById(R.id.progbar_progress);
    	
    	String URL = var_url.getText().toString(); 
    	
    	String message = "Streaming radio from: \n\n"+URL;
    	
    	var_PB.setProgress(BIND_AUTO_CREATE);
    	
    	var_confirm.setText(message);    	
    	   	
    }
}