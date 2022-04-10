package com.example.dbdastrology;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;
import java.util.HashMap;

public class PerkSelectOneActivity extends AppCompatActivity {
    ImageView imgBackCard;
    Button backBtn;
    TextView perkDesc;
    String mapDesc;
    TextView perkCategory;
    String perkCategoryStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_one);

        //인텐트값을 받아보자
        Intent myIntent2 = getIntent();
        String clockState = myIntent2.getStringExtra("onClick");

        // perkArrayList / zombieAlive : 전역변수 > 편하게 쓰려고
        ArrayList perkList = ((ZombleAlive)getApplication()).getPerks();
        HashMap<String, String> maps = ((ZombleAlive)getApplication()).getPerksMap();

        imgBackCard = findViewById(R.id.imgBackCard);
        perkDesc = findViewById(R.id.perkDesc);
        perkCategory = findViewById(R.id.perkCategory);

        String resName;


        // ArrayList > perk 이름을 뽑아서 이미지뷰에 적용 : resID
        if(clockState.equals("onClick3h")) {
            resName = "@drawable/perks_" + perkList.get(0);
            ((ZombleAlive)getApplication()).state3h = "@drawable/perks_" + perkList.get(0);
            mapDesc = maps.get(perkList.get(0)+"_desc");
            perkCategoryStr = maps.get(perkList.get(0)+"_category");
            ((ZombleAlive)getApplication()).cate3h =  perkCategoryStr;
        } else if(clockState.equals("onClick6h")){
            resName = "@drawable/perks_" + perkList.get(1);
            ((ZombleAlive)getApplication()).state6h = "@drawable/perks_" + perkList.get(1);
            mapDesc = maps.get(perkList.get(1)+"_desc");
            perkCategoryStr = maps.get(perkList.get(1)+"_category");
            ((ZombleAlive)getApplication()).cate6h =  perkCategoryStr;
        } else if(clockState.equals("onClick9h")){
            resName = "@drawable/perks_" + perkList.get(2);
            ((ZombleAlive)getApplication()).state9h = "@drawable/perks_" + perkList.get(2);
            mapDesc = maps.get(perkList.get(2)+"_desc");
            perkCategoryStr = maps.get(perkList.get(2)+"_category");
            ((ZombleAlive)getApplication()).cate9h =  perkCategoryStr;
        } else if(clockState.equals("onClick12h")){
            resName = "@drawable/perks_" + perkList.get(3);
            ((ZombleAlive)getApplication()).state12h = "@drawable/perks_" + perkList.get(3);
            mapDesc = maps.get(perkList.get(3)+"_desc");
            perkCategoryStr = maps.get(perkList.get(3)+"_category");
            ((ZombleAlive)getApplication()).cate12h =  perkCategoryStr;
        } else {
            resName =   "@drawable/perks_touch_to_open";
        }
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
                perkDesc.setText(mapDesc);
                perkCategory.setText(perkCategoryStr);
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