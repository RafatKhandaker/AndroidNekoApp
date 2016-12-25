package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class Storm extends Hero {
    public Storm() {
    }
    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "";
    }

    @Override
    public String getIdentity() {
        return "Ororo Monroe";
    }

    @Override
    public String getAbilities() {
        return "Weather Control";
    }

    @Override
    public String getHeight() { return "5ft 11in"; }

    @Override
    public String getWeight() { return "145 lbs"; }

    @Override
    public String getPowers() {
        return "Storm is one of the most powerful mutants on Earth and has demonstrated a plethora" +
                " of abilities, most of which are facets of her power to manipulate the weather." +
                "[84] Storm possesses the psionic ability to control all forms of weather over " +
                "vast areas. She has been able to control both Earthly and extraterrestrial " +
                "ecosystems. She can modify the temperature of the environment, control all " +
                "forms of precipitation, humidity and moisture (at a molecular level), generate" +
                " lightning and other electromagnetic atmospheric phenomena, and has demonstrated " +
                "excellent control over atmospheric pressure. She can incite all forms of " +
                "meteorological tempests, such as tornadoes, thunderstorms, blizzards, and " +
                "hurricanes, [85] as well as mist. She can dissipate such weather to form clear" +
                " skies as well.";
    }

    @Override
    public String getSummary() {
        return "Ororo Monroe is the descendant of an ancient line of African priestesses, " +
                "all of whom have white hair, blue eyes, and thepotential to wield magic.";
    }

    @Override
    public String getGroup() {
        return "Avengers[2], X-Men, Fantastic Four, Lady Liberators, Morlocks";
    }

    @Override
    public String getOrigin() {
        return "Giant-Size X-Men #1, May 197";
    }
}
