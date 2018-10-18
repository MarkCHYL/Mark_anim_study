package com.mark.mark_anim_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * 属性动画
    * @Date : 2018/10/17
    */
    public void doPropertyAnim(View view) {
        startActivity(new Intent(this,PropertyActivity.class));
    }

    /*
    * 补间动画
    * @Date : 2018/10/17
    */
    public void doTweenAnim(View view) {
        startActivity(new Intent(this,TweenActivity.class));
    }

    /*
    * 帧动画
    * @Date : 2018/10/17
    */
    public void doFrameAnim(View view) {
        startActivity(new Intent(this,FrameActivity.class));
    }
}
