package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class SpiderMan extends Hero {
    public SpiderMan() {
    }

    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Spider Man";
    }

    @Override
    public String getIdentity() {
        return "Peter Benjamin Parker";
    }

    @Override
    public String getAbilities() {
        return "Peter is an accomplished scientist, inventor and photographer.";
    }

    @Override
    public String getHeight() { return "5ft 10in"; }

    @Override
    public String getWeight() { return "167 lbs"; }

    @Override
    public String getPowers() {
        return "Peter can cling to most surfaces, has superhuman strength (able to lift 10 tons " +
                "optimally) and is roughly 15 times more agile than a regular human. The " +
                "combination of his acrobatic leaps and web-slinging enables him to travel " +
                "rapidly from place to place. His spider-sense provides an early warning " +
                "detection system linked with his superhuman kinesthetics, enabling him the " +
                "ability to evade most any injury, provided he doesn't cognitively override the " +
                "autonomic reflexes. Note: his power enhancements through his transformation by " +
                "the Queen and after battling Morlun - including his organic web glands and " +
                "stingers - have been undone after Spider-Man's deal with Mephisto";
    }

    @Override
    public String getSummary() {

        return "Bitten by a radioactive spider, high school student Peter Parker gained the" +
                " speed, strength and powers of a spider. Adopting the name Spider-Man, Peter " +
                "hoped to start a career using his new abilities. Taught that with great power " +
                "comes great responsibility, Spidey has vowed to use his powers to help people.";
    }

    @Override
    public String getGroup() {
        return "Avengers, formerly the Secret Defenders, New Fantastic Four, the Outlaws.";
    }

    @Override
    public String getOrigin() {
        return "Amazing Fantasy #15 (1962)";
    }
}
