package com.example.dbdastrology;

import java.util.ArrayList;
import java.util.Collections;

public class PerkArrayList {

    ArrayList<String> perkList = new ArrayList<String>();

    public ArrayList<String> getPerkList() {

        perkList.add("agitation");
        perkList.add("bond");
        perkList.add("empathy");
        perkList.add("nursecalling");

        perkList.add("smallgame");
        perkList.add("sprintburst");
        perkList.add("tinkerer");
        perkList.add("urbanevasion");

        //퍽 리스트 섞기
        Collections.shuffle(perkList);

        return perkList;
    }



}
