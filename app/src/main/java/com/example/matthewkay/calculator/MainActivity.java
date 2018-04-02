package com.example.matthewkay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button one,two, three, four, five, six, seven,decimal, eight, nine, plus, minus, divide, equal, clear, clearentry, zero,negative, multiply;
    String equ;
    TextView calc, equationview;

    private double val1 = 0, val2 = 0, num = 0;
    private boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = findViewById(R.id.display);
        equationview = findViewById(R.id.equation);
        add = false;
        sub = false;
        mult = false;
        div = false;

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        five = findViewById(R.id.five);
        multiply = findViewById(R.id.multiply);
        divide =  findViewById(R.id.divide);
        negative = findViewById(R.id.plusMinus);
        decimal = findViewById(R.id.decimal);
        clear = findViewById(R.id.clear);
        clearentry = findViewById(R.id.clearEntry);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        equal = findViewById(R.id.equals);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);



        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (!current.equals("0")) {
                    calc.setText("0");
                } else {

                }
            }
        });

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("1");
                } else {
                    current += "1";
                    calc.setText(current);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("2");
                } else {
                    current += "2";
                    calc.setText(current);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("3");
                } else {
                    current += "3";
                    calc.setText(current);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("4");
                } else {
                    current += "4";
                    calc.setText(current);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("5");
                } else {
                    current += "5";
                    calc.setText(current);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("6");
                } else {
                    current += "6";
                    calc.setText(current);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("7");
                } else {
                    current += "7";
                    calc.setText(current);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("8");
                } else if(current.equals("8")) {
                    current += "8";
                    calc.setText(current);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if (current.equals("0")) {
                    calc.setText("9");
                } else {
                    current += "9";
                    calc.setText(current);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                val1 = 0;
                val2 = 0;
                num = 0;
                calc.setText("0");
                div = false;
                mult= false;
                sub = false;
                add = false;


            }
        });

        clearentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.setText("0");



            }
        });

        decimal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String current = calc.getText().toString();
                if(!current.contains(".")) {
                    current += ".";
                    calc.setText(current);
                }

            }
        });
        negative.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double current = Double.parseDouble(calc.getText().toString());
                current *= -1;
                calc.setText(Double.toString(current));

            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                    val1 = Double.parseDouble(calc.getText().toString());
                    calc.setText("");
                    div = false;
                    mult = false;
                    sub = false;
                    add = true;

            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                System.out.println(div);
                System.out.println(mult);
                System.out.println(sub);
                System.out.println(add);

                    val1 = Double.parseDouble(calc.getText().toString());
                    calc.setText("");
                    div = false;
                    mult = false;
                    sub = true;
                    add = false;


            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    val1 = Double.parseDouble(calc.getText().toString());
                    calc.setText("");
                    div = false;
                    mult = true;
                    sub = false;
                    add = false;

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    val1 = Double.parseDouble(calc.getText().toString());
                    calc.setText("");
                    div = true;
                    mult = false;
                    sub = false;
                    add = false;

            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Double.parseDouble(calc.getText().toString());
                num = calc(val1, val2);
                calc.setText(Double.toString(num));

            }
        });

    }



    public double calc(Double val1, Double val2){
        Double finnum = 0.0;
        if(add){
            finnum = val1 + val2;
            add = false;
        }else if(sub){
            finnum = val1 - val2;
            mult = false;
        }else if(mult){
            finnum = val1 * val2;
            mult = false;
        }else if(div){
            finnum = val1 / val2;
            div = false;
        }



        return finnum;



    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putDouble("val1", val1);
        savedInstanceState.putDouble("val2", val2);
        savedInstanceState.putBoolean("add", add);
        savedInstanceState.putBoolean("sub",sub);
        savedInstanceState.putBoolean("div", div);
        savedInstanceState.putBoolean("mult", mult);
        savedInstanceState.putString("calc", String.valueOf(calc.getText()));


    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        val1 = savedInstanceState.getDouble("val1");
        val2 = savedInstanceState.getDouble("val2");
        add = savedInstanceState.getBoolean("add");
        sub = savedInstanceState.getBoolean("sub");
        mult = savedInstanceState.getBoolean("mult");
        div = savedInstanceState.getBoolean("div");


        calc.setText(savedInstanceState.getString("calc"));


    }




}
