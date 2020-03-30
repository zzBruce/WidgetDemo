package edu.fszy.widgetdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonDemo extends Activity implements View.OnClickListener {
    private Button normalbtn;//普通按钮
    private Button roundbtn;//圆形按钮
    private Button picbtn;//带图形的按钮
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_buttondemo);
        mContext = this;
        //一共是4种设置onclicklistener，以下是三种，第四种在mainActivity的设置里。
        this.fun1_set_onclicklistener();
        this.fun2_set_onclicklistener();
        this.fun3_set_onclicklistener();
    }

    //第一种设置Button的onclicklistener的方法，自身类有此接口可以直接set this。
    protected void fun1_set_onclicklistener(){
        normalbtn = findViewById(R.id.button_layout_buttondemo_noramlbtn);
        normalbtn.setOnClickListener(this);
    }

    //第二种调用其他有此接口的类，需要new一个对象。
    protected void fun2_set_onclicklistener(){
        MyOnClickListener myOnClickListener = new MyOnClickListener(mContext);
        roundbtn = findViewById(R.id.button_layout_buttondemo_roundbtn);
        roundbtn.setOnClickListener(myOnClickListener);
    }

    //第三种是直接new一个onclicklistener。
    protected void fun3_set_onclicklistener(){
        picbtn = findViewById(R.id.button_layout_buttondemo_picbtn);
        picbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, picbtn.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View view){
        Toast.makeText(mContext, normalbtn.getText(), Toast.LENGTH_LONG).show();
    }
}
