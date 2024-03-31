package com.zunaisha.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onIndexSendButtonClicked(View v){

        Intent intent = new Intent(this , SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextIndex);
        String index = editText.getText().toString();
        intent.putExtra("ImageIndex",index);
        startActivity(intent);
    }
}