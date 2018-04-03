package com.example.bonus.shah;

import android.content.res.Resources;
import android.media.Image;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    boolean img = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClicker(View view) {
        if(!img) {
            view.setTag(R.drawable.p1);
            int drawableId = (Integer) view.getTag();
            img=true;
            view.setVisibility(View.GONE);
        }
        else if(img){
            Resources resources = getResources();
            view.setImageDrawable(getResorses().(R.drawable.clonch));
            img = false;
        }

    }

}
