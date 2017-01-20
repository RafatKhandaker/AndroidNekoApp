package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters;

/**
 * Created by RedDragon on 12/17/16.
 */

public class Hero {

    protected int id;
    private String character;
    private String identity;
    private String abilities;
    private String height;
    private String weight;
    private String powers;
    private String summary;
    private String group;
    private String origin;

    public Hero(){}

    public Hero(
            int id, String character, String identity, String abilities, String height,
            String weight, String powers, String summary, String group, String origin) {

        this.id = id;
        this.character = character;
        this.identity = identity;
        this.abilities = abilities;
        this.height = height;
        this.weight = weight;
        this.powers = powers;
        this.summary = summary;
        this.group = group;
        this.origin = origin;

    }

    public int getHeroId(){ return id; }

    public String getCharacter(){ return character; }

    public String getIdentity(){ return identity; }

    public String getAbilities(){ return abilities; }

    public String getHeight(){ return height; }

    public String getWeight(){ return weight; }

    public String getPowers(){ return powers; }

    public String getSummary(){ return summary; }

    public String getGroup(){ return group; }

    public String getOrigin(){ return origin; }

}

