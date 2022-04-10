package com.example.dbdastrology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PerkArrayList {

    ArrayList<String> perkList = new ArrayList<String>();
    HashMap<String, String> perkMap = new HashMap<String, String>();

    public ArrayList<String> getPerkList() {

        perkList.add("agitation");
        perkList.add("bond");
        perkList.add("empathy");

        perkList.add("smallgame");
        perkList.add("sprintburst");
        perkList.add("tinkerer");
        perkList.add("urbanevasion");

        //퍽 리스트 섞기
        Collections.shuffle(perkList);

        return perkList;
    }

    public HashMap<String, String> getPerkMap() {

        perkMap.put("agitation", "agitation");
        perkMap.put("agitation_desc", "누군가가 당신의 재물을 노리고있을 가능성이 크다. ");
        perkMap.put("agitation_category", "탐욕");

        perkMap.put("bond", "bond");
        perkMap.put("bond_desc", "새로운 인연이 생길수도.");
        perkMap.put("bond_category", "유대감");

        perkMap.put("empathy", "empathy");
        perkMap.put("empathy_desc", "누군가의 아픔에 공감하게 될것이다.");
        perkMap.put("empathy_category", "공감");

        perkMap.put("smallgame", "smallgame");
        perkMap.put("smallgame_desc", "오늘하루 경각심을 가지면 위험을 피해갈수 있을것이다.");
        perkMap.put("smallgame_category", "덫");

        perkMap.put("sprintburst", "sprintburst");
        perkMap.put("sprintburst_desc", "오늘 빠르게 달일 일이 생길것이다.");
        perkMap.put("sprintburst_category", "달리기");

        perkMap.put("tinkerer", "tinkerer");
        perkMap.put("tinkerer_desc", "공구 또는 도구를 쓸 일이 생길것이다.");
        perkMap.put("tinkerer_category", "공구");

        perkMap.put("urbanevasion", "urbanevasion");
        perkMap.put("urbanevasion_desc", "때로는 직면하는것보다 회피하는게 더 나은 방법일수도.");
        perkMap.put("urbanevasion_category", "회피");

        return perkMap;
    }

    public void setPerkMap(HashMap<String, String> mHash) {
        this.perkMap = mHash;
    }
}
