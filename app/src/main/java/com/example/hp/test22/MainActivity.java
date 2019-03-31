package com.example.hp.test22;

import android.graphics.Paint;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    Intent a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);    //找到layout中对应的button
        button1.setOnClickListener(new ButtonListener()); //使用setOnClickListener()方法对各个按钮进行绑定

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new ButtonListener());

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new ButtonListener());
    }
    private class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button1:
                    a=new Intent(MainActivity.this,layout1Activity.class);
                    startActivity(a);
                    break;
                case R.id.button2:
                    b=new Intent(MainActivity.this,layout2Activity.class);
                    startActivity(b);
                    break;
                case R.id.button3:
                    c=new Intent(MainActivity.this,layout3Activity.class);
                    startActivity(c);
                    break;
                default:
                    break;
            }
        }
    }
}
