package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Bundle extras=getIntent().getExtras();
        String  v1=extras.getString("value1");
        t=(TextView)findViewById(R.id.textView2);
        t.setText(t.getText()+""+v1);
    }
}
