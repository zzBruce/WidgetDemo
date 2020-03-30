package edu.fszy.widgetdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonAndCheckBoxDemo extends Activity {
    RadioButton rbtn_r1_male;
    RadioButton rbtn_r1_female;
    RadioGroup rgrp_r1;
    RadioGroup rgrp_r2;
    RadioButton rbtn_r2_male;
    RadioButton rbtn_r2_female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_radiobuttonandcheckboxdemo);
        set_r1();
        set_r2();
    }

    /*
    * 此函数设置RadioGruop内的radiobutton逻辑。点击单选男女按钮。
    * */
    protected void set_r2(){
        //从layout文件中获取组件。
        rgrp_r2 = findViewById(R.id.rgrp2_layout_radiobuttonandcheckbox);
        rbtn_r2_male = findViewById(R.id.rbtnmale_rgrp2_layout_radiobuttonandcheckbox);
        rbtn_r2_female = findViewById(R.id.rbtnfemale_rgrp2_layout_radiobuttonandcheckbox);
        rgrp_r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //如果点击“男”按钮，将‘男’按钮设置为true，女按钮为false。反之亦然。
                if(checkedId == R.id.rbtnfemale_rgrp2_layout_radiobuttonandcheckbox){
                    rbtn_r2_male.setChecked(false);
                    rbtn_r2_female.setChecked(true);
                }else if(checkedId == R.id.rbtnmale_rgrp2_layout_radiobuttonandcheckbox){
                    rbtn_r2_male.setChecked(true);
                    rbtn_r2_female.setChecked(false);
                }
            }
        });
    }

    /*
     * 此函数设置RadioGruop内的radiobutton逻辑。点击单选男女按钮。
     * */
    protected void set_r1(){
        //从layout文件中获取组件。
        rgrp_r1 = findViewById(R.id.rgrp1_layout_radiobuttonandcheckbox);
        rbtn_r1_male = findViewById(R.id.rbtnmale_rgrp1_layout_radiobuttonandcheckbox);
        rbtn_r1_female = findViewById(R.id.rbtnfemale_rgrp1_layout_radiobuttonandcheckbox);
        rgrp_r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //如果点击“男”按钮，将‘男’按钮设置为true，女按钮为false。反之亦然。
                if(checkedId == R.id.rbtnfemale_rgrp1_layout_radiobuttonandcheckbox){
                    rbtn_r1_male.setChecked(false);
                    rbtn_r1_female.setChecked(true);
                }else if(checkedId == R.id.rbtnmale_rgrp1_layout_radiobuttonandcheckbox){
                    rbtn_r1_male.setChecked(true);
                    rbtn_r1_female.setChecked(false);
                }
            }
        });
    }
}
