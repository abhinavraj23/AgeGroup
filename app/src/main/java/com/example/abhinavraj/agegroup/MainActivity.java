package com.example.abhinavraj.agegroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a;
    private EditText editText,editText2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = Integer.parseInt(editText.getText().toString());
                if(a>=65){
                    Intent i = new Intent(MainActivity.this,FinalActivity1.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Welcome "+(editText2.getText().toString()),Toast.LENGTH_LONG).show();
                }
                else if((a<65)&&(a>=45)){
                    Intent i = new Intent(MainActivity.this,FinalActivity2.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Welcome "+(editText2.getText().toString()),Toast.LENGTH_LONG).show();
                }
                else if((a<45)&&(a>=18)){
                    Intent i = new Intent(MainActivity.this,FinalActivity3.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Welcome "+(editText2.getText().toString()),Toast.LENGTH_LONG).show();
                }
                else{
                    Intent i = new Intent(MainActivity.this,FinalActivity4.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Welcome "+(editText2.getText().toString()),Toast.LENGTH_LONG).show();
                }
                editText.getText().clear();
                editText2.getText().clear();
            }
        });

    }
}