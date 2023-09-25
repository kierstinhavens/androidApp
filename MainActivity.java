package com.example.program2havensfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_FIRST = "myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE_LAST = "myfirstapp.MESSAGELast";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, activityDisplayMessage.class);
        EditText editTextFirst = (EditText) findViewById(R.id.firstName);
        EditText editTextLast = (EditText) findViewById(R.id.lastName);
        String messageFirst = editTextFirst.getText().toString();
        String messageLast = editTextLast.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_FIRST, messageFirst);
        intent.putExtra(EXTRA_MESSAGE_LAST, messageLast);
        // alternative: intent.putExtras(extras);
        startActivity(intent);
    }

}
