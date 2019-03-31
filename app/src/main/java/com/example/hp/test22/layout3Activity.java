package com.example.hp.test22;

/**
 * Created by hp on 2019/3/31.
 */
import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;

public class layout3Activity extends Activity{
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);    //这个Activity所引用的是layout1.xml

    }
}
