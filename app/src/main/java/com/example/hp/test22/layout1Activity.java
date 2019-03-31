package com.example.hp.test22;

/**
 * Created by hp on 2019/3/31.
 */
import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;

public class layout1Activity extends Activity{
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);    //这个Activity所引用的是layout1.xml

    }
}
