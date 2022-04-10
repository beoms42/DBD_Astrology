package com.example.dbdastrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ImageView onClick3h;
    ImageView onClick6h;
    ImageView onClick9h;
    ImageView onClick12h;

    ImageView perk3h;
    ImageView perk6h;
    ImageView perk9h;
    ImageView perk12h;

    TextView cate_3h;
    TextView cate_6h;
    TextView cate_9h;
    TextView cate_12h;

    Button resultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intent를 쓸 버튼튼
       resultBtn = findViewById(R.id.resultButton);

        // 클릭 가능한 4가지 방향
        onClick3h = findViewById(R.id.onclick_3h);
        onClick6h = findViewById(R.id.onclick_6h);
        onClick9h = findViewById(R.id.onclick_9h);
        onClick12h = findViewById(R.id.onclick_12h);

        // 실제 표시되는 이미지뷰 4방향
        perk3h = findViewById(R.id.perk_3h);
        perk6h = findViewById(R.id.perk_6h);
        perk9h = findViewById(R.id.perk_9h);
        perk12h = findViewById(R.id.perk_12h);

        // 카테고리 표시 4개
        cate_3h = findViewById(R.id.cate_3h);
        cate_6h = findViewById(R.id.cate_6h);
        cate_9h = findViewById(R.id.cate_9h);
        cate_12h = findViewById(R.id.cate_12h);

        // 전역변수영역
        // 사진용 hashmap > resName + 시간
        String resName3h;
        String resName6h;
        String resName9h;
        String resName12h;


        if(((ZombleAlive)getApplication()).state3h.equals("")) {
            resName3h = "@drawable/perks_touch_to_open";
        } else {
            //사진과 카테고리를 전역액티비티에서 받아서 입력
            resName3h = ((ZombleAlive)getApplication()).state3h;
            cate_3h.setText(((ZombleAlive)getApplication()).cate3h);
        }

        if(((ZombleAlive)getApplication()).state6h.equals("")) {
            resName6h = "@drawable/perks_touch_to_open";
        } else {
            resName6h = ((ZombleAlive)getApplication()).state6h;
            cate_6h.setText(((ZombleAlive)getApplication()).cate6h);
        }

        if(((ZombleAlive)getApplication()).state9h.equals("")) {
            resName9h = "@drawable/perks_touch_to_open";
        } else {
            resName9h = ((ZombleAlive)getApplication()).state9h;
            cate_9h.setText(((ZombleAlive)getApplication()).cate9h);
        }

        if(((ZombleAlive)getApplication()).state12h.equals("")) {
            resName12h = "@drawable/perks_touch_to_open";
        } else {
            resName12h = ((ZombleAlive)getApplication()).state12h;
            cate_12h.setText(((ZombleAlive)getApplication()).cate12h);
        }

        // 셋이미지 인트
        String packName = this.getPackageName(); // 패키지명
        int resID3h = getResources().getIdentifier(resName3h, "drawable", packName);
        int resID6h = getResources().getIdentifier(resName6h, "drawable", packName);
        int resID9h = getResources().getIdentifier(resName9h, "drawable", packName);
        int resID12h = getResources().getIdentifier(resName12h, "drawable", packName);

        perk3h.setImageResource(resID3h);
        perk6h.setImageResource(resID6h);
        perk9h.setImageResource(resID9h);
        perk12h.setImageResource(resID12h);

        onClick3h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), PerkSelectOneActivity.class);
                myIntent.putExtra("onClick", "onClick3h");
                startActivity(myIntent);
                finish();
            }
        });

        onClick6h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), PerkSelectOneActivity.class);
                myIntent.putExtra("onClick", "onClick6h");
                startActivity(myIntent);
                finish();
            }
        });

        onClick9h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), PerkSelectOneActivity.class);
                myIntent.putExtra("onClick", "onClick9h");
                startActivity(myIntent);
                finish();
            }
        });

        onClick12h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), PerkSelectOneActivity.class);
                myIntent.putExtra("onClick", "onClick12h");
                startActivity(myIntent);
                finish();
            }
        });

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(), PerkResult.class);
                startActivity(myIntent);
                finish();
            }
        });
    }


}