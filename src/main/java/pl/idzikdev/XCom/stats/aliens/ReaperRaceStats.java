package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class ReaperRaceStats {
    public static final int TIME_UNITS_MIN=62;
    public static final int TIME_UNITS_MAX=71;
    public static final int HEALTH_MIN=148;
    public static final int HEALTH_MAX=148;
    public static final int ENERGY_MIN=90;
    public static final int ENERGY_MAX=104;
    public static final int REACTIONS_MIN=64;
    public static final int REACTIONS_MAX=79;
    public static final int STRENGTH_MIN=90;
    public static final int STRENGTH_MAX=97;
    public static final int BRAVERY_MIN=90;
    public static final int BRAVERY_MAX=90;
    public static final int FIRING_ACCURACY_MIN=0;
    public static final int FIRING_ACCURACY_MAX=0;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=35;
    public static final int PSI_STRENGTH_MAX=40;
    public static final int MELEE_ACCURACY_MIN=80;
    public static final int MELEE_ACCURACY_MAX=80;
    public static final int ARMOUR_FRONT_MIN=28;
    public static final int ARMOUR_FRONT_MAX=28;
    public static final int ARMOUR_LEFT_MIN=28;
    public static final int ARMOUR_LEFT_MAX=28;
    public static final int ARMOUR_RIGHT_MIN=28;
    public static final int ARMOUR_RIGHT_MAX=28;
    public static final int ARMOUR_REAR_MIN=28;
    public static final int ARMOUR_REAR_MAX=28;
    public static final int ARMOUR_UNDER_MIN=4;
    public static final int ARMOUR_UNDER_MAX=4;
    public static final int ENERGY_RECOVERY_MIN=34;
    public static final int ENERGY_RECOVERY_MAX=34;
    public static final int VICTORY_POINTS_MIN=25;
    public static final int VICTORY_POINTS_MAX=25;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=2;
    public static final int INTELLIGENCE_MAX=2;
    public static final int HEIGHT_STANDING_MIN=22;
    public static final int HEIGHT_STANDING_MAX=22;
    public static final int HEIGHT_KNEELING_MIN=22;
    public static final int HEIGHT_KNEELING_MAX=22;
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

    public ReaperRaceStats() {
        this.timeUnits= Tools.drawNumber(ReaperRaceStats.TIME_UNITS_MIN,ReaperRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(ReaperRaceStats.HEALTH_MIN,ReaperRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(ReaperRaceStats.ENERGY_MIN,ReaperRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(ReaperRaceStats.REACTIONS_MIN,ReaperRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(ReaperRaceStats.STRENGTH_MIN,ReaperRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(ReaperRaceStats.BRAVERY_MIN,ReaperRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(ReaperRaceStats.FIRING_ACCURACY_MIN,ReaperRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(ReaperRaceStats.THROWING_ACCURACY_MIN,ReaperRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(ReaperRaceStats.PSI_SKILL_MIN,ReaperRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(ReaperRaceStats.PSI_STRENGTH_MIN,ReaperRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(ReaperRaceStats.MELEE_ACCURACY_MIN,ReaperRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(ReaperRaceStats.ARMOUR_FRONT_MIN,ReaperRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(ReaperRaceStats.ARMOUR_LEFT_MIN,ReaperRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(ReaperRaceStats.ARMOUR_RIGHT_MIN,ReaperRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(ReaperRaceStats.ARMOUR_REAR_MIN,ReaperRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(ReaperRaceStats.ARMOUR_UNDER_MIN,ReaperRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(ReaperRaceStats.ENERGY_RECOVERY_MIN,ReaperRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(ReaperRaceStats.VICTORY_POINTS_MIN,ReaperRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(ReaperRaceStats.AGGRESSION_MIN,ReaperRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(ReaperRaceStats.INTELLIGENCE_MIN,ReaperRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(ReaperRaceStats.HEIGHT_STANDING_MIN,ReaperRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(ReaperRaceStats.HEIGHT_KNEELING_MIN,ReaperRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildReaperEntity(String breed, String rank) {
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
