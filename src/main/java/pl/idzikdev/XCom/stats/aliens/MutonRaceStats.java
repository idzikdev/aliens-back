package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class MutonRaceStats {
    public static final int TIME_UNITS_MIN=56;
    public static final int TIME_UNITS_MAX=64;
    public static final int HEALTH_MIN=125;
    public static final int HEALTH_MAX=125;
    public static final int ENERGY_MIN=90;
    public static final int ENERGY_MAX=104;
    public static final int REACTIONS_MIN=60;
    public static final int REACTIONS_MAX=74;
    public static final int STRENGTH_MIN=70;
    public static final int STRENGTH_MAX=75;
    public static final int BRAVERY_MIN=80;
    public static final int BRAVERY_MAX=80;
    public static final int FIRING_ACCURACY_MIN=27;
    public static final int FIRING_ACCURACY_MAX=66;
    public static final int THROWING_ACCURACY_MIN=62;
    public static final int THROWING_ACCURACY_MAX=62;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=25;
    public static final int PSI_STRENGTH_MAX=29;
    public static final int MELEE_ACCURACY_MIN=78;
    public static final int MELEE_ACCURACY_MAX=78;
    public static final int ARMOUR_FRONT_MIN=20;
    public static final int ARMOUR_FRONT_MAX=20;
    public static final int ARMOUR_LEFT_MIN=20;
    public static final int ARMOUR_LEFT_MAX=20;
    public static final int ARMOUR_RIGHT_MIN=20;
    public static final int ARMOUR_RIGHT_MAX=20;
    public static final int ARMOUR_REAR_MIN=20;
    public static final int ARMOUR_REAR_MAX=20;
    public static final int ARMOUR_UNDER_MIN=10;
    public static final int ARMOUR_UNDER_MAX=20;
    public static final int ENERGY_RECOVERY_MIN=40;
    public static final int ENERGY_RECOVERY_MAX=40;
    public static final int VICTORY_POINTS_MIN=15;
    public static final int VICTORY_POINTS_MAX=19;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=2;
    public static final int INTELLIGENCE_MAX=4;
    public static final int HEIGHT_STANDING_MIN=18;
    public static final int HEIGHT_STANDING_MAX=18;
    public static final int HEIGHT_KNEELING_MIN=14;
    public static final int HEIGHT_KNEELING_MAX=14;
    public static final boolean VALID_RANK_SOLDIER=true;
    public static final boolean VALID_RANK_NAVIGATOR=true;
    public static final boolean VALID_RANK_MEDIC=false;
    public static final boolean VALID_RANK_ENGINEER=true;
    public static final boolean VALID_RANK_TERRORIST=false;
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

    public MutonRaceStats() {
        this.timeUnits= Tools.drawNumber(MutonRaceStats.TIME_UNITS_MIN,MutonRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(MutonRaceStats.HEALTH_MIN,MutonRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(MutonRaceStats.ENERGY_MIN,MutonRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(MutonRaceStats.REACTIONS_MIN,MutonRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(MutonRaceStats.STRENGTH_MIN,MutonRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(MutonRaceStats.BRAVERY_MIN,MutonRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(MutonRaceStats.FIRING_ACCURACY_MIN,MutonRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(MutonRaceStats.THROWING_ACCURACY_MIN,MutonRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(MutonRaceStats.PSI_SKILL_MIN,MutonRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(MutonRaceStats.PSI_STRENGTH_MIN,MutonRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(MutonRaceStats.MELEE_ACCURACY_MIN,MutonRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(MutonRaceStats.ARMOUR_FRONT_MIN,MutonRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(MutonRaceStats.ARMOUR_LEFT_MIN,MutonRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(MutonRaceStats.ARMOUR_RIGHT_MIN,MutonRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(MutonRaceStats.ARMOUR_REAR_MIN,MutonRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(MutonRaceStats.ARMOUR_UNDER_MIN,MutonRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(MutonRaceStats.ENERGY_RECOVERY_MIN,MutonRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(MutonRaceStats.VICTORY_POINTS_MIN,MutonRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(MutonRaceStats.AGGRESSION_MIN,MutonRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(MutonRaceStats.INTELLIGENCE_MIN,MutonRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(MutonRaceStats.HEIGHT_STANDING_MIN,MutonRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(MutonRaceStats.HEIGHT_KNEELING_MIN,MutonRaceStats.HEIGHT_KNEELING_MAX);

    }

    public AlienEntity buildMutonEntity(String breed, String rank) {
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
