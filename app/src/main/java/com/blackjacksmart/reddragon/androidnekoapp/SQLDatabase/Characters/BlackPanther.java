package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class BlackPanther extends Hero {
    public BlackPanther() {
        super();
    }
    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Black Panther";
    }

    @Override
    public String getIdentity() {
        return "T Challa";
    }

    @Override
    public String getAbilities() {
        return "T'Challa is a brilliant tactician, strategist, scientist, tracker and a master of " +
                "all forms of unarmed combat whose unique hybrid fighting style incorporates " +
                "acrobatics and aspects of animal mimicry. T'Challa being a royal descendent of " +
                "a warrior race is also a master of armed combat, able to use a variety of " +
                "weapons but prefers unarmed combat. He is a master planner who always thinks " +
                "several steps ahead and will go to extreme measures to achieve his goals and " +
                "protect the kingdom of Wakanda.";
    }

    @Override
    public String getHeight() { return "6ft 0in"; }

    @Override
    public String getWeight() { return "200 lbs"; }

    @Override
    public String getPowers() {
        return
            "T Challa's senses and physical attributes have been enhanced to superhuman levels " +
            "by the heart-shaped herb.";
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public String getGroup() {
        return "Formerly Fantastic Four, Secret Avengers, Avengers, Pendragons, Queen's Vengeance," +
                " former Fantastic Force financier.";
    }

    @Override
    public String getOrigin() {
        return "Fantastic Four Vol. 1 #52 (1966)";
    }
}
