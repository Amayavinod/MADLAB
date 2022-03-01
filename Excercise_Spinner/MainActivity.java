package com.example.myapplication10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.Bundle;

// Main Activity implements Adapter view
public class MainActivity extends AppCompatActivity {
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s= findViewById(R.id.s1);
        ArrayAdapter<CharSequence> a=ArrayAdapter.createFromResource(this,R.array.a1,R.layout.support_simple_spinner_dropdown_item);
        a.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s.setAdapter(a);

    }
}
