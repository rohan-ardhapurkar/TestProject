package com.example.rohan.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clickBtn;
    EditText nameEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdit =(EditText) findViewById(R.id.editText1);
        clickBtn = (Button) findViewById(R.id.btn);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEdit.getText().toString();
                Toast.makeText(getApplicationContext(),"Hello : "+name,Toast.LENGTH_LONG).show();
            }
        });
    }
}
