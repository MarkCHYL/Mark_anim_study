package com.mark.mark_anim_study;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/*
* 帧动画
* @Date : 2018/10/18
*/
public class FrameActivity extends AppCompatActivity {

    private ImageView img;
    private AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        img = findViewById(R.id.img);

        doMethod();

    }

    private void doMethod() {
        //方法一
//        img.setBackgroundResource(R.drawable.frame_anim);
//        animationDrawable = (AnimationDrawable) img.getBackground();
        //方法二
        animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.frame_anim);
        img.setBackground(animationDrawable);
    }

    /*
    * 开始
    * @Date : 2018/10/18
    */
    public void doStart(View view) {
        if (animationDrawable!=null && !animationDrawable.isRunning()){
            animationDrawable.start();
        }

    }

    /*
    * 结束
    * @Date : 2018/10/18
    */
    public void doStop(View view) {
        if (animationDrawable!=null && animationDrawable.isRunning()){
            animationDrawable.stop();
        }
    }
}
