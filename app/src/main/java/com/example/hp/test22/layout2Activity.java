package com.example.hp.test22;

/**
 * Created by hp on 2019/3/31.
 */
import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;

public class layout2Activity extends Activity{
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);    //这个Activity所引用的是layout1.xml

    }
}
