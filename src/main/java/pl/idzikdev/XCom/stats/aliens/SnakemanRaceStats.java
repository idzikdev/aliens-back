package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class SnakemanRaceStats {
    public static final int TIME_UNITS_MIN=40;
    public static final int TIME_UNITS_MAX=52;
    public static final int HEALTH_MIN=45;
    public static final int HEALTH_MAX=55;
    public static final int ENERGY_MIN=80;
    public static final int ENERGY_MAX=97;
    public static final int REACTIONS_MIN=45;
    public static final int REACTIONS_MAX=80;
    public static final int STRENGTH_MIN=47;
    public static final int STRENGTH_MAX=50;
    public static final int BRAVERY_MIN=80;
    public static final int BRAVERY_MAX=80;
    public static final int FIRING_ACCURACY_MIN=29;
    public static final int FIRING_ACCURACY_MAX=71;
    public static final int THROWING_ACCURACY_MIN=65;
    public static final int THROWING_ACCURACY_MAX=65;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=40;
    public static final int PSI_STRENGTH_MAX=58;
    public static final int MELEE_ACCURACY_MIN=54;
    public static final int MELEE_ACCURACY_MAX=54;
    public static final int ARMOUR_FRONT_MIN=20;
    public static final int ARMOUR_FRONT_MAX=26;
    public static final int ARMOUR_LEFT_MIN=18;
    public static final int ARMOUR_LEFT_MAX=26;
    public static final int ARMOUR_RIGHT_MIN=18;
    public static final int ARMOUR_RIGHT_MAX=26;
    public static final int ARMOUR_REAR_MIN=16;
    public static final int ARMOUR_REAR_MAX=22;
    public static final int ARMOUR_UNDER_MIN=12;
    public static final int ARMOUR_UNDER_MAX=20;
    public static final int ENERGY_RECOVERY_MIN=30;
    public static final int ENERGY_RECOVERY_MAX=30;
    public static final int VICTORY_POINTS_MIN=15;
    public static final int VICTORY_POINTS_MAX=36;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=2;
    public static final int INTELLIGENCE_MAX=6;
    public static final int HEIGHT_STANDING_MIN=18;
    public static final int HEIGHT_STANDING_MAX=18;
    public static final int HEIGHT_KNEELING_MIN=14;
    public static final int HEIGHT_KNEELING_MAX=14;
    public static final boolean VALID_RANK_SOLDIER=true;
    public static final boolean VALID_RANK_NAVIGATOR=true;
    public static final boolean VALID_RANK_MEDIC=false;
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

    public SnakemanRaceStats() {
        this.timeUnits= Tools.drawNumber(SnakemanRaceStats.TIME_UNITS_MIN,SnakemanRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(SnakemanRaceStats.HEALTH_MIN,SnakemanRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(SnakemanRaceStats.ENERGY_MIN,SnakemanRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(SnakemanRaceStats.REACTIONS_MIN,SnakemanRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(SnakemanRaceStats.STRENGTH_MIN,SnakemanRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(SnakemanRaceStats.BRAVERY_MIN,SnakemanRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(SnakemanRaceStats.FIRING_ACCURACY_MIN,SnakemanRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(SnakemanRaceStats.THROWING_ACCURACY_MIN,SnakemanRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(SnakemanRaceStats.PSI_SKILL_MIN,SnakemanRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(SnakemanRaceStats.PSI_STRENGTH_MIN,SnakemanRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(SnakemanRaceStats.MELEE_ACCURACY_MIN,SnakemanRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(SnakemanRaceStats.ARMOUR_FRONT_MIN,SnakemanRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(SnakemanRaceStats.ARMOUR_LEFT_MIN,SnakemanRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(SnakemanRaceStats.ARMOUR_RIGHT_MIN,SnakemanRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(SnakemanRaceStats.ARMOUR_REAR_MIN,SnakemanRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(SnakemanRaceStats.ARMOUR_UNDER_MIN,SnakemanRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(SnakemanRaceStats.ENERGY_RECOVERY_MIN,SnakemanRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(SnakemanRaceStats.VICTORY_POINTS_MIN,SnakemanRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(SnakemanRaceStats.AGGRESSION_MIN,SnakemanRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(SnakemanRaceStats.INTELLIGENCE_MIN,SnakemanRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(SnakemanRaceStats.HEIGHT_STANDING_MIN,SnakemanRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(SnakemanRaceStats.HEIGHT_KNEELING_MIN,SnakemanRaceStats.HEIGHT_KNEELING_MAX);
    }


    public AlienEntity buildSnakemanEntity(String breed, String rank) {
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
