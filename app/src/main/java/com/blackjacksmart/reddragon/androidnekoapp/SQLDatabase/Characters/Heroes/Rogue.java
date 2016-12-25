package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class Rogue extends Hero {
    public Rogue() {
    }

    @Override
    public int getHeroId() {
        return super.getHeroId();
    }

    @Override
    public String getCharacter() {
        return "Rogue";
    }

    @Override
    public String getIdentity() { return "Anna Marie"; }

    @Override
    public String getAbilities() {
        return "Rogue could formerly draw upon the combat and espionage training of Carol Danvers " +
               "by granting control of her body to her alternate personality, a duplicate " +
               "of Danvers'. Rogue can also speak fluent French.";
    }

    @Override
    public String getHeight() { return "5ft 8in"; }

    @Override
    public String getWeight() { return "120 lbs"; }

    @Override
    public String getPowers() {
        return "Rogue is a mutant who formerly possessed the ability to absorb the memories," +
                " abilities, personality, and outward physical characteristics of other beings " +
                "through skin-to-skin contact. Such transfers lasted for 60 times longer than " +
                "the contact time, with extended contact resulting in the possibility of " +
                "permanent absorption. No upper limit had been determined for the number of" +
                " beings Rogue could simultaneously imprint.Upon absorbing another's memories," +
                " Rogue also gained any associated emotional responses. Rogue was typically able " +
                "to control such emotions, however absorbing psyches more powerful than her own " +
                "resulted in Rogue’s psyche being supplanted.After permanently absorbing the " +
                "powers of Ms. Marvel (Carol Danvers), Ms. Marvel, Rogue possessed an " +
                "amalgamated mutant human/alien Kree physiology that granted her a degree " +
                "of immunity to poisons, and a virtually indestructible body. Rogue also" +
                " possessed Ms. Marvel's above normal reflexes and psychic seventh sense" +
                " that enabled her to subconsciously anticipate an opponent’s moves. Whilst " +
                "Rogue possessed Ms. Marvel's psyche, her double consciousness made her resistant " +
                "to telepathic probes from even the most powerful mind readers. She also gained " +
                "Ms. Marvel's incredible strength, and supersonic flight.After absorbing the " +
                "powers of an alien Skrull, Rogue began to spontaneously reactivate previously" +
                " absorbed abilities. Rogue could also tap into the residual psychic energy" +
                " of those she had imprinted to determine their status and to relive past events" +
                " from their perspective.Recently, Rogue has seemingly permanently absorbed the " +
                "fire-based powers of Sunfire (Shiro Yoshida), Sunfire.";
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public String getGroup() {
        return "X-Men, formerly X.S.E, Brotherhood of Mutants, Brotherhood of Evil Mutants";
    }

    @Override
    public String getOrigin() {
        return "Rogue #2 (2004), Uncanny X-Men #185 (1984), Cable #87 (2001), Classic X-Men #44 (1990 origin)";
    }
}
