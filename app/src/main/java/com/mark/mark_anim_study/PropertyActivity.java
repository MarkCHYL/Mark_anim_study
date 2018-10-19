package com.mark.mark_anim_study;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/*
 * 属性动画
 * @Date : 2018/10/18
 */
public class PropertyActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);

        img = findViewById(R.id.img);
    }

    public void doAnim1(View view) {
        Animator rotationYAnimator = AnimatorInflater.loadAnimator(getApplicationContext(),
                R.animator.property_animator);
        rotationYAnimator.setTarget(img);

        Animator alphaAnimator = ObjectAnimator.ofFloat(img, "alpha", 1f, 0.3f)
                .setDuration(2000);

        Animator scaleXAnimator = ObjectAnimator.ofFloat(img, "scaleX", 1, 0.5f);
        scaleXAnimator.setDuration(2000);

        Animator scaleYAnimator = ObjectAnimator.ofFloat(img, "scaleY", 1, 0.5f);
        scaleYAnimator.setDuration(2000);


        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(scaleXAnimator)
                .with(scaleYAnimator)
                .with(alphaAnimator)
                .with(rotationYAnimator);
        animatorSet.start();

    }

    public void doTest(View view) {
        startActivity(new Intent(this,TestActivity.class));
    }
}
