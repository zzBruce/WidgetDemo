package edu.fszy.widgetdemo;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyOnClickListener implements View.OnClickListener {

    private Context mContext;

    public MyOnClickListener(@NonNull Context context){
        mContext = context;
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            default:break;
            case R.id.button_layout_buttondemo_roundbtn:
                Button roundbtn = (Button)view;
                Toast.makeText(mContext, roundbtn.getText(), Toast.LENGTH_LONG).show();
                break;
        }
    }
}
