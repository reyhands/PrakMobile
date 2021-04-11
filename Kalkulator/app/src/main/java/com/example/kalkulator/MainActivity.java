package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button BtnHasil;
    private TextView Sin,Cos,Tan,Csc,Cot;
    private EditText Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnHasil = findViewById(R.id.btn_hasil);
        Sin = findViewById(R.id.hasilsin);
        Cos = findViewById(R.id.hasilcos);
        Tan = findViewById(R.id.hasiltan);
        Csc = findViewById(R.id.hasilcsc);
        Cot = findViewById(R.id.hasilcot);
        Input = findViewById(R.id.Input);

        BtnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sinput = Input.getText().toString();

                double input = Double.parseDouble(sinput);

                double sin = Math.round(Math.sin(Math.toRadians(input)));
                double cos  = Math.round(Math.cos(Math.toRadians(input)));
                double tan = Math.round(Math.tan(Math.toRadians(input)));
                double csc = Math.round(1/Math.sin(Math.toRadians(input)));
                double cot = Math.round(1/Math.tan(Math.toRadians(input)));

                Sin.setText(String.valueOf(sin));
                Cos.setText(String.valueOf(cos));
                Tan.setText(String.valueOf(tan));
                Csc.setText(String.valueOf(csc));
                Cot.setText(String.valueOf(cot));

            }
        });

    }
}