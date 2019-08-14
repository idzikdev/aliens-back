package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class SilacoidRaceStats {
    public static final int TIME_UNITS_MIN=40;
    public static final int TIME_UNITS_MAX=46;
    public static final int HEALTH_MIN=114;
    public static final int HEALTH_MAX=114;
    public static final int ENERGY_MIN=80;
    public static final int ENERGY_MAX=92;
    public static final int REACTIONS_MIN=40;
    public static final int REACTIONS_MAX=49;
    public static final int STRENGTH_MIN=70;
    public static final int STRENGTH_MAX=75;
    public static final int BRAVERY_MIN=100;
    public static final int BRAVERY_MAX=100;
    public static final int FIRING_ACCURACY_MIN=0;
    public static final int FIRING_ACCURACY_MAX=0;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=80;
    public static final int PSI_STRENGTH_MAX=92;
    public static final int MELEE_ACCURACY_MIN=50;
    public static final int MELEE_ACCURACY_MAX=50;
    public static final int ARMOUR_FRONT_MIN=50;
    public static final int ARMOUR_FRONT_MAX=50;
    public static final int ARMOUR_LEFT_MIN=50;
    public static final int ARMOUR_LEFT_MAX=50;
    public static final int ARMOUR_RIGHT_MIN=50;
    public static final int ARMOUR_RIGHT_MAX=50;
    public static final int ARMOUR_REAR_MIN=50;
    public static final int ARMOUR_REAR_MAX=50;
    public static final int ARMOUR_UNDER_MIN=10;
    public static final int ARMOUR_UNDER_MAX=10;
    public static final int ENERGY_RECOVERY_MIN=40;
    public static final int ENERGY_RECOVERY_MAX=40;
    public static final int VICTORY_POINTS_MIN=20;
    public static final int VICTORY_POINTS_MAX=20;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=3;
    public static final int INTELLIGENCE_MAX=3;
    public static final int HEIGHT_STANDING_MIN=12;
    public static final int HEIGHT_STANDING_MAX=12;
    public static final int HEIGHT_KNEELING_MIN=8;
    public static final int HEIGHT_KNEELING_MAX=8;
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

    public SilacoidRaceStats() {
        this.timeUnits= Tools.drawNumber(SilacoidRaceStats.TIME_UNITS_MIN,SilacoidRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(SilacoidRaceStats.HEALTH_MIN,SilacoidRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(SilacoidRaceStats.ENERGY_MIN,SilacoidRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(SilacoidRaceStats.REACTIONS_MIN,SilacoidRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(SilacoidRaceStats.STRENGTH_MIN,SilacoidRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(SilacoidRaceStats.BRAVERY_MIN,SilacoidRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(SilacoidRaceStats.FIRING_ACCURACY_MIN,SilacoidRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(SilacoidRaceStats.THROWING_ACCURACY_MIN,SilacoidRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(SilacoidRaceStats.PSI_SKILL_MIN,SilacoidRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(SilacoidRaceStats.PSI_STRENGTH_MIN,SilacoidRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(SilacoidRaceStats.MELEE_ACCURACY_MIN,SilacoidRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(SilacoidRaceStats.ARMOUR_FRONT_MIN,SilacoidRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(SilacoidRaceStats.ARMOUR_LEFT_MIN,SilacoidRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(SilacoidRaceStats.ARMOUR_RIGHT_MIN,SilacoidRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(SilacoidRaceStats.ARMOUR_REAR_MIN,SilacoidRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(SilacoidRaceStats.ARMOUR_UNDER_MIN,SilacoidRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(SilacoidRaceStats.ENERGY_RECOVERY_MIN,SilacoidRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(SilacoidRaceStats.VICTORY_POINTS_MIN,SilacoidRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(SilacoidRaceStats.AGGRESSION_MIN,SilacoidRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(SilacoidRaceStats.INTELLIGENCE_MIN,SilacoidRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(SilacoidRaceStats.HEIGHT_STANDING_MIN,SilacoidRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(SilacoidRaceStats.HEIGHT_KNEELING_MIN,SilacoidRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildSilacoidEntity(String breed, String rank) {
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
