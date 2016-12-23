package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class IronMan extends Hero {
    public IronMan() {
    }
    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Iron Man";
    }

    @Override
    public String getIdentity() {
        return "Anthony Edward Tony Stark";
    }

    @Override
    public String getAbilities() {
        return "Tony has a genius level intellect that allows him to invent a wide range of sophisticated devices" +
        " ,specializing in advanced weapons and armor. He possesses a keen business mind.";
    }

    @Override
    public String getHeight() { return "6ft 1in; 6ft 6in (in armor"; }

    @Override
    public String getWeight() { return "225 lbs; 425 lbs (in armor)"; }

    @Override
    public String getPowers() {
        return "None; Tony's body had been enhanced by the modified techno-organic virus, Extremis, " +
                "but it is currently inaccessible and inoperable.";
    }

    @Override
    public String getSummary() {
        return
        "Wounded, captured and forced to build a weapon by his enemies, billionaire industrialist Tony Stark instead"+
        " created an advanced suit of armor to save his life and escape captivity. Now with a new outlook on life, Tony"+
        " uses his money and intelligence to make the world a safer, better place as Iron Man.";
    }

    @Override
    public String getGroup() {
        return "The Avengers, Initiative, Hellfire Club (outer circle), S.H.I.E.L.D., Illuminati,"+
                " Thunderbolts, Force Works, Queen's Vengeance, Alcoholics Anonymous";
    }

    @Override
    public String getOrigin() {
        return "Tales of Suspense #39 (1963)";
    }
}
