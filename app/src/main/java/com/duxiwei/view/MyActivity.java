package com.duxiwei.view;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.duxiwei.view.R.drawable.liqing;

public class MyActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    ImageView img;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        img = findViewById(R.id.img);
//        img.setImageResource(R.drawable.liqing);
        img.setImageResource(R.drawable.loading);
        btn.setOnClickListener((e) -> {

//            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.set);
            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanimtranslate);
//            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanimrotate);
//            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanim);
//            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanimalpha);
//            Animation animation = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanimalpha2);
            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    Log.e("duxiwei","onAnimationStart");
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    Log.e("duxiwei","onAnimationEnd");
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    Log.e("duxiwei","onAnimationRepeat");
                }
            });
//            animation.setInterpolator(new AnticipateInterpolator());
//            animation.setInterpolator(new AnticipateOvershootInterpolator());
//            animation.setInterpolator(new OvershootInterpolator());
//            animation.setInterpolator(new CycleInterpolator(1));
//            tv.startAnimation(animation);
//            animation();
            animationLoading();
        });

    }

    void animation(){
//        AlphaAnimation animation = new AlphaAnimation(1.0f,0.1f);
        RotateAnimation animation = new RotateAnimation(0f,1080f);
        animation.setDuration(3000);
        animation.setFillBefore(true);
        tv.startAnimation(animation);
        ScaleAnimation scaleAnim = new ScaleAnimation(1.0f,1.2f,1.0f,1.2f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnim.setFillAfter(true);
        scaleAnim.setInterpolator(new BounceInterpolator());
        scaleAnim.setDuration(6000);
        img.startAnimation(scaleAnim);

    }
    void animationLoading(){
        RotateAnimation rotateAnimation = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        img.startAnimation(rotateAnimation);
    }
}
