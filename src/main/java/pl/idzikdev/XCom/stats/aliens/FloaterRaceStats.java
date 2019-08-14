package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class FloaterRaceStats {
    public static final int TIME_UNITS_MIN=50;
    public static final int TIME_UNITS_MAX=69;
    public static final int HEALTH_MIN=35;
    public static final int HEALTH_MAX=45;
    public static final int ENERGY_MIN=90;
    public static final int ENERGY_MAX=116;
    public static final int REACTIONS_MIN=50;
    public static final int REACTIONS_MAX=81;
    public static final int STRENGTH_MIN=40;
    public static final int STRENGTH_MAX=51;
    public static final int BRAVERY_MIN=80;
    public static final int BRAVERY_MAX=80;
    public static final int FIRING_ACCURACY_MIN=25;
    public static final int FIRING_ACCURACY_MAX=78;
    public static final int THROWING_ACCURACY_MIN=58;
    public static final int THROWING_ACCURACY_MAX=65;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=35;
    public static final int PSI_STRENGTH_MAX=52;
    public static final int MELEE_ACCURACY_MIN=70;
    public static final int MELEE_ACCURACY_MAX=70;
    public static final int ARMOUR_FRONT_MIN=8;
    public static final int ARMOUR_FRONT_MAX=24;
    public static final int ARMOUR_LEFT_MIN=6;
    public static final int ARMOUR_LEFT_MAX=18;
    public static final int ARMOUR_RIGHT_MIN=6;
    public static final int ARMOUR_RIGHT_MAX=18;
    public static final int ARMOUR_REAR_MIN=4;
    public static final int ARMOUR_REAR_MAX=12;
    public static final int ARMOUR_UNDER_MIN=12;
    public static final int ARMOUR_UNDER_MAX=16;
    public static final int ENERGY_RECOVERY_MIN=30;
    public static final int ENERGY_RECOVERY_MAX=30;
    public static final int VICTORY_POINTS_MIN=12;
    public static final int VICTORY_POINTS_MAX=35;
    public static final int AGGRESSION_MIN=0;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=4;
    public static final int INTELLIGENCE_MAX=8;
    public static final int HEIGHT_STANDING_MIN=18;
    public static final int HEIGHT_STANDING_MAX=18;
    public static final int HEIGHT_KNEELING_MIN=14;
    public static final int HEIGHT_KNEELING_MAX=14;
    public static final boolean VALID_RANK_SOLDIER=true;
    public static final boolean VALID_RANK_NAVIGATOR=true;
    public static final boolean VALID_RANK_MEDIC=true;
    public static final boolean VALID_RANK_ENGINEER=true;
    public static final boolean VALID_RANK_TERRORIST=false;
    public static final boolean VALID_RANK_LEADER=true;
    public static final boolean VALID_RANK_COMMANDER=true;
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

    public FloaterRaceStats() {
        this.timeUnits= Tools.drawNumber(FloaterRaceStats.TIME_UNITS_MIN,FloaterRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(FloaterRaceStats.HEALTH_MIN,FloaterRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(FloaterRaceStats.ENERGY_MIN,FloaterRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(FloaterRaceStats.REACTIONS_MIN,FloaterRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(FloaterRaceStats.STRENGTH_MIN,FloaterRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(FloaterRaceStats.BRAVERY_MIN,FloaterRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(FloaterRaceStats.FIRING_ACCURACY_MIN,FloaterRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(FloaterRaceStats.THROWING_ACCURACY_MIN,FloaterRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(FloaterRaceStats.PSI_SKILL_MIN,FloaterRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(FloaterRaceStats.PSI_STRENGTH_MIN,FloaterRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(FloaterRaceStats.MELEE_ACCURACY_MIN,FloaterRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(FloaterRaceStats.ARMOUR_FRONT_MIN,FloaterRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(FloaterRaceStats.ARMOUR_LEFT_MIN,FloaterRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(FloaterRaceStats.ARMOUR_RIGHT_MIN,FloaterRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(FloaterRaceStats.ARMOUR_REAR_MIN,FloaterRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(FloaterRaceStats.ARMOUR_UNDER_MIN,FloaterRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(FloaterRaceStats.ENERGY_RECOVERY_MIN,FloaterRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(FloaterRaceStats.VICTORY_POINTS_MIN,FloaterRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(FloaterRaceStats.AGGRESSION_MIN,FloaterRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(FloaterRaceStats.INTELLIGENCE_MIN,FloaterRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(FloaterRaceStats.HEIGHT_STANDING_MIN,FloaterRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(FloaterRaceStats.HEIGHT_KNEELING_MIN,FloaterRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildFloaterEntity(String breed, String rank) {
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
