package pl.idzikdev.XCom.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikdev.XCom.entity.SoldierEntity;
import pl.idzikdev.XCom.repository.SoldierRepository;
import pl.idzikdev.XCom.stats.soldier.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class SoldierToDos {
    @Autowired
    SoldierRepository soldierRepository;

    static Random random = new Random();
    static List<String> americanSetOfNames=new ArrayList<>();
    static List<String> britishSetOfNames=new ArrayList<>();
    static List<String> frenchSetOfNames=new ArrayList<>();
    static List<String> germanSetOfNames=new ArrayList<>();
    static List<String> japaneseSetOfNames=new ArrayList<>();
    static List<String> russianSetOfNames=new ArrayList<>();

    public static int drawNumber(int left, int right) {
        return random.nextInt(right - left + 1) + left;
    }

    public static void fillAmericanNames(){
        americanSetOfNames.addAll(Arrays.asList(
                "Austin,Bradley",
                "Barbara,Bryant",
                "Calvin,Carr",
                "Carl,Crossett",
                "Catherine,Dodge",
                "Clarence,Gallagher",
                "Donald,Homburger",
                "Dwight,Horton",
                "Ed,Hudson",
                "Evelyn,Johnson",
                "Kevin,Kemp",
                "Lester,King",
                "Mark,McNeil",
                "Oscar,Miller",
                "Patricia,Mitchell",
                "Samuel,Nash",
                "Sigourney,Stephens",
                "Spencer,Stoddard",
                "Tom,Thompson",
                "Virgil,Webb"
        ));
    }


    public static SoldierEntity addRookie(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="rookie";
        int timeUnits=drawNumber(RookieStats.TIME_UNITS_MIN, RookieStats.TIME_UNITS_MAX);
        int energy=drawNumber(RookieStats.ENERGY_MIN, RookieStats.ENERGY_MAX);
        int health=drawNumber(RookieStats.ENERGY_MIN, RookieStats.ENERGY_MAX);
        int bravery=drawNumber(RookieStats.BRAVERY_MIN, RookieStats.BRAVERY_MAX);
        int reactions=drawNumber(RookieStats.REACTIONS_MIN, RookieStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(RookieStats.FIRING_ACCURACY_MIN, RookieStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(RookieStats.THROWING_ACCURACY_MIN, RookieStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(RookieStats.STRENGTH_MIN, RookieStats.STRENGTH_MAX);
        int psiSkill=drawNumber(RookieStats.PSI_SKILL_MIN, RookieStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(RookieStats.PSI_STRENGTH_MIN, RookieStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(RookieStats.MELEE_ACCURACY_MIN, RookieStats.MELEE_ACCURACY_MAX);
        String armourType="no-armour";
        int missions=0;
        int killed=0;
        String picture="no-armour";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }


    public static SoldierEntity addSquaddie(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="squaddie";
        int timeUnits=drawNumber(SquaddieStats.TIME_UNITS_MIN, SquaddieStats.TIME_UNITS_MAX);
        int energy=drawNumber(SquaddieStats.ENERGY_MIN, SquaddieStats.ENERGY_MAX);
        int health=drawNumber(SquaddieStats.ENERGY_MIN, SquaddieStats.ENERGY_MAX);
        int bravery=drawNumber(SquaddieStats.BRAVERY_MIN, SquaddieStats.BRAVERY_MAX);
        int reactions=drawNumber(SquaddieStats.REACTIONS_MIN, SquaddieStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(SquaddieStats.FIRING_ACCURACY_MIN, SquaddieStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SquaddieStats.THROWING_ACCURACY_MIN, SquaddieStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(SquaddieStats.STRENGTH_MIN, SquaddieStats.STRENGTH_MAX);
        int psiSkill=drawNumber(SquaddieStats.PSI_SKILL_MIN, SquaddieStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SquaddieStats.PSI_STRENGTH_MIN, SquaddieStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SquaddieStats.MELEE_ACCURACY_MIN, SquaddieStats.MELEE_ACCURACY_MAX);
        int missions=drawNumber(SquaddieStats.MISSIONS_MIN, SquaddieStats.MISSIONS_MAX);
        int killed=drawNumber(SquaddieStats.KILLED_MIN, SquaddieStats.KILLED_MAX);
        String armourType="no-armour";
        String picture="no-armour";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addSergeant(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="sergeant";
        int timeUnits=drawNumber(SergeantStats.TIME_UNITS_MIN, SergeantStats.TIME_UNITS_MAX);
        int energy=drawNumber(SergeantStats.ENERGY_MIN, SergeantStats.ENERGY_MAX);
        int health=drawNumber(SergeantStats.ENERGY_MIN, SergeantStats.ENERGY_MAX);
        int bravery=drawNumber(SergeantStats.BRAVERY_MIN, SergeantStats.BRAVERY_MAX);
        int reactions=drawNumber(SergeantStats.REACTIONS_MIN, SergeantStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(SergeantStats.FIRING_ACCURACY_MIN, SergeantStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SergeantStats.THROWING_ACCURACY_MIN, SergeantStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(SergeantStats.STRENGTH_MIN, SergeantStats.STRENGTH_MAX);
        int psiSkill=drawNumber(SergeantStats.PSI_SKILL_MIN, SergeantStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SergeantStats.PSI_STRENGTH_MIN, SergeantStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SergeantStats.MELEE_ACCURACY_MIN, SergeantStats.MELEE_ACCURACY_MAX);
        int missions=drawNumber(SergeantStats.MISSIONS_MIN, SergeantStats.MISSIONS_MAX);
        int killed=drawNumber(SergeantStats.KILLED_MIN, SergeantStats.KILLED_MAX);
        String armourType="personal armour";
        String picture="personal armour";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addCaptain(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="captain";
        int timeUnits=drawNumber(CaptainStats.TIME_UNITS_MIN, CaptainStats.TIME_UNITS_MAX);
        int energy=drawNumber(CaptainStats.ENERGY_MIN, CaptainStats.ENERGY_MAX);
        int health=drawNumber(CaptainStats.ENERGY_MIN, CaptainStats.ENERGY_MAX);
        int bravery=drawNumber(CaptainStats.BRAVERY_MIN, CaptainStats.BRAVERY_MAX);
        int reactions=drawNumber(CaptainStats.REACTIONS_MIN, CaptainStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(CaptainStats.FIRING_ACCURACY_MIN, CaptainStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(CaptainStats.THROWING_ACCURACY_MIN, CaptainStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(CaptainStats.STRENGTH_MIN, CaptainStats.STRENGTH_MAX);
        int psiSkill=drawNumber(CaptainStats.PSI_SKILL_MIN, CaptainStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(CaptainStats.PSI_STRENGTH_MIN, CaptainStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(CaptainStats.MELEE_ACCURACY_MIN, CaptainStats.MELEE_ACCURACY_MAX);
        int missions=drawNumber(CaptainStats.MISSIONS_MIN, CaptainStats.MISSIONS_MAX);
        int killed=drawNumber(CaptainStats.KILLED_MIN, CaptainStats.KILLED_MAX);
        String armourType="power suit";
        String picture="power suit";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addColonel(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="colonel";
        int timeUnits=drawNumber(ColonelStats.TIME_UNITS_MIN, ColonelStats.TIME_UNITS_MAX);
        int energy=drawNumber(ColonelStats.ENERGY_MIN, ColonelStats.ENERGY_MAX);
        int health=drawNumber(ColonelStats.ENERGY_MIN, ColonelStats.ENERGY_MAX);
        int bravery=drawNumber(ColonelStats.BRAVERY_MIN, ColonelStats.BRAVERY_MAX);
        int reactions=drawNumber(ColonelStats.REACTIONS_MIN, ColonelStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(ColonelStats.FIRING_ACCURACY_MIN, ColonelStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(ColonelStats.THROWING_ACCURACY_MIN, ColonelStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(ColonelStats.STRENGTH_MIN, ColonelStats.STRENGTH_MAX);
        int psiSkill=drawNumber(ColonelStats.PSI_SKILL_MIN, ColonelStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(ColonelStats.PSI_STRENGTH_MIN, ColonelStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(ColonelStats.MELEE_ACCURACY_MIN, ColonelStats.MELEE_ACCURACY_MAX);
        int missions=drawNumber(ColonelStats.MISSIONS_MIN, ColonelStats.MISSIONS_MAX);
        int killed=drawNumber(ColonelStats.KILLED_MIN, ColonelStats.KILLED_MAX);
        String armourType="flying suit";
        String picture="flying suit";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addCommander(){
        int nameIndex=drawNumber(0,americanSetOfNames.size()-1);
        String name=americanSetOfNames.get(nameIndex);
        americanSetOfNames.remove(nameIndex);
        String myRank="commander";
        int timeUnits=drawNumber(CommanderStats.TIME_UNITS_MIN, CommanderStats.TIME_UNITS_MAX);
        int energy=drawNumber(CommanderStats.ENERGY_MIN, CommanderStats.ENERGY_MAX);
        int health=drawNumber(CommanderStats.ENERGY_MIN, CommanderStats.ENERGY_MAX);
        int bravery=drawNumber(CommanderStats.BRAVERY_MIN, CommanderStats.BRAVERY_MAX);
        int reactions=drawNumber(CommanderStats.REACTIONS_MIN, CommanderStats.REACTIONS_MAX);
        int firingAccuracy=drawNumber(CommanderStats.FIRING_ACCURACY_MIN, CommanderStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(CommanderStats.THROWING_ACCURACY_MIN, CommanderStats.THROWING_ACCURACY_MAX);
        int strength=drawNumber(CommanderStats.STRENGTH_MIN, CommanderStats.STRENGTH_MAX);
        int psiSkill=drawNumber(CommanderStats.PSI_SKILL_MIN, CommanderStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(CommanderStats.PSI_STRENGTH_MIN, CommanderStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(CommanderStats.MELEE_ACCURACY_MIN, CommanderStats.MELEE_ACCURACY_MAX);
        int missions=drawNumber(CommanderStats.MISSIONS_MIN, CommanderStats.MISSIONS_MAX);
        int killed=drawNumber(CommanderStats.KILLED_MIN, CommanderStats.KILLED_MAX);
        String armourType="flying suit";
        String picture="flying suit";

        SoldierEntity soldierEntity=SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }


    public static SoldierEntity addRandomSoldier(String rank){
        SoldierEntity soldierEntity=new SoldierEntity();

        switch (rank){
            case "rookie":{
                soldierEntity=addRookie();
                break;
            }
            case "squaddie":{
                soldierEntity=addSquaddie();
                break;
            }
            case "sergeant":{
                soldierEntity=addSergeant();
                break;
            }
            case "captain":{
                soldierEntity=addCaptain();
                break;
            }
            case "colonel":{
                soldierEntity=addColonel();
                break;
            }
            case "commander":{
                soldierEntity=addCommander();
                break;
            }
        }
        //todo a co jeśli podamy rangę, która nie istnieje? poprawić!
        return soldierEntity;
    }
}