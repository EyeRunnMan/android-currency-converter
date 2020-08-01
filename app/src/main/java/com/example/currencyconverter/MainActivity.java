package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button india,china,btc,russia,etc,usd,dubai,pound,eur;
    TextView tv;
    EditText input;
    //values
    double $=68.94;
    double ind=1.00;
    double diram=18.77;
    double cny=10.03;
    double pnd=87.36;
    double bitcoin=765758.14;
    double ert=20331.14;
    double eng=78.36;
    double rubel=1.09;
    double calc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        india = findViewById(R.id.india);
        china = findViewById(R.id.china);
        btc = findViewById(R.id.btc);
        russia = findViewById(R.id.russia);
        etc = findViewById(R.id.etc);
        usd = findViewById(R.id.usd);
        dubai = findViewById(R.id.dubai);
        pound = findViewById(R.id.pound);
        eur = findViewById(R.id.eur);
        input = findViewById(R.id.input);
        tv = findViewById(R.id.tv);

        //setuo.onclick listner
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            try {
                calc=Double.valueOf(""+input.getText());
                tv.setText(""+(calc*ind)+" INR");

            }catch (Exception e){
                Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
            }
            }
        });
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*cny)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*bitcoin)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*pnd)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    input.setText("");
                    tv.setText("");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*eng)+"  INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*diram)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*rubel)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc=Double.valueOf(""+input.getText());
                    tv.setText(""+(calc*$)+" INR");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

