package com.blackjacksmart.reddragon.androidnekoapp.Controller;

import android.content.Context;
import android.widget.Toast;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import java.util.ArrayList;

/**
 * Created by RedDragon on 12/16/16.
 */

public class Controller {

    private static int checkVal;
    private static ArrayList<Integer> list = new ArrayList<Integer>(28);

    public final static boolean BEAST = false;
    public final static boolean BLACK_PANTHER = false;
    public final static boolean CAPTAIN_AMERICA = false;
    public final static boolean CAPTAIN_MARVEL = false;
    public final static boolean CARNAGE = false;
    public final static boolean CYCLOPS = false;
    public final static boolean DEADPOOL = false;
    public final static boolean GAMBIT = false;
    public final static boolean HULK = false;
    public final static boolean HUMAN_TORCH = false;
    public final static boolean ICE_MAN = false;
    public final static boolean IRON_MAN = false;
    public final static boolean JEAN_GREY = false;
    public final static boolean JUBILEE = false;
    public final static boolean SHADOW_CAT = false;
    public final static boolean MYSTIQUE = false;
    public final static boolean NIGHT_CRAWLER = false;
    public final static boolean XAVIER = false;
    public final static boolean PSYLOCKE = false;
    public final static boolean ROGUE = false;
    public final static boolean SILVER_SURFER = false;
    public final static boolean SPIDER_MAN = false;
    public final static boolean STEEL = false;
    public final static boolean STORM = false;
    public final static boolean THOR = false;
    public final static boolean VENOM = false;
    public final static boolean WAR_MACHINE = false;
    public final static boolean WOLVERINE = false;

    public static Boolean[] isCharacterLocked = {
            BEAST, BLACK_PANTHER, CAPTAIN_AMERICA, CAPTAIN_MARVEL,
            CARNAGE, CYCLOPS, DEADPOOL, GAMBIT, HULK, HUMAN_TORCH,
            ICE_MAN, IRON_MAN, JEAN_GREY, JUBILEE, SHADOW_CAT, MYSTIQUE,
            NIGHT_CRAWLER, XAVIER, PSYLOCKE, ROGUE, SILVER_SURFER,
            SPIDER_MAN, STEEL, STORM, THOR, VENOM, WAR_MACHINE, WOLVERINE
    };


    public final static String[] ARRAY_CHARACTERS = {
            "BEAST","BLACK PANTHER","CAPTAIN AMERICA","CAPTAIN MARVEL",
            "CARNAGE", "CYCLOPS", "DEADPOOL", "GAMBIT", "HULK", "HUMAN TORCH",
            "ICE MAN", "IRON MAN", "JEAN GREY", "JUBILEE", "SHADOW CAT",
            "MYSTIQUE", "NIGHT CRAWLER", "XAVIER", "PSYLOCKE", "ROGUE",
            "SILVER SURFER", "SPIDER MAN", "STEEL", "STORM", "THOR",
            "VENOM", "WAR MACHINE", "WOLVERINE"
    };

    public static final Integer[] icons = {

            R.drawable.beast_icon, R.drawable.black_panther_icon, R.drawable.captain_icon,
            R.drawable.captain_marvel_icon, R.drawable.carnage_icon, R.drawable.cyclops_icon,
            R.drawable.deadpool_icon, R.drawable.gambit_icon, R.drawable.hulk_icon,
            R.drawable.human_torch_icon, R.drawable.ice_man_icon, R.drawable.iron_man_icon,
            R.drawable.jean_grey_icon, R.drawable.jubilee_icon, R.drawable.kitty_icon,
            R.drawable.mystique_icon, R.drawable.night_crawler_icon, R.drawable.professor_x_icon,
            R.drawable.psylocke_icon, R.drawable.rogue_icon, R.drawable.silver_surfer_icon,
            R.drawable.spidey_icon, R.drawable.steel_icon, R.drawable.storm_icon,
            R.drawable.thor_icon, R.drawable.venom_icon, R.drawable.war_machine_icon,
            R.drawable.wolverine_icon
    };


    public static ArrayList<Integer> generateRandomNumList(){
        for(int i = 0; i < 28; i++){
            list.add(i);
        }
        return list;
    }

    public static void toastCharacter(Context context, int n){
        Toast.makeText(context,"" + ARRAY_CHARACTERS[n], Toast.LENGTH_SHORT).show();
    }

    private static boolean setTrue(Boolean character){return character = true;}

    public static boolean setCharacterIcon(int i){
        return isCharacterLocked[i];
    }

    public static void unlockRandomCharacter(int checkValue){

        switch(checkValue){
            case 0:
                if(!BEAST){ setTrue(BEAST); }

                break;
            case 1:
                if(!BLACK_PANTHER){ setTrue(BLACK_PANTHER); }
                break;
            case 2:
                if(!CAPTAIN_AMERICA){ setTrue(CAPTAIN_AMERICA); }
                break;
            case 3:
                if(!CAPTAIN_MARVEL){ setTrue(CAPTAIN_MARVEL); }
                break;
            case 4:
                if(!CARNAGE){ setTrue(CARNAGE); }
                break;
            case 5:
                if(!CYCLOPS){ setTrue(CYCLOPS); }
                break;
            case 6:
                if(!DEADPOOL){ setTrue(DEADPOOL); }
                break;
            case 7:
                if(!GAMBIT){ setTrue(GAMBIT); }
                break;
            case 8:
                if(!HULK){ setTrue(HULK); }
                break;
            case 9:
                if(!HUMAN_TORCH){ setTrue(HUMAN_TORCH); }
                break;
            case 10:
                if(!ICE_MAN){ setTrue(ICE_MAN); }
                break;
            case 11:
                if(!IRON_MAN){ setTrue(IRON_MAN); }
                break;
            case 12:
                if(!JEAN_GREY){ setTrue(JEAN_GREY); }
                break;
            case 13:
                if(!JUBILEE){ setTrue(JUBILEE); }
                break;
            case 14:
                if(!SHADOW_CAT){ setTrue(SHADOW_CAT); }
                break;
            case 15:
                if(!MYSTIQUE){ setTrue(MYSTIQUE); }
                break;
            case 16:
                if(!NIGHT_CRAWLER){ setTrue(NIGHT_CRAWLER); }
                break;
            case 17:
                if(!XAVIER){ setTrue(XAVIER); }
                break;
            case 18:
                if(!PSYLOCKE){ setTrue(PSYLOCKE); }
                break;
            case 19:
                if(!ROGUE){ setTrue(ROGUE); }
                break;
            case 20:
                if(!ROGUE){ setTrue(SILVER_SURFER); }
                break;
            case 21:
                if(!SPIDER_MAN){ setTrue(SPIDER_MAN); }
                break;
            case 22:
                if(!STEEL){ setTrue(STEEL); }
                break;
            case 23:
                if(!STORM){ setTrue(STORM); }
                break;
            case 24:
                if(!THOR){ setTrue(THOR); }
                break;
            case 25:
                if(!VENOM){ setTrue(VENOM); }
                break;
            case 26:
                if(!WAR_MACHINE){ setTrue(WAR_MACHINE); }
                break;
            case 27:
                if(!WOLVERINE){ setTrue(WOLVERINE); }
                break;
        }
    }

}
