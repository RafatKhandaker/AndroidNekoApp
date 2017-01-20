package com.blackjacksmart.reddragon.androidnekoapp.Controller;

import android.content.Context;
import android.widget.Toast;

import com.blackjacksmart.reddragon.androidnekoapp.R;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Beast;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.BlackPanther;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.CaptainAmerica;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.CaptainMarvel;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Carnage;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Cyclops;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Deadpool;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Gambit;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Hulk;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.HumanTorch;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.IceMan;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.IronMan;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.JeanGrey;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Jubilee;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Mystique;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.NightCrawler;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Psylocke;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Rogue;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.ShadowCat;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.SilverSurfer;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.SpiderMan;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Steel;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Storm;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Thor;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Venom;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.WarMachine;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Wolverine;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Heroes.Xavier;
import com.blackjacksmart.reddragon.androidnekoapp.SQLDatabase.Characters.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by RedDragon on 12/16/16.
 */

public class Controller {

    public static boolean GRID_LOOP = false;

    public static ArrayList<Integer> RANDOM_LIST = new ArrayList<>(28);

    public static int FRAGMENT_VALUE;
    public static final int GRID_TRIGGER = 1;
    public static final int NOTIFICATION_TRIGGER = 0;

    public static List<Hero> heroList;

     private static final Beast Beast = new Beast();
     private static final BlackPanther BlackPanther =  new BlackPanther();
     private static final CaptainAmerica CaptainAmerica = new CaptainAmerica();
     private static final CaptainMarvel CaptainMarvel = new CaptainMarvel();
     private static final Carnage Carnage = new Carnage();
     private static final Cyclops Cyclops = new Cyclops();
     private static final Deadpool Deadpool = new Deadpool();
     private static final Gambit Gambit = new Gambit();
     private static final Hulk Hulk = new Hulk();
     private static final HumanTorch HumanTorch = new HumanTorch();
     private static final IceMan IceMan = new IceMan();
     private static final IronMan IronMan = new IronMan();
     private static final JeanGrey JeanGrey = new JeanGrey();
     private static final Jubilee Jubilee = new Jubilee();
     private static final Mystique Mystique = new Mystique();
     private static final NightCrawler NightCrawler = new NightCrawler();
     private static final Psylocke Psylocke = new Psylocke();
     private static final Rogue Rogue = new Rogue();
     private static final ShadowCat ShadowCat = new ShadowCat();
     private static final SilverSurfer SilverSurfer = new SilverSurfer();
     private static final SpiderMan SpiderMan = new SpiderMan();
     private static final Steel Steel = new Steel();
     private static final Storm Storm = new Storm();
     private static final Thor Thor = new Thor();
     private static final Venom Venom = new Venom();
     private static final WarMachine WarMachine = new WarMachine();
     private static final Wolverine Wolverine = new Wolverine();
     private static final Xavier Xavier = new Xavier();

//    static{
//        heroList.add(Beast);
//        heroList.add(BlackPanther);
//        heroList.add(CaptainAmerica);
//        heroList.add(CaptainMarvel);
//        heroList.add(Carnage);
//        heroList.add(Cyclops);
//        heroList.add(Deadpool);
//        heroList.add(Gambit);
//        heroList.add(Hulk);
//        heroList.add(HumanTorch);
//        heroList.add(IceMan);
//        heroList.add(IronMan);
//        heroList.add(JeanGrey);
//        heroList.add(Jubilee);
//        heroList.add(ShadowCat);
//        heroList.add(Mystique);
//        heroList.add(NightCrawler);
//        heroList.add(Xavier);
//        heroList.add(Psylocke);
//        heroList.add(Rogue);
//        heroList.add(SilverSurfer);
//        heroList.add(SpiderMan);
//        heroList.add(Steel);
//        heroList.add(Storm);
//        heroList.add(Thor);
//        heroList.add(Venom);
//        heroList.add(WarMachine);
//        heroList.add(Wolverine);
//    }



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
            R.drawable.ice_man_background, R.drawable.iron_man_background,
            R.drawable.jean_grey_background, R.drawable.jubilee_background,
            R.drawable.kitty_background, R.drawable.mystique_background,
            R.drawable.nightcrawler_background, R.drawable.professor_x_background,
            R.drawable.psylocke_background, R.drawable.rogue_background,
            R.drawable.silver_surfer_background, R.drawable.spidey_background,
            R.drawable.steel_background, R.drawable.storm_background,
            R.drawable.thor_background, R.drawable.venom_background,
            R.drawable.war_machine_background, R.drawable.wolverine_background
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
        ArrayList<Integer> randomList = new ArrayList<>(28);
        for(int i = 0; i < 28; i++){
            randomList.add(i);
        }
        Collections.shuffle(randomList);
        return randomList;
    }

    public static void toastCharacter(Context context, int n){
        Toast.makeText(context,"" + ARRAY_CHARACTERS[n], Toast.LENGTH_SHORT).show();
    }


    public boolean isCharacterUnlocked(int i){
        return checkCharacterUnlocked[i];
    }

    public static void unlockRandomCharacter(int checkValue){
        checkCharacterUnlocked[checkValue] = true;
    }

}
