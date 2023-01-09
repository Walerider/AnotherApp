package com.example.anotherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    *
    *
    *
    *
    *
    * Эта активити
    * для начальной анимации
    * лучше не редачить
    *
    *
    *
    *
    *
    *
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView CentTV = findViewById(R.id.textView);
        ViewPropertyAnimator LogoAnim = CentTV.animate();
        Intent intent = new Intent(this,MainActivity2.class);
        LogoAnim.setListener(new Animator.AnimatorListener() {
            @Override public void onAnimationStart(Animator animator) {}@Override public void onAnimationEnd(Animator animator) {startActivity(intent);}@Override public void onAnimationCancel(Animator animator) {}@Override public void onAnimationRepeat(Animator animator) {}
        });
        LogoAnim.alpha(0.99f).alpha(0.8f).setDuration(2000).getDuration();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}