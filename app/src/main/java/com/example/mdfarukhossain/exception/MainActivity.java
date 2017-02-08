package com.example.mdfarukhossain.exception;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.et1);
        etNum2 = (EditText) findViewById(R.id.et2);

        btnAdd = (Button) findViewById(R.id.bt1);
        btnSub = (Button) findViewById(R.id.bt2);
        btnMult = (Button) findViewById(R.id.bt3);
        btnDiv = (Button) findViewById(R.id.bt4);

        tvResult = (TextView) findViewById(R.id.tv);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;


        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());
        switch (v.getId()) {
            case R.id.bt1:
                result = num1 + num2;
                tvResult.setText("Result" + result);
                break;
            case R.id.bt2:
                result = num1 - num2;
                tvResult.setText("Result" + result);
                break;
            case R.id.bt3:
                result = num1 * num2;
                tvResult.setText("Result" + result);
                break;
            case R.id.bt4: try {
                //if (num2 == 0)
                 //   etNum2.setError("Can't use this ");
                result = num1 / num2;
                tvResult.setText("Result" + result);
                break;
            }
            catch (Exception e)
            {etNum2.setError("Can't use this ");} // Exception

            default:
                break;
        }
    }
}