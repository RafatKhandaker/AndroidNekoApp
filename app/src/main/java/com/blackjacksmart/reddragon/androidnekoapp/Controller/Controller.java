package com.blackjacksmart.reddragon.androidnekoapp.Controller;

import android.content.Context;
import android.widget.Toast;

import com.blackjacksmart.reddragon.androidnekoapp.R;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RedDragon on 12/16/16.
 */

public class Controller {

    public static boolean GRID_LOOP = false;

    private static int checkVal;
    public static ArrayList<Integer> RANDOM_LIST = new ArrayList<Integer>(28);

    public static int FRAGMENT_VALUE;
    public static final int GRID_TRIGGER = 1;
    public static final int NOTIFICATION_TRIGGER = 0;

    public static boolean BEAST = false;
    public static boolean BLACK_PANTHER = false;
    public static boolean CAPTAIN_AMERICA = false;
    public static boolean CAPTAIN_MARVEL = false;
    public static boolean CARNAGE = false;
    public static boolean CYCLOPS = false;
    public static boolean DEADPOOL = false;
    public static boolean GAMBIT = false;
    public static boolean HULK = false;
    public static boolean HUMAN_TORCH = false;
    public static boolean ICE_MAN = false;
    public static boolean IRON_MAN = false;
    public static boolean JEAN_GREY = false;
    public static boolean JUBILEE = false;
    public static boolean SHADOW_CAT = false;
    public static boolean MYSTIQUE = false;
    public static boolean NIGHT_CRAWLER = false;
    public static boolean XAVIER = false;
    public static boolean PSYLOCKE = false;
    public static boolean ROGUE = false;
    public static boolean SILVER_SURFER = false;
    public static boolean SPIDER_MAN = false;
    public static boolean STEEL = false;
    public static boolean STORM = false;
    public static boolean THOR = false;
    public static boolean VENOM = false;
    public static boolean WAR_MACHINE = false;
    public static boolean WOLVERINE = false;

    public static Boolean[] checkCharacterUnlocked = {
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

    public static String[] DEFAULT_CHAR_VALUE = {
            "Locked !", "Locked !", "Locked !", "Locked !", "Locked !", "Locked !",
            "Locked !", "Locked !", "Locked !", "Locked !", "Locked !", "Locked !",
            "Locked !", "Locked !", "Locked !", "Locked !", "Locked !", "Locked !",
            "Locked !", "Locked !", "Locked !", "Locked !", "Locked !", "Locked !",
            "Locked !", "Locked !", "Locked !", "Locked !",
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

    public static final Integer[] charBackgroundImage = {
            R.drawable.beast_background, R.drawable.black_panther_background,
            R.drawable.captain_background, R.drawable.captain_marvel_background,
            R.drawable.carnage_background, R.drawable.cyclops_background,
            R.drawable.deadpool_background, R.drawable.gambit_background,
            R.drawable.hulk_background, R.drawable.human_torch_background,
            R.drawable.ice_man_background, R.drawable.jean_grey_background,
            R.drawable.jubilee_background, R.drawable.kitty_background,
            R.drawable.mystique_background, R.drawable.nightcrawler_background,
            R.drawable.professor_x_background, R.drawable.psylocke_background,
            R.drawable.rogue_background, R.drawable.silver_surfer_background,
            R.drawable.spidey_background, R.drawable.steel_background,
            R.drawable.storm_background, R.drawable.thor_background,
            R.drawable.venom_background, R.drawable.war_machine_background,
            R.drawable.wolverine_background
    };

    public static final Integer[] iconDefault = {
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon, R.drawable.uknown_icon, R.drawable.uknown_icon,
            R.drawable.uknown_icon,
    };


    public static ArrayList<Integer> generateRandomNumList(){
        ArrayList <Integer> randomList = new ArrayList<>();
        for(int i = 0; i < 28; i++){
            randomList.add(i);
        }
        Collections.shuffle(randomList);
        return randomList;
    }

    public static void toastCharacter(Context context, int n){
        Toast.makeText(context,"" + ARRAY_CHARACTERS[n], Toast.LENGTH_SHORT).show();
    }

    private static boolean setTrue(Boolean character){return character = true;}

    public static boolean isCharacterUnlocked(int i){
        return checkCharacterUnlocked[i];
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
