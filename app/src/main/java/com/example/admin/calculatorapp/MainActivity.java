package com.example.admin.calculatorapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String num = null, num1 = null, operator = null;
    TextView tvDisplay;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnClear, btnPlusMinus, btnPercent, btnDivide, btnMultiply, btnMinus, btnAdd, btnEquals, btnPeriod;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(getString(R.string.Zero));

        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        //btnPlusMinus.setOnClickListener(this);

        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnPercent.setOnClickListener(this);

        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(this);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(this);
        btnPeriod = (Button) findViewById(R.id.btnPeriod);
        btnPeriod.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn0:
                if(num1 == null){
                    num1 = getString(R.string.Zero);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Zero);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn1:
                if(num1 == null){
                    num1 = getString(R.string.One);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.One);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn2:
                if(num1 == null){
                    num1 = getString(R.string.Two);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Two);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn3:
                if(num1 == null){
                    num1 = getString(R.string.Three);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Three);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn4:
                if(num1 == null){
                    num1 = getString(R.string.Four);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Four);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn5:
                if(num1 == null){
                    num1 = getString(R.string.Five);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Five);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn6:
                if(num1 == null){
                    num1 = getString(R.string.Six);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Six);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn7:
                if(num1 == null){
                    num1 = getString(R.string.Seven);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Seven);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn8:
                if(num1 == null){
                    num1 = getString(R.string.Eight);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Eight);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btn9:
                if(num1 == null){
                    num1 = getString(R.string.Nine);
                    tvDisplay.setText(num1);
                } else {
                    num1 += getString(R.string.Nine);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btnPeriod:
                if(num1 == null){
                    num1 = String.valueOf('.');
                    tvDisplay.setText(String.valueOf(0.));
                } else {
                    num1 += getString(R.string.Period);
                    tvDisplay.setText(num1);
                }
                break;
            case R.id.btnClear:
                tvDisplay.setText(R.string.Zero);
                num = null;
                num1 = null;
                operator = null;
                break;
            case R.id.btnPercent:
                num1 = String.valueOf(Double.parseDouble(tvDisplay.getText().toString()) / 100);
                tvDisplay.setText(num1);
                break;
            case R.id.btnDivide:
                if(num1 != null && num != null){
                    doCalculations();
                    operator = getString(R.string.Divide);
                }else if(operator == getString(R.string.Divide)){
                    break;
                }else if(num1 == null && num != null){
                    operator = getString(R.string.Divide);
                } else {
                    num = num1;
                    num1 = null;
                    operator = getString(R.string.Divide);
                }
                break;

            case R.id.btnAdd:
                if(num1 != null && num != null){
                    doCalculations();
                    operator = getString(R.string.Plus);
                }else if(operator == getString(R.string.Plus)){
                    break;
                }else if(num1 == null && num != null){
                    operator = getString(R.string.Plus);
                } else {
                    num = num1;
                    num1 = null;
                    operator = getString(R.string.Plus);
                }
                break;
            case R.id.btnMultiply:
                if(num1 != null && num != null){
                    doCalculations();
                    operator = getString(R.string.Multiply);
                }else if(operator == getString(R.string.Multiply)){
                    break;
                }else if(num1 == null && num != null){
                    operator = getString(R.string.Multiply);
                } else {
                    num = num1;
                    num1 = null;
                    operator = getString(R.string.Multiply);
                }
                break;
            case R.id.btnMinus:
                if(num1 != null && num != null){
                    doCalculations();
                    operator = getString(R.string.Minus);
                }else if(operator == getString(R.string.Minus)){
                    break;
                }else if(num1 == null && num != null){
                    operator = getString(R.string.Minus);
                } else {
                    num = num1;
                    num1 = null;
                    operator = getString(R.string.Minus);
                }
                break;
            case R.id.btnEquals:
                if(num == null || num1 == null)
                    break;
                doCalculations();
                break;
            default:
                break;
        }
    }

    public void doCalculations(){

        if(operator == getString(R.string.Divide)){
            num1 = String.valueOf(Double.parseDouble(num) / Double.parseDouble(tvDisplay.getText().toString()));
            tvDisplay.setText(num1.toString());
            num = num1;
            num1 = null;
        } else if(operator == getString(R.string.Plus)){
            num1 = String.valueOf(Double.parseDouble(num) + Double.parseDouble(tvDisplay.getText().toString()));
            tvDisplay.setText(num1.toString());
            num = num1;
            num1 = null;
        } else if(operator == getString(R.string.Minus)){
            num1 = String.valueOf(Double.parseDouble(num) - Double.parseDouble(tvDisplay.getText().toString()));
            tvDisplay.setText(num1.toString());
            num = num1;
            num1 = null;
        }else if(operator == getString(R.string.Multiply)){
            num1 = String.valueOf(Double.parseDouble(num) * Double.parseDouble(tvDisplay.getText().toString()));
            tvDisplay.setText(num1.toString());
            num = num1;
            num1 = null;
        }
    }
}
