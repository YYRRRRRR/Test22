# Test22
实验二
## 实验二
### 总页面布局
#####  界面布局代码
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.hp.test2.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    <Button
        android:id="@id/button1"
        android:text="LinearLayout布局演示"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />

    <Button
        android:id="@id/button2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="TableLayout布局演示"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="72dp" />

    <Button
        android:id="@id/button3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ConstraintLayout布局演示"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="154dp" />
</android.support.constraint.ConstraintLayout>
###### 逻辑代码
```
package com.example.hp.test2;

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
        setContentView(R.layout.activity_main);         //这个activity所引用的layout就是activity_main.xml
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

```

###### 这个主页面上设置了三个按钮，并依次创建了监听和活动，通过点击按钮可以分别跳转不同的界面,如点击LinearLayout,就可以跳转到LinearLayout布局页面里。
###### 总布局页面截图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190330153315441.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTQ2MDUz,size_16,color_FFFFFF,t_70)
#### LinearLayout布局 
##### 代码
```
button_style.xml
<?xml version="1.0" encoding="UTF-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">

    <!-- 边框颜色值 -->
    <item>
        <shape>
            <solid android:color="@android:color/white" />
        </shape>
    </item>
    <!-- 主体背景颜色值,控件间的间距 -->
    <item
        android:bottom="3dp"
        android:top="3dp"
        android:left="3dp"
        android:right="3dp">
        <shape>
            <solid android:color="@android:color/black" />
        </shape>
    </item>

</layer-list>

Layout1.xml代码
?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/line2"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    android:background="#000000"
    >

   <LinearLayout
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:orientation="vertical">
       <Button
           android:id="@+id/btn_oneone"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="One,One"
           android:background="@drawable/button_style"
           android:textColor="@android:color/white"
           android:layout_marginLeft="1dp"
           android:layout_marginRight="1dp"
           android:layout_weight="1"
           />
       <Button
           android:id="@+id/btn_twoone"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Two,One"
           android:background="@drawable/button_style"
           android:textColor="@android:color/white"
           android:layout_marginLeft="1dp"
           android:layout_marginRight="1dp"
           android:layout_weight="1"/>
       <Button
           android:id="@+id/btn_threeone"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:background="@drawable/button_style"
           android:textColor="@android:color/white"
           android:layout_marginLeft="1dp"
           android:layout_marginRight="1dp"
           android:layout_weight="1"
           android:text="Three,One"
           />
       <Button
           android:id="@+id/btn_fourone"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Four,One"
           android:background="@drawable/button_style"
           android:textColor="@android:color/white"
           android:layout_marginLeft="1dp"
           android:layout_marginRight="1dp"
           android:layout_weight="1"/>
   </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <Button
            android:id="@+id/btn_onetwo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Two"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_twotwo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Two"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"
            />
        <Button
            android:id="@+id/btn_threetwo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Two"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_fourtwo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Two"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <Button
            android:id="@+id/btn_onethree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Three"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_twothree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Three"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_threethree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Three"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_fourthree"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Three"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <Button
            android:id="@+id/btn_onetfour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Four"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_twofour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Four"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_threefour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Four"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
        <Button
            android:id="@+id/btn_fourfour"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Four"
            android:background="@drawable/button_style"
            android:textColor="@android:color/white"
            android:layout_marginLeft="1dp"
            android:layout_marginRight="1dp"
            android:layout_weight="1"/>
    </LinearLayout>
    </LinearLayout>
```
###### LinearLayout布局截图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190330152810909.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTQ2MDUz,size_16,color_FFFFFF,t_70)
#### TableLayout布局代码
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:background="#000000"
    android:stretchColumns="1">

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="2dip"
            android:text="Open"
            android:textColor="#FFFFFF" />

        <TextView
            android:gravity="right"
            android:padding="2dip"
            android:text="Ctrl-O"
            android:textColor="#FFFFFF" />
    </TableRow>

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="2dip"
            android:text="Save"
            android:textColor="#FFFFFF" />

        <TextView
            android:gravity="right"
            android:padding="2dip"
            android:text="Ctrl-S"
            android:textColor="#FFFFFF" />
    </TableRow>

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="2dip"
            android:text="Save As..."
            android:textColor="#FFFFFF" />

        <TextView
            android:gravity="right"
            android:padding="2dip"
            android:text="Ctrl-Shift-S"
            android:textColor="#FFFFFF" />
    </TableRow>

    <View
        android:layout_height="2dip"
        android:background="#FF909090" />

    <TableRow>

        <TextView
            android:padding="2dip"
            android:text="X"
            android:textColor="#FFFFFF" />

        <TextView
            android:padding="2dip"
            android:text="Import..."
            android:textColor="#FFFFFF" />
    </TableRow>

    <TableRow>

        <TextView
            android:padding="2dip"
            android:text="X"
            android:textColor="#FFFFFF" />

        <TextView
            android:padding="2dip"
            android:text="Export..."
            android:textColor="#FFFFFF" />

        <TextView
            android:gravity="right"
            android:padding="2dip"
            android:text="Ctrl-E"
            android:textColor="#FFFFFF" />
    </TableRow>

    <View
        android:layout_height="2dip"
        android:background="#FF909090" />

    <TableRow>

        <TextView
            android:layout_column="1"
            android:padding="2dip"
            android:text="Quit"
            android:textColor="#FFFFFF" />
    </TableRow>
</TableLayout>

```
###### LinearLayout布局截图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190331131556957.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTQ2MDUz,size_16,color_FFFFFF,t_70)

#### ConstraintLayout 布局
###### 直接对按钮进行拖拽，对方框大小，以及颜色进行调整。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190320001414245.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwOTQ2MDUz,size_16,color_FFFFFF,t_70)
