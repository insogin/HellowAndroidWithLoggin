package course.examples.helloworldwithlogin;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreen);

        final EditText uname = (EditText) findViewById(R.id.username_edittext); //defined in loginscreen.xml
        final EditText passwd = (EditText) findViewById(R.id.password_edittext);

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                if (checkPassword(uname.getText().toString(), passwd.getText().toString())) {

                    // Create an explicit Intent for starting the HelloAndroid
                    // Activity
                    Intent helloAndroidIntent = new Intent(LoginScreen.this,
                            HelloAndroid.class);

                    // Use the Intent to start the HelloAndroid Activity
                    startActivity(helloAndroidIntent);
                } else {
                    uname.setText(""); //set null text
                    passwd.setText("");
                }
            }
        });
    }

    
    private boolean checkPassword( String uname1, String passwd1) { //as opposed to immutable text like Strings
        // Just pretending to extract text and check password
    	
        //return new Random().nextBoolean();
    	if (uname1.equals("wenjin")&&passwd1.equals("1234"))
    	return true;
    	
    	return false;
    	
    }
    
}
