package com.example.mdfarukhossain.inheritence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 class MainActivity extends AppCompatActivity { // default abstraction

    Button single;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        single = (Button) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView1);
        single.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                B obj = new B();

                tv.setText(obj.display());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

class A
{
    protected String str_A = "Hello ";
}

class B extends A // Inheitence
{
    String str_B = str_A.concat("Android !!!");

    String display()
    {
        return str_B;
    }

    }

