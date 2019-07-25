package pl.idzikdev.XCom.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.repository.AlienRepository;
import pl.idzikdev.XCom.stats.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class AlienToDos {
    @Autowired
    AlienRepository alienRepository;
    static Random random=new Random();

    public static int drawNumber(int left,int right){
        return random.nextInt(right-left+1)+left;
    }


    public static AlienEntity addAlien(String race,String rank){
        AlienEntity alienEntity=new AlienEntity();
        switch (race){
            case "celatid":{
                alienEntity=AlienToDos.addCelatid(rank);
                break;
            }
            case "chryssalid":{
                alienEntity=AlienToDos.addChryssalid(rank);
                break;
            }
            case "cyberdisc":{
                alienEntity=AlienToDos.addCyberdisc(rank);
                break;
            }
            case "ethereal":{
                alienEntity=AlienToDos.addEthereal(rank);
                break;
            }
            case "floater":{
                alienEntity=AlienToDos.addFloater(rank);
                break;
            }
            case "muton":{
                alienEntity=AlienToDos.addMuton(rank);
                break;
            }
            case "reaper":{
                alienEntity=AlienToDos.addReaper(rank);
                break;
            }
            case "sectoid":{
                alienEntity=AlienToDos.addSectoid(rank);
                break;
            }
            case "sectopod":{
                alienEntity=AlienToDos.addSectopod(rank);
                break;
            }
            case "silacoid":{
                alienEntity=AlienToDos.addSilacoid(rank);
                break;
            }
            case "snakeman":{
                alienEntity=AlienToDos.addSnakeman(rank);
                break;
            }
            case "zombie":{
                alienEntity=AlienToDos.addZombie(rank);
                break;
            }
        }
        return alienEntity;
    }



    public static AlienEntity addCelatid(String rank) {
        String myRank="terrorist";
        String breed="celatid";
        int timeUnits=drawNumber(CelatidRaceStats.TIME_UNITS_MIN,CelatidRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(CelatidRaceStats.HEALTH_MIN,CelatidRaceStats.HEALTH_MAX);
        int energy=drawNumber(CelatidRaceStats.ENERGY_MIN,CelatidRaceStats.ENERGY_MAX);
        int reactions=drawNumber(CelatidRaceStats.REACTIONS_MIN,CelatidRaceStats.REACTIONS_MAX);
        int strength=drawNumber(CelatidRaceStats.STRENGTH_MIN,CelatidRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(CelatidRaceStats.BRAVERY_MIN,CelatidRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(CelatidRaceStats.FIRING_ACCURACY_MIN,CelatidRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(CelatidRaceStats.THROWING_ACCURACY_MIN,CelatidRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(CelatidRaceStats.PSI_SKILL_MIN,CelatidRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(CelatidRaceStats.PSI_STRENGTH_MIN,CelatidRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(CelatidRaceStats.MELEE_ACCURACY_MIN,CelatidRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(CelatidRaceStats.ARMOUR_FRONT_MIN,CelatidRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(CelatidRaceStats.ARMOUR_LEFT_MIN,CelatidRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(CelatidRaceStats.ARMOUR_RIGHT_MIN,CelatidRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(CelatidRaceStats.ARMOUR_REAR_MIN,CelatidRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(CelatidRaceStats.ARMOUR_UNDER_MIN,CelatidRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(CelatidRaceStats.ENERGY_RECOVERY_MIN,CelatidRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(CelatidRaceStats.VICTORY_POINTS_MIN,CelatidRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(CelatidRaceStats.AGGRESSION_MIN,CelatidRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(CelatidRaceStats.INTELLIGENCE_MIN,CelatidRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(CelatidRaceStats.HEIGHT_STANDING_MIN,CelatidRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(CelatidRaceStats.HEIGHT_KNEELING_MIN,CelatidRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addChryssalid(String rank) {
        String myRank="terrorist";
        String breed="chryssalid";
        int timeUnits=drawNumber(ChryssalidRaceStats.TIME_UNITS_MIN,ChryssalidRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(ChryssalidRaceStats.HEALTH_MIN,ChryssalidRaceStats.HEALTH_MAX);
        int energy=drawNumber(ChryssalidRaceStats.ENERGY_MIN,ChryssalidRaceStats.ENERGY_MAX);
        int reactions=drawNumber(ChryssalidRaceStats.REACTIONS_MIN,ChryssalidRaceStats.REACTIONS_MAX);
        int strength=drawNumber(ChryssalidRaceStats.STRENGTH_MIN,ChryssalidRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(ChryssalidRaceStats.BRAVERY_MIN,ChryssalidRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(ChryssalidRaceStats.FIRING_ACCURACY_MIN,ChryssalidRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(ChryssalidRaceStats.THROWING_ACCURACY_MIN,ChryssalidRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(ChryssalidRaceStats.PSI_SKILL_MIN,ChryssalidRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(ChryssalidRaceStats.PSI_STRENGTH_MIN,ChryssalidRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(ChryssalidRaceStats.MELEE_ACCURACY_MIN,ChryssalidRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(ChryssalidRaceStats.ARMOUR_FRONT_MIN,ChryssalidRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(ChryssalidRaceStats.ARMOUR_LEFT_MIN,ChryssalidRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(ChryssalidRaceStats.ARMOUR_RIGHT_MIN,ChryssalidRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(ChryssalidRaceStats.ARMOUR_REAR_MIN,ChryssalidRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(ChryssalidRaceStats.ARMOUR_UNDER_MIN,ChryssalidRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(ChryssalidRaceStats.ENERGY_RECOVERY_MIN,ChryssalidRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(ChryssalidRaceStats.VICTORY_POINTS_MIN,ChryssalidRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(ChryssalidRaceStats.AGGRESSION_MIN,ChryssalidRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(ChryssalidRaceStats.INTELLIGENCE_MIN,ChryssalidRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(ChryssalidRaceStats.HEIGHT_STANDING_MIN,ChryssalidRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(ChryssalidRaceStats.HEIGHT_KNEELING_MIN,ChryssalidRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addCyberdisc(String rank) {
        String myRank="terrorist";
        String breed="cyberdisc";
        int timeUnits=drawNumber(CyberdiscRaceStats.TIME_UNITS_MIN,CyberdiscRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(CyberdiscRaceStats.HEALTH_MIN,CyberdiscRaceStats.HEALTH_MAX);
        int energy=drawNumber(CyberdiscRaceStats.ENERGY_MIN,CyberdiscRaceStats.ENERGY_MAX);
        int reactions=drawNumber(CyberdiscRaceStats.REACTIONS_MIN,CyberdiscRaceStats.REACTIONS_MAX);
        int strength=drawNumber(CyberdiscRaceStats.STRENGTH_MIN,CyberdiscRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(CyberdiscRaceStats.BRAVERY_MIN,CyberdiscRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(CyberdiscRaceStats.FIRING_ACCURACY_MIN,CyberdiscRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(CyberdiscRaceStats.THROWING_ACCURACY_MIN,CyberdiscRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(CyberdiscRaceStats.PSI_SKILL_MIN,CyberdiscRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(CyberdiscRaceStats.PSI_STRENGTH_MIN,CyberdiscRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(CyberdiscRaceStats.MELEE_ACCURACY_MIN,CyberdiscRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(CyberdiscRaceStats.ARMOUR_FRONT_MIN,CyberdiscRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(CyberdiscRaceStats.ARMOUR_LEFT_MIN,CyberdiscRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(CyberdiscRaceStats.ARMOUR_RIGHT_MIN,CyberdiscRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(CyberdiscRaceStats.ARMOUR_REAR_MIN,CyberdiscRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(CyberdiscRaceStats.ARMOUR_UNDER_MIN,CyberdiscRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(CyberdiscRaceStats.ENERGY_RECOVERY_MIN,CyberdiscRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(CyberdiscRaceStats.VICTORY_POINTS_MIN,CyberdiscRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(CyberdiscRaceStats.AGGRESSION_MIN,CyberdiscRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(CyberdiscRaceStats.INTELLIGENCE_MIN,CyberdiscRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(CyberdiscRaceStats.HEIGHT_STANDING_MIN,CyberdiscRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(CyberdiscRaceStats.HEIGHT_KNEELING_MIN,CyberdiscRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addEthereal(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","leader","commander"));
        String myRank;
        String breed="ethereal";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(drawNumber(0,ranks.size()-1));
        }
        int timeUnits=drawNumber(EtherealRaceStats.TIME_UNITS_MIN,EtherealRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(EtherealRaceStats.HEALTH_MIN,EtherealRaceStats.HEALTH_MAX);
        int energy=drawNumber(EtherealRaceStats.ENERGY_MIN,EtherealRaceStats.ENERGY_MAX);
        int reactions=drawNumber(EtherealRaceStats.REACTIONS_MIN,EtherealRaceStats.REACTIONS_MAX);
        int strength=drawNumber(EtherealRaceStats.STRENGTH_MIN,EtherealRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(EtherealRaceStats.BRAVERY_MIN,EtherealRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(EtherealRaceStats.FIRING_ACCURACY_MIN,EtherealRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(EtherealRaceStats.THROWING_ACCURACY_MIN,EtherealRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(EtherealRaceStats.PSI_SKILL_MIN,EtherealRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(EtherealRaceStats.PSI_STRENGTH_MIN,EtherealRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(EtherealRaceStats.MELEE_ACCURACY_MIN,EtherealRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(EtherealRaceStats.ARMOUR_FRONT_MIN,EtherealRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(EtherealRaceStats.ARMOUR_LEFT_MIN,EtherealRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(EtherealRaceStats.ARMOUR_RIGHT_MIN,EtherealRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(EtherealRaceStats.ARMOUR_REAR_MIN,EtherealRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(EtherealRaceStats.ARMOUR_UNDER_MIN,EtherealRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(EtherealRaceStats.ENERGY_RECOVERY_MIN,EtherealRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(EtherealRaceStats.VICTORY_POINTS_MIN,EtherealRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(EtherealRaceStats.AGGRESSION_MIN,EtherealRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(EtherealRaceStats.INTELLIGENCE_MIN,EtherealRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(EtherealRaceStats.HEIGHT_STANDING_MIN,EtherealRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(EtherealRaceStats.HEIGHT_KNEELING_MIN,EtherealRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addFloater(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","leader","commander"));
        String myRank;
        String breed="floater";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(drawNumber(0,ranks.size()-1));
        }
        int timeUnits=drawNumber(FloaterRaceStats.TIME_UNITS_MIN,FloaterRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(FloaterRaceStats.HEALTH_MIN,FloaterRaceStats.HEALTH_MAX);
        int energy=drawNumber(FloaterRaceStats.ENERGY_MIN,FloaterRaceStats.ENERGY_MAX);
        int reactions=drawNumber(FloaterRaceStats.REACTIONS_MIN,FloaterRaceStats.REACTIONS_MAX);
        int strength=drawNumber(FloaterRaceStats.STRENGTH_MIN,FloaterRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(FloaterRaceStats.BRAVERY_MIN,FloaterRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(FloaterRaceStats.FIRING_ACCURACY_MIN,FloaterRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(FloaterRaceStats.THROWING_ACCURACY_MIN,FloaterRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(FloaterRaceStats.PSI_SKILL_MIN,FloaterRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(FloaterRaceStats.PSI_STRENGTH_MIN,FloaterRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(FloaterRaceStats.MELEE_ACCURACY_MIN,FloaterRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(FloaterRaceStats.ARMOUR_FRONT_MIN,FloaterRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(FloaterRaceStats.ARMOUR_LEFT_MIN,FloaterRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(FloaterRaceStats.ARMOUR_RIGHT_MIN,FloaterRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(FloaterRaceStats.ARMOUR_REAR_MIN,FloaterRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(FloaterRaceStats.ARMOUR_UNDER_MIN,FloaterRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(FloaterRaceStats.ENERGY_RECOVERY_MIN,FloaterRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(FloaterRaceStats.VICTORY_POINTS_MIN,FloaterRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(FloaterRaceStats.AGGRESSION_MIN,FloaterRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(FloaterRaceStats.INTELLIGENCE_MIN,FloaterRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(FloaterRaceStats.HEIGHT_STANDING_MIN,FloaterRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(FloaterRaceStats.HEIGHT_KNEELING_MIN,FloaterRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }

    public static AlienEntity addMuton(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","engineer","navigator"));
        String myRank;
        String breed="muton";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(drawNumber(0,ranks.size()-1));
        }
        int timeUnits=drawNumber(MutonRaceStats.TIME_UNITS_MIN,MutonRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(MutonRaceStats.HEALTH_MIN,MutonRaceStats.HEALTH_MAX);
        int energy=drawNumber(MutonRaceStats.ENERGY_MIN,MutonRaceStats.ENERGY_MAX);
        int reactions=drawNumber(MutonRaceStats.REACTIONS_MIN,MutonRaceStats.REACTIONS_MAX);
        int strength=drawNumber(MutonRaceStats.STRENGTH_MIN,MutonRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(MutonRaceStats.BRAVERY_MIN,MutonRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(MutonRaceStats.FIRING_ACCURACY_MIN,MutonRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(MutonRaceStats.THROWING_ACCURACY_MIN,MutonRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(MutonRaceStats.PSI_SKILL_MIN,MutonRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(MutonRaceStats.PSI_STRENGTH_MIN,MutonRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(MutonRaceStats.MELEE_ACCURACY_MIN,MutonRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(MutonRaceStats.ARMOUR_FRONT_MIN,MutonRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(MutonRaceStats.ARMOUR_LEFT_MIN,MutonRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(MutonRaceStats.ARMOUR_RIGHT_MIN,MutonRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(MutonRaceStats.ARMOUR_REAR_MIN,MutonRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(MutonRaceStats.ARMOUR_UNDER_MIN,MutonRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(MutonRaceStats.ENERGY_RECOVERY_MIN,MutonRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(MutonRaceStats.VICTORY_POINTS_MIN,MutonRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(MutonRaceStats.AGGRESSION_MIN,MutonRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(MutonRaceStats.INTELLIGENCE_MIN,MutonRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(MutonRaceStats.HEIGHT_STANDING_MIN,MutonRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(MutonRaceStats.HEIGHT_KNEELING_MIN,MutonRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }

    public static AlienEntity addReaper(String rank) {
        String myRank="terrorist";
        String breed="reaper";
        int timeUnits=drawNumber(ReaperRaceStats.TIME_UNITS_MIN,ReaperRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(ReaperRaceStats.HEALTH_MIN,ReaperRaceStats.HEALTH_MAX);
        int energy=drawNumber(ReaperRaceStats.ENERGY_MIN,ReaperRaceStats.ENERGY_MAX);
        int reactions=drawNumber(ReaperRaceStats.REACTIONS_MIN,ReaperRaceStats.REACTIONS_MAX);
        int strength=drawNumber(ReaperRaceStats.STRENGTH_MIN,ReaperRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(ReaperRaceStats.BRAVERY_MIN,ReaperRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(ReaperRaceStats.FIRING_ACCURACY_MIN,ReaperRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(ReaperRaceStats.THROWING_ACCURACY_MIN,ReaperRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(ReaperRaceStats.PSI_SKILL_MIN,ReaperRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(ReaperRaceStats.PSI_STRENGTH_MIN,ReaperRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(ReaperRaceStats.MELEE_ACCURACY_MIN,ReaperRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(ReaperRaceStats.ARMOUR_FRONT_MIN,ReaperRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(ReaperRaceStats.ARMOUR_LEFT_MIN,ReaperRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(ReaperRaceStats.ARMOUR_RIGHT_MIN,ReaperRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(ReaperRaceStats.ARMOUR_REAR_MIN,ReaperRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(ReaperRaceStats.ARMOUR_UNDER_MIN,ReaperRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(ReaperRaceStats.ENERGY_RECOVERY_MIN,ReaperRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(ReaperRaceStats.VICTORY_POINTS_MIN,ReaperRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(ReaperRaceStats.AGGRESSION_MIN,ReaperRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(ReaperRaceStats.INTELLIGENCE_MIN,ReaperRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(ReaperRaceStats.HEIGHT_STANDING_MIN,ReaperRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(ReaperRaceStats.HEIGHT_KNEELING_MIN,ReaperRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }

    public static AlienEntity addSectoid(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","leader","commander"));
        String myRank;
        String breed="sectoid";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(drawNumber(0,ranks.size()-1));
        }
        int timeUnits=drawNumber(SectoidRaceStats.TIME_UNITS_MIN,SectoidRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(SectoidRaceStats.HEALTH_MIN,SectoidRaceStats.HEALTH_MAX);
        int energy=drawNumber(SectoidRaceStats.ENERGY_MIN,SectoidRaceStats.ENERGY_MAX);
        int reactions=drawNumber(SectoidRaceStats.REACTIONS_MIN,SectoidRaceStats.REACTIONS_MAX);
        int strength=drawNumber(SectoidRaceStats.STRENGTH_MIN,SectoidRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(SectoidRaceStats.BRAVERY_MIN,SectoidRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(SectoidRaceStats.FIRING_ACCURACY_MIN,SectoidRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SectoidRaceStats.THROWING_ACCURACY_MIN,SectoidRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(SectoidRaceStats.PSI_SKILL_MIN,SectoidRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SectoidRaceStats.PSI_STRENGTH_MIN,SectoidRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SectoidRaceStats.MELEE_ACCURACY_MIN,SectoidRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(SectoidRaceStats.ARMOUR_FRONT_MIN,SectoidRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(SectoidRaceStats.ARMOUR_LEFT_MIN,SectoidRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(SectoidRaceStats.ARMOUR_RIGHT_MIN,SectoidRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(SectoidRaceStats.ARMOUR_REAR_MIN,SectoidRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(SectoidRaceStats.ARMOUR_UNDER_MIN,SectoidRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(SectoidRaceStats.ENERGY_RECOVERY_MIN,SectoidRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(SectoidRaceStats.VICTORY_POINTS_MIN,SectoidRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(SectoidRaceStats.AGGRESSION_MIN,SectoidRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(SectoidRaceStats.INTELLIGENCE_MIN,SectoidRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(SectoidRaceStats.HEIGHT_STANDING_MIN,SectoidRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(SectoidRaceStats.HEIGHT_KNEELING_MIN,SectoidRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }

    public static AlienEntity addSectopod(String rank) {
        String myRank="terrorist";
        String breed="sectopod";
        int timeUnits=drawNumber(SectopodRaceStats.TIME_UNITS_MIN,SectopodRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(SectopodRaceStats.HEALTH_MIN,SectopodRaceStats.HEALTH_MAX);
        int energy=drawNumber(SectopodRaceStats.ENERGY_MIN,SectopodRaceStats.ENERGY_MAX);
        int reactions=drawNumber(SectopodRaceStats.REACTIONS_MIN,SectopodRaceStats.REACTIONS_MAX);
        int strength=drawNumber(SectopodRaceStats.STRENGTH_MIN,SectopodRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(SectopodRaceStats.BRAVERY_MIN,SectopodRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(SectopodRaceStats.FIRING_ACCURACY_MIN,SectopodRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SectopodRaceStats.THROWING_ACCURACY_MIN,SectopodRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(SectopodRaceStats.PSI_SKILL_MIN,SectopodRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SectopodRaceStats.PSI_STRENGTH_MIN,SectopodRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SectopodRaceStats.MELEE_ACCURACY_MIN,SectopodRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(SectopodRaceStats.ARMOUR_FRONT_MIN,SectopodRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(SectopodRaceStats.ARMOUR_LEFT_MIN,SectopodRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(SectopodRaceStats.ARMOUR_RIGHT_MIN,SectopodRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(SectopodRaceStats.ARMOUR_REAR_MIN,SectopodRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(SectopodRaceStats.ARMOUR_UNDER_MIN,SectopodRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(SectopodRaceStats.ENERGY_RECOVERY_MIN,SectopodRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(SectopodRaceStats.VICTORY_POINTS_MIN,SectopodRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(SectopodRaceStats.AGGRESSION_MIN,SectopodRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(SectopodRaceStats.INTELLIGENCE_MIN,SectopodRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(SectopodRaceStats.HEIGHT_STANDING_MIN,SectopodRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(SectopodRaceStats.HEIGHT_KNEELING_MIN,SectopodRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addSilacoid(String rank) {
        String myRank="terrorist";
        String breed="silacoid";
        int timeUnits=drawNumber(SilacoidRaceStats.TIME_UNITS_MIN,SilacoidRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(SilacoidRaceStats.HEALTH_MIN,SilacoidRaceStats.HEALTH_MAX);
        int energy=drawNumber(SilacoidRaceStats.ENERGY_MIN,SilacoidRaceStats.ENERGY_MAX);
        int reactions=drawNumber(SilacoidRaceStats.REACTIONS_MIN,SilacoidRaceStats.REACTIONS_MAX);
        int strength=drawNumber(SilacoidRaceStats.STRENGTH_MIN,SilacoidRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(SilacoidRaceStats.BRAVERY_MIN,SilacoidRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(SilacoidRaceStats.FIRING_ACCURACY_MIN,SilacoidRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SilacoidRaceStats.THROWING_ACCURACY_MIN,SilacoidRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(SilacoidRaceStats.PSI_SKILL_MIN,SilacoidRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SilacoidRaceStats.PSI_STRENGTH_MIN,SilacoidRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SilacoidRaceStats.MELEE_ACCURACY_MIN,SilacoidRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(SilacoidRaceStats.ARMOUR_FRONT_MIN,SilacoidRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(SilacoidRaceStats.ARMOUR_LEFT_MIN,SilacoidRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(SilacoidRaceStats.ARMOUR_RIGHT_MIN,SilacoidRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(SilacoidRaceStats.ARMOUR_REAR_MIN,SilacoidRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(SilacoidRaceStats.ARMOUR_UNDER_MIN,SilacoidRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(SilacoidRaceStats.ENERGY_RECOVERY_MIN,SilacoidRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(SilacoidRaceStats.VICTORY_POINTS_MIN,SilacoidRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(SilacoidRaceStats.AGGRESSION_MIN,SilacoidRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(SilacoidRaceStats.INTELLIGENCE_MIN,SilacoidRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(SilacoidRaceStats.HEIGHT_STANDING_MIN,SilacoidRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(SilacoidRaceStats.HEIGHT_KNEELING_MIN,SilacoidRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }

    public static AlienEntity addSnakeman(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","engineer","navigator","leader","commander"));
        String myRank;
        String breed="snakeman";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(drawNumber(0,ranks.size()-1));
        }
        int timeUnits=drawNumber(SnakemanRaceStats.TIME_UNITS_MIN,SnakemanRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(SnakemanRaceStats.HEALTH_MIN,SnakemanRaceStats.HEALTH_MAX);
        int energy=drawNumber(SnakemanRaceStats.ENERGY_MIN,SnakemanRaceStats.ENERGY_MAX);
        int reactions=drawNumber(SnakemanRaceStats.REACTIONS_MIN,SnakemanRaceStats.REACTIONS_MAX);
        int strength=drawNumber(SnakemanRaceStats.STRENGTH_MIN,SnakemanRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(SnakemanRaceStats.BRAVERY_MIN,SnakemanRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(SnakemanRaceStats.FIRING_ACCURACY_MIN,SnakemanRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(SnakemanRaceStats.THROWING_ACCURACY_MIN,SnakemanRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(SnakemanRaceStats.PSI_SKILL_MIN,SnakemanRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(SnakemanRaceStats.PSI_STRENGTH_MIN,SnakemanRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(SnakemanRaceStats.MELEE_ACCURACY_MIN,SnakemanRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(SnakemanRaceStats.ARMOUR_FRONT_MIN,SnakemanRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(SnakemanRaceStats.ARMOUR_LEFT_MIN,SnakemanRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(SnakemanRaceStats.ARMOUR_RIGHT_MIN,SnakemanRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(SnakemanRaceStats.ARMOUR_REAR_MIN,SnakemanRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(SnakemanRaceStats.ARMOUR_UNDER_MIN,SnakemanRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(SnakemanRaceStats.ENERGY_RECOVERY_MIN,SnakemanRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(SnakemanRaceStats.VICTORY_POINTS_MIN,SnakemanRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(SnakemanRaceStats.AGGRESSION_MIN,SnakemanRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(SnakemanRaceStats.INTELLIGENCE_MIN,SnakemanRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(SnakemanRaceStats.HEIGHT_STANDING_MIN,SnakemanRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(SnakemanRaceStats.HEIGHT_KNEELING_MIN,SnakemanRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }


    public static AlienEntity addZombie(String rank) {
        String myRank="terrorist";
        String breed="zombie";
        int timeUnits=drawNumber(ZombieRaceStats.TIME_UNITS_MIN,ZombieRaceStats.TIME_UNITS_MAX);
        int health=drawNumber(ZombieRaceStats.HEALTH_MIN,ZombieRaceStats.HEALTH_MAX);
        int energy=drawNumber(ZombieRaceStats.ENERGY_MIN,ZombieRaceStats.ENERGY_MAX);
        int reactions=drawNumber(ZombieRaceStats.REACTIONS_MIN,ZombieRaceStats.REACTIONS_MAX);
        int strength=drawNumber(ZombieRaceStats.STRENGTH_MIN,ZombieRaceStats.STRENGTH_MAX);
        int bravery=drawNumber(ZombieRaceStats.BRAVERY_MIN,ZombieRaceStats.BRAVERY_MAX);
        int firingAccuracy=drawNumber(ZombieRaceStats.FIRING_ACCURACY_MIN,ZombieRaceStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy=drawNumber(ZombieRaceStats.THROWING_ACCURACY_MIN,ZombieRaceStats.THROWING_ACCURACY_MAX);
        int psiSkill=drawNumber(ZombieRaceStats.PSI_SKILL_MIN,ZombieRaceStats.PSI_SKILL_MAX);
        int psiStrength=drawNumber(ZombieRaceStats.PSI_STRENGTH_MIN,ZombieRaceStats.PSI_STRENGTH_MAX);
        int meleeAccuracy=drawNumber(ZombieRaceStats.MELEE_ACCURACY_MIN,ZombieRaceStats.MELEE_ACCURACY_MAX);
        int armourFront=drawNumber(ZombieRaceStats.ARMOUR_FRONT_MIN,ZombieRaceStats.ARMOUR_FRONT_MAX);
        int armourLeft=drawNumber(ZombieRaceStats.ARMOUR_LEFT_MIN,ZombieRaceStats.ARMOUR_LEFT_MAX);
        int armourRight=drawNumber(ZombieRaceStats.ARMOUR_RIGHT_MIN,ZombieRaceStats.ARMOUR_RIGHT_MAX);
        int armourRear=drawNumber(ZombieRaceStats.ARMOUR_REAR_MIN,ZombieRaceStats.ARMOUR_REAR_MAX);
        int armourUnder=drawNumber(ZombieRaceStats.ARMOUR_UNDER_MIN,ZombieRaceStats.ARMOUR_UNDER_MAX);
        int energyRecovery=drawNumber(ZombieRaceStats.ENERGY_RECOVERY_MIN,ZombieRaceStats.ENERGY_RECOVERY_MAX);
        int victoryPoints=drawNumber(ZombieRaceStats.VICTORY_POINTS_MIN,ZombieRaceStats.VICTORY_POINTS_MAX);
        int aggression=drawNumber(ZombieRaceStats.AGGRESSION_MIN,ZombieRaceStats.AGGRESSION_MAX);
        int intelligence=drawNumber(ZombieRaceStats.INTELLIGENCE_MIN,ZombieRaceStats.INTELLIGENCE_MAX);
        int heightStanding=drawNumber(ZombieRaceStats.HEIGHT_STANDING_MIN,ZombieRaceStats.HEIGHT_STANDING_MAX);
        int heightKneeling=drawNumber(ZombieRaceStats.HEIGHT_KNEELING_MIN,ZombieRaceStats.HEIGHT_KNEELING_MAX);

        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(myRank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }



}
