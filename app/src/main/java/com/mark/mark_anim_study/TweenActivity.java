package com.mark.mark_anim_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/*
 * 补间动画
 * @Date : 2018/10/17
 */
public class TweenActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        //步骤1:创建 需要设置动画的 视图View
        img = findViewById(R.id.img);
    }

    /*
     * 平移
     * @Date : 2018/10/17
     */
    public void doTranslate(View view) {
        //在XML 代码中设置
        //步骤2:创建 动画对象 并传入设置的动画效果xml文件
        Animation animation = createAnimation(R.anim.translate_anim);
        //步骤3:播放动画
        img.startAnimation(animation);
    }

    /*
     * 旋转
     * @Date : 2018/10/17
     */
    public void doScale(View view) {
        //步骤2:创建 动画对象 并传入设置的动画效果xml文件
        Animation animation = createAnimation(R.anim.scale_anim);
        //步骤3:播放动画
        img.startAnimation(animation);
    }

    /*
     * 旋转动画
     * @Date : 2018/10/17
     */
    public void doRotate(View view) {
        //步骤2:创建 动画对象 并传入设置的动画效果xml文件
        Animation animation = createAnimation(R.anim.rotate_anim);
        //步骤3:播放动画
        img.startAnimation(animation);
    }

    /*
    * 透明度
    * @Date : 2018/10/17
    */
    public void doAlpha(View view) {
        //步骤2:创建 动画对象 并传入设置的动画效果xml文件
        Animation animation = createAnimation(R.anim.alpha_anim);
        //步骤3:播放动画
        img.startAnimation(animation);
    }

    /*
     * 组合动画
     * @Date : 2018/10/17
     */
    public void doAllAnim(View view) {
        //步骤2:创建 动画对象 并传入设置的动画效果xml文件
        Animation animation = createAnimation(R.anim.scale_rotate_translate_alpha);
        if (animation != null) {
            animation.setRepeatMode(Animation.RESTART);
            animation.setRepeatCount(3);
        }
        //步骤3:播放动画
        img.startAnimation(animation);
    }

    /*
     * 返回相应的动画对象
     * @Date : 2018/10/17
     */
    private Animation createAnimation(int id_anim) {
        Animation animation = AnimationUtils.loadAnimation(this, id_anim);
        animation.setDuration(5000);
        animation.setFillAfter(true); // 动画播放完后，视图是否会停留在动画结束的状态，优先于fillBefore值，默认为false
        animation.setFillBefore(false);// 动画播放完后，视图是否会停留在动画开始的状态，默认为true
        animation.setFillEnabled(true); // 是否应用fillBefore值，对fillAfter值无影响，默认为true
        animation.setRepeatMode(Animation.RESTART);// 选择重复播放动画模式，restart代表正序重放，reverse代表倒序回放，默认为restart|
        animation.setRepeatCount(4);// 重放次数（所以动画的播放次数=重放次数+1），为infinite时无限重复
        animation.setInterpolator(this, android.R.anim.accelerate_decelerate_interpolator);//// 插值器，即影响动画的播放速度,下面会详细讲
        animation.setStartOffset(1000);// 动画延迟开始时间（ms）
        switch (id_anim) {
            case R.anim.translate_anim:
                return animation;
            case R.anim.scale_anim:
                return animation;
            case R.anim.rotate_anim:
                return animation;
            case R.anim.alpha_anim:
                return animation;
            case R.anim.scale_rotate_translate_alpha:
                return animation;
        }
        return null;
    }
}
