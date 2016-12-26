package com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase;

/**
 * Created by RedDragon on 12/24/16.
 */

public class HeroDB {

    private Long _id;

    private int id;
    private boolean unlockValue;
    private int random;
//    private List<Integer> saveRandomNumbers = new ArrayList<>();

    public HeroDB() {
        this.random = 0;
        this.id = 0;
        this.unlockValue = false;
    }

//    public HeroDB(List<Integer> saveRandomNumbers){
//        this.saveRandomNumbers = saveRandomNumbers;
//    }

    public HeroDB( int random, int id,  boolean unlockValue){
        this.id = id;
        this.unlockValue = unlockValue;
        this.random = random;
    }

    public void set_id(long _id){ this._id = _id; }

    public void setRandom(int random){ this.random = random; }

    public void  setIntPlace(int id){ this.id = id; }

    public void setUnlockedValue(boolean unlockValue){ this.unlockValue = unlockValue; }

//    public void setSaveRandomNumbers(List<Integer> saveRandomNumbers){
//
//        this.saveRandomNumbers = saveRandomNumbers;
//
//    }


    public Long get_id(){ return _id; }

    public int getRandom(){ return random; }
    
    public int getIntPlace(){ return id; }

    public boolean getUnlockValue(){ return unlockValue; }

//    public List<Integer> getSaveRandomNumbers(){ return saveRandomNumbers; }
}
