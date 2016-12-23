package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class CaptainAmerica extends Hero {
    public CaptainAmerica() {
    }

    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Captain America";
    }

    @Override
    public String getIdentity() {
        return "Steven Rogers";
    }

    @Override
    public String getAbilities() {
        return "Captain America had mastered the martial arts of American-style boxing and judo, " +
                "and had combined" + " these disciplines with his own unique hand-to-hand style " +
                "of combat. He had also shown skill and knowledge of a number of other martial " +
                "arts. He engaged in a daily regimen of rigorous exercise (including aerobics," +
                " weight lifting, gymnastics, and simulated combat) to keep himself in peak " +
                "condition. Captain America was one of the finest human combatants Earth had " +
                "ever known";
    }

    @Override
    public String getHeight() { return "6ft 2in"; }

    @Override
    public String getWeight() { return "220 lbs"; }

    @Override
    public String getPowers() {
        return
                "Captain America represented the pinnacle of human physical perfection. He experienced a time " +
                "when he was augmented to superhuman levels, but generally performed just below superhuman levels" +
                " for most of his career. Captain America had a very high intelligence as well as agility, strength," +
                " speed, endurance, and reaction time superior to any Olympic athlete who ever competed. The Super-Soldier" +
                "formula that he had metabolized had enhanced all of his bodily functions to the peak of human efficiency." +
               " Most notably, his body eliminates the excessive build-up of fatigue-producing " +
                " poisons in his muscles, granting " + "him phenomenal endurance.";
    }

    @Override
    public String getSummary() {
        return "Vowing to serve his country any way he could, young Steve Rogers took the super " +
                "soldier serum to become America's one-man army. Fighting for the red, white and " +
                "blue for over 60 years, Captain America is the living, breathing symbol of freedom" +
                " and liberty.";
    }

    @Override
    public String getGroup() {
        return "Secret Avengers; formerly the Avengers, Invaders, Captain's Unnamed Superhero Team, " +
                "Redeemers; formerly partner of Winter Soldier,Bucky, Jones, Rick, Rick Jones, " +
                "Falcon (Sam Wilson), Falcon, Demolition Man and Nomad (Jack Monroe)";
    }

    @Override
    public String getOrigin() {
        return "Origin Captain America Comics #1 (1941); Tales of Suspense #63 (1965); Captain " +
                "America #109 (1969); Captain America #255 (1981); Adventures of Captain " +
                "America #1-2 (1991)";
    }
}
