package com.example.dbdastrology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;

public class PerkSelectOneActivity extends AppCompatActivity {
    ImageView imgBackCard;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_one);

        // perkArrayList
        // perkArrayList / zombieAlive : 전역변수 > 편하게 쓰려고
        ArrayList perkList = ((ZombleAlive)getApplication()).getPerks();
        imgBackCard = findViewById(R.id.imgBackCard);

        // ArrayList > perk 이름을 뽑아서 이미지뷰에 적용 : resID
        String resName = "@drawable/perks_" + perkList.get(0);
        String packName = this.getPackageName(); // 패키지명
        int resID = getResources().getIdentifier(resName, "drawable", packName);
        imgBackCard.setImageResource(resID);

        // GIF를 SRC로  : GLIDE 사용
        ImageView gif = (ImageView) findViewById(R.id.gif_fire_view);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(gif);
        Glide.with(this).load(R.drawable.background_perksogae).into(gifImage);

        //플립뷰
        final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        easyFlipView.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);

        backBtn = findViewById(R.id.back_btn);


        findViewById(R.id.imgFrontCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                easyFlipView.flipTheView();
            }
        });

        findViewById(R.id.imgBackCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                easyFlipView.flipTheView();
            }
        });

        easyFlipView.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView easyFlipView, EasyFlipView.FlipState newCurrentSide) {

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        });

    }

}