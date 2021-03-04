package com.example.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tvDisplay;
        TextView tvResult;
        EditText etChirps;
        Button btn;

        tvDisplay=findViewById(R.id.tvDisplay);
        tvResult=findViewById(R.id.tvResult);
        etChirps=findViewById(R.id.etChirps);
        btn=findViewById(R.id.btn);

        tvResult.setVisibility(View.GONE);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                if (etChirps.getText().toString().equals(null))
                {
                    return;
                }
                int chirps=Integer.parseInt(etChirps.getText().toString());
                double result=0;
                result=(((double) chirps)/3)+4;
                String text="The approximate temperature outside is "+result+" degrees Celsius.";
                tvResult.setText(text);
                tvResult.setVisibility(View.VISIBLE);
            }
        });

    }
}