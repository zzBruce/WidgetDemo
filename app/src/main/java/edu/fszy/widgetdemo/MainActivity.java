package edu.fszy.widgetdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void MyOnClick(View view){
        switch (view.getId()){
            default:break;
            case R.id.button_layout_main_textviewdemo:
                startActivity(new Intent(MainActivity.this, TextViewAndEditTextDemo.class));
                break;
            case R.id.button_layout_main_buttondemo:
                startActivity(new Intent(MainActivity.this, ButtonDemo.class));
                break;
            case R.id.button_layout_main_radiobuttondemo:
                startActivity(new Intent(MainActivity.this, RadioButtonAndCheckBoxDemo.class));
                break;
            case R.id.button_layout_main_imageviewdemo:
                startActivity(new Intent(MainActivity.this, ImageViewDemo.class));
                break;
            case R.id.button_layout_main_spinnerdemo:
                startActivity(new Intent(MainActivity.this, SpinnerDemo.class));
                break;
        }
    }
}
