package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class Beast extends Hero {


    public Beast() {
        super();
    }


    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Beast";
    }

    @Override
    public String getIdentity() {
        return "Henry (Hank) P. McCoy";
    }

    @Override
    public String getAbilities() {
        return "Hank is considered one of the world's experts on mutations and evolutionary " +
                "Humans, human-biology. He has extensive knowledge of genetics, biochemistry, " +
                "and a variety of other scientific fields. Hank is also an accomplished keyboard " +
                "player.";
    }

    @Override
    public String getHeight() { return "5ft 11in"; }

    @Override
    public String getWeight() { return "402 lbs"; }

    @Override
    public String getPowers() {return
            "The Beast possesses superhuman strength, agility, endurance, and speed, despite his " +
            "bulk. He possesses the agility of a great ape and the acrobatic prowess of an " +
             "accomplished circus aerialist. His physiology is durable enough to allow " +
                    "him to survive a three story fall by landing on his feet without suffering" +
                    " any broken bones or sprains. The Beast's legs are powerful enough to enable" +
                    " him to leap approximately 15 feet high in a standing high jump, and " +
                    "around 25 feet in a standing broad jump.He can also run on all fours " +
                    "at approximately 40 miles per hour for short sprints.The Beast can crawl " +
                    "up brick walls by wedging his fingers and toes into the smallest cracks " +
                    "and applying a vice-like grip on them, as well as walk a tightrope with " +
                    "minimal effort. He is adept in performing complicated sequences of gymnastics " +
                    "such as flips, rolls, and springs, and can also walk on his hands for many " +
                    "hours. Further, his manual and pedial dexterity are so great that he can" +
                    "perform multiple tasks such as writing with both hands at once or tie knots " +
                    "in rope with his toes.The Beast possesses enhanced senses, the ability " +
                    "to secrete pheromones to attract members of the opposite sex, as well as " +
                    "a slight healing factor that allows him to regenerate minor wounds and " +
                    "recover quickly from minor ailments such as colds. The Beast also possesses " +
                    "cat-like night vision as well as razor-sharp claws on his hands and feet.";
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public String getGroup() {
        return "Secret Avengers; formerly S.W.O.R.D., X-Club, X-Men, X-Factor/X-Terminators, " +
                "Defenders, Avengers, Rejects";
    }

    @Override
    public String getOrigin() {
        return "X-Men #49-53 (1968-1969)";
    }


}
