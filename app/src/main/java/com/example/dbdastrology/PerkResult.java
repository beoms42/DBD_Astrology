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

public class PerkResult extends AppCompatActivity {
    ImageView perks_1;
    ImageView perks_2;
    ImageView perks_3;
    ImageView perks_4;

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        perks_1 = findViewById(R.id.perks_1);
        perks_2 = findViewById(R.id.perks_2);
        perks_3 = findViewById(R.id.perks_3);
        perks_4 = findViewById(R.id.perks_4);

        String packName = this.getPackageName(); // 패키지명
        int resID3h = getResources().getIdentifier(((ZombleAlive)getApplication()).state3h, "drawable", packName);
        int resID6h = getResources().getIdentifier(((ZombleAlive)getApplication()).state6h, "drawable", packName);
        int resID9h = getResources().getIdentifier(((ZombleAlive)getApplication()).state9h, "drawable", packName);
        int resID12h = getResources().getIdentifier(((ZombleAlive)getApplication()).state12h, "drawable", packName);

        perks_1.setImageResource(resID3h);
        perks_2.setImageResource(resID6h);
        perks_3.setImageResource(resID9h);
        perks_4.setImageResource(resID12h);

        resultView = findViewById(R.id.textResult2);

        String sql = "";
        int redCount = 0;
        int blueCount = 0;
        int purpleCount = 0;
        int greenCount = 0;

        HashMap<String, String> perkMap = ((ZombleAlive)getApplication()).getPerksMap();
        ArrayList<String> perkList = ((ZombleAlive)getApplication()).getPerks();

        for(int i = 0; i <= 3; i++) {
            String categoryPerk = perkMap.get(perkList.get(i).toString()+"_category_option");
            if(categoryPerk.equals("red")) {
                redCount++;
            }

            if(categoryPerk.equals("blue")) {
                blueCount++;
            }

            if(categoryPerk.equals("purple")) {
                purpleCount++;
            }

            if(categoryPerk.equals("green")) {
                greenCount++;
            }
        }


        if(blueCount >= 2 && redCount >= 2) {
            sql += "정말 평범한 날이 될거야.";
        } else if(blueCount >= 2)  {
            sql += "최고의 날이야. \n 오늘은 너의 날이 될거야";
        }else if(purpleCount >= 2)  {
            sql += "이상한 날이야. \n 너와 관계없는 일이 주변에 생길거야";
        } else if(redCount >= 2) {
            sql += "좋은일보다는 나쁜일이 많아. \n 등뒤를 조심해";
        } else  {
            sql += "정말 무난한 날이야.";
        }

        resultView.setText(sql);
    }

}