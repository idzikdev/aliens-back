package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

import java.util.Random;

public class CyberdiscRaceStats {
    public static final int TIME_UNITS_MIN=62;
    public static final int TIME_UNITS_MAX=71;
    public static final int HEALTH_MIN=120;
    public static final int HEALTH_MAX=120;
    public static final int ENERGY_MIN=90;
    public static final int ENERGY_MAX=104;
    public static final int REACTIONS_MIN=64;
    public static final int REACTIONS_MAX=79;
    public static final int STRENGTH_MIN=90;
    public static final int STRENGTH_MAX=97;
    public static final int BRAVERY_MIN=110;
    public static final int BRAVERY_MAX=110;
    public static final int FIRING_ACCURACY_MIN=30;
    public static final int FIRING_ACCURACY_MAX=70;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=100;
    public static final int PSI_STRENGTH_MAX=116;
    public static final int MELEE_ACCURACY_MIN=80;
    public static final int MELEE_ACCURACY_MAX=80;
    public static final int ARMOUR_FRONT_MIN=34;
    public static final int ARMOUR_FRONT_MAX=34;
    public static final int ARMOUR_LEFT_MIN=34;
    public static final int ARMOUR_LEFT_MAX=34;
    public static final int ARMOUR_RIGHT_MIN=34;
    public static final int ARMOUR_RIGHT_MAX=34;
    public static final int ARMOUR_REAR_MIN=34;
    public static final int ARMOUR_REAR_MAX=34;
    public static final int ARMOUR_UNDER_MIN=34;
    public static final int ARMOUR_UNDER_MAX=34;
    public static final int ENERGY_RECOVERY_MIN=50;
    public static final int ENERGY_RECOVERY_MAX=50;
    public static final int VICTORY_POINTS_MIN=20;
    public static final int VICTORY_POINTS_MAX=20;
    public static final int AGGRESSION_MIN=1;
    public static final int AGGRESSION_MAX=1;
    public static final int INTELLIGENCE_MIN=5;
    public static final int INTELLIGENCE_MAX=5;
    public static final int HEIGHT_STANDING_MIN=20;
    public static final int HEIGHT_STANDING_MAX=20;
    public static final int HEIGHT_KNEELING_MIN=20;
    public static final int HEIGHT_KNEELING_MAX=20;
    public static final boolean VALID_RANK_SOLDIER=false;
    public static final boolean VALID_RANK_NAVIGATOR=false;
    public static final boolean VALID_RANK_MEDIC=false;
    public static final boolean VALID_RANK_ENGINEER=false;
    public static final boolean VALID_RANK_TERRORIST=true;
    public static final boolean VALID_RANK_LEADER=false;
    public static final boolean VALID_RANK_COMMANDER=false;
    private int timeUnits;
    private int health;
    private int energy;
    private int reactions;
    private int strength;
    private int bravery;
    private int firingAccuracy;
    private int throwingAccuracy;
    private int psiSkill;
    private int psiStrength;
    private int meleeAccuracy;
    private int armourFront;
    private int armourLeft;
    private int armourRight;
    private int armourRear;
    private int armourUnder;
    private int energyRecovery;
    private int victoryPoints;
    private int aggression;
    private int intelligence;
    private int heightStanding;
    private int heightKneeling;
   
    public CyberdiscRaceStats() {
        this.timeUnits= Tools.drawNumber(CyberdiscRaceStats.TIME_UNITS_MIN,CyberdiscRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(CyberdiscRaceStats.HEALTH_MIN,CyberdiscRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(CyberdiscRaceStats.ENERGY_MIN,CyberdiscRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(CyberdiscRaceStats.REACTIONS_MIN,CyberdiscRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(CyberdiscRaceStats.STRENGTH_MIN,CyberdiscRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(CyberdiscRaceStats.BRAVERY_MIN,CyberdiscRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(CyberdiscRaceStats.FIRING_ACCURACY_MIN,CyberdiscRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(CyberdiscRaceStats.THROWING_ACCURACY_MIN,CyberdiscRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(CyberdiscRaceStats.PSI_SKILL_MIN,CyberdiscRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(CyberdiscRaceStats.PSI_STRENGTH_MIN,CyberdiscRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(CyberdiscRaceStats.MELEE_ACCURACY_MIN,CyberdiscRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(CyberdiscRaceStats.ARMOUR_FRONT_MIN,CyberdiscRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(CyberdiscRaceStats.ARMOUR_LEFT_MIN,CyberdiscRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(CyberdiscRaceStats.ARMOUR_RIGHT_MIN,CyberdiscRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(CyberdiscRaceStats.ARMOUR_REAR_MIN,CyberdiscRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(CyberdiscRaceStats.ARMOUR_UNDER_MIN,CyberdiscRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(CyberdiscRaceStats.ENERGY_RECOVERY_MIN,CyberdiscRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(CyberdiscRaceStats.VICTORY_POINTS_MIN,CyberdiscRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(CyberdiscRaceStats.AGGRESSION_MIN,CyberdiscRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(CyberdiscRaceStats.INTELLIGENCE_MIN,CyberdiscRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(CyberdiscRaceStats.HEIGHT_STANDING_MIN,CyberdiscRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(CyberdiscRaceStats.HEIGHT_KNEELING_MIN,CyberdiscRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildCyberdiscEntity(String breed, String rank) {
        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(rank)
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
