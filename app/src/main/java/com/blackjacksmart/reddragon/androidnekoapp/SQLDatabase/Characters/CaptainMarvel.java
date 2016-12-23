package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class CaptainMarvel extends Hero {

    public CaptainMarvel() {
    }

    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Captain Marvel";
    }

    @Override
    public String getIdentity() {
        return "Carol Danvers";
    }

    @Override
    public String getAbilities() {
        return "Ms. Marvel is a skilled pilot and hand to hand combatant";
    }

    @Override
    public String getHeight() { return "5ft 11in"; }

    @Override
    public String getWeight() { return "165 lbs"; }

    @Override
    public String getPowers() {
        return "Ms. Marvel's current powers include flight, enhanced strength, durability and " +
                "the ability to shoot concussive energy bursts from her hands.";
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public String getGroup() {
        return "Avengers; formerly Queen's Vengeance, Starjammers";
    }

    @Override
    public String getOrigin() { return "Marvel Super Heroes #18, Ms. Marvel #1(2006)"; }
}
