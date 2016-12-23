package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Hero;

/**
 * Created by RedDragon on 12/22/16.
 */

public class Cyclops extends Hero {
    public Cyclops() {
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
        return "Scott Summers";
    }

    @Override
    public String getAbilities() {
        return "Cyclops possesses several skills. Among them are:* Master Strategist and " +
                "Tactician* Master Martial Artist* Expert Pilot* Telepathic" +
                " Resistance";
    }

    @Override
    public String getHeight() { return "6ft 3in"; }

    @Override
    public String getWeight() { return "195 lbs"; }

    @Override
    public String getPowers() {
        return "Cyclops possesses the mutant ability to project a beam of heatless ruby-colored " +
                "concussive force from his eyes, which act as inter-dimensional aperturesbetween " +
                "this universe and another. Cyclops body constantly absorbs ambient energy, such " +
                "as sunlight, from his environment into his body's cells that allows him to open " +
                "the apertures. Cyclops' mind generates a psionic field that is attuned to the " +
                "forces that maintain the apertures. Because this field envelops his body, it " +
                "automatically shunts the other-dimensional particles back into their point of " +
                "origin when they collide with his body. Thus, his body is protected from the " +
                "effects of the particles, and even the thin membranes of his eyelids are " +
                "sufficient to block the emission of energy. The synthetic ruby quartz crystal " +
                "used to fashion the lenses of Cyclops' eyewear is resonant to his minds' psionic" +
                " field and is similarly protected.The width of Cyclops' optic blast is focused by " +
                "his mind's psionic field with the same autonomic function that regulated his " +
                "original eyes' ability to focus. As Cyclops focuses, the size of the apertures " +
                "change and thus act as a valve to control the flow of particles and the beam's " +
                "relative power. The height of Cyclops's eye-blast is controlled by his visor's " +
                "adjustable slit. The beam's effective range is approximately 2,000 feet.Due to " +
                "a head injury, Cyclops is unable to shut off his optic blasts at will and must " +
                "therefore wear ruby quartz lenses to block the beams.";
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public String getGroup() {
        return "X-Men, formerly Twelve, X-Factor, X-Factor/X-Terminators";
    }

    @Override
    public String getOrigin() {
        return "Uncanny X-Men #156 (1982), Classic X-Men #41-42 (1989), X-Men #39-42 (1967-1968)";
    }
}
