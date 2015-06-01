package course.examples.helloworldwithlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelloAndroid extends Activity {
    public void onCreate(Bundle savedInstanceState) {

        // Required call through to Activity.onCreate()
        // Restore any saved instance state
        super.onCreate(savedInstanceState);

        // Set up the application's user interface (content view)
        	
        setContentView(R.layout.helloandroid);
        }
    

    public void Click (View view){
    	Intent intent = new Intent(this, Hellow.class);
    	startActivity(intent);
    }
    
    
    }
