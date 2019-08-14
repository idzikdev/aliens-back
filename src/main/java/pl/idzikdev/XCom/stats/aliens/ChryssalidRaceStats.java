package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

import java.util.Random;

public class ChryssalidRaceStats {
    public static final int TIME_UNITS_MIN=110;
    public static final int TIME_UNITS_MAX=127;
    public static final int HEALTH_MIN=96;
    public static final int HEALTH_MAX=96;
    public static final int ENERGY_MIN=140;
    public static final int ENERGY_MAX=162;
    public static final int REACTIONS_MIN=70;
    public static final int REACTIONS_MAX=86;
    public static final int STRENGTH_MIN=110;
    public static final int STRENGTH_MAX=118;
    public static final int BRAVERY_MIN=100;
    public static final int BRAVERY_MAX=100;
    public static final int FIRING_ACCURACY_MIN=0;
    public static final int FIRING_ACCURACY_MAX=0;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=50;
    public static final int PSI_STRENGTH_MAX=69;
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
    public static final int ENERGY_RECOVERY_MIN=40;
    public static final int ENERGY_RECOVERY_MAX=40;
    public static final int VICTORY_POINTS_MIN=25;
    public static final int VICTORY_POINTS_MAX=25;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=4;
    public static final int INTELLIGENCE_MAX=4;
    public static final int HEIGHT_STANDING_MIN=16;
    public static final int HEIGHT_STANDING_MAX=16;
    public static final int HEIGHT_KNEELING_MIN=16;
    public static final int HEIGHT_KNEELING_MAX=16;
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

       public ChryssalidRaceStats() {
        this.timeUnits= Tools.drawNumber(ChryssalidRaceStats.TIME_UNITS_MIN,ChryssalidRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(ChryssalidRaceStats.HEALTH_MIN,ChryssalidRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(ChryssalidRaceStats.ENERGY_MIN,ChryssalidRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(ChryssalidRaceStats.REACTIONS_MIN,ChryssalidRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(ChryssalidRaceStats.STRENGTH_MIN,ChryssalidRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(ChryssalidRaceStats.BRAVERY_MIN,ChryssalidRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(ChryssalidRaceStats.FIRING_ACCURACY_MIN,ChryssalidRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(ChryssalidRaceStats.THROWING_ACCURACY_MIN,ChryssalidRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(ChryssalidRaceStats.PSI_SKILL_MIN,ChryssalidRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(ChryssalidRaceStats.PSI_STRENGTH_MIN,ChryssalidRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(ChryssalidRaceStats.MELEE_ACCURACY_MIN,ChryssalidRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(ChryssalidRaceStats.ARMOUR_FRONT_MIN,ChryssalidRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(ChryssalidRaceStats.ARMOUR_LEFT_MIN,ChryssalidRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(ChryssalidRaceStats.ARMOUR_RIGHT_MIN,ChryssalidRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(ChryssalidRaceStats.ARMOUR_REAR_MIN,ChryssalidRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(ChryssalidRaceStats.ARMOUR_UNDER_MIN,ChryssalidRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(ChryssalidRaceStats.ENERGY_RECOVERY_MIN,ChryssalidRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(ChryssalidRaceStats.VICTORY_POINTS_MIN,ChryssalidRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(ChryssalidRaceStats.AGGRESSION_MIN,ChryssalidRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(ChryssalidRaceStats.INTELLIGENCE_MIN,ChryssalidRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(ChryssalidRaceStats.HEIGHT_STANDING_MIN,ChryssalidRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(ChryssalidRaceStats.HEIGHT_KNEELING_MIN,ChryssalidRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildChryssalidEntity(String breed, String rank) {
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
