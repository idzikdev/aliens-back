package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class ZombieRaceStats {
    public static final int TIME_UNITS_MIN=40;
    public static final int TIME_UNITS_MAX=40;
    public static final int HEALTH_MIN=84;
    public static final int HEALTH_MAX=84;
    public static final int ENERGY_MIN=110;
    public static final int ENERGY_MAX=110;
    public static final int REACTIONS_MIN=40;
    public static final int REACTIONS_MAX=40;
    public static final int STRENGTH_MIN=84;
    public static final int STRENGTH_MAX=84;
    public static final int BRAVERY_MIN=110;
    public static final int BRAVERY_MAX=110;
    public static final int FIRING_ACCURACY_MIN=0;
    public static final int FIRING_ACCURACY_MAX=0;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=80;
    public static final int PSI_STRENGTH_MAX=80;
    public static final int MELEE_ACCURACY_MIN=80;
    public static final int MELEE_ACCURACY_MAX=80;
    public static final int ARMOUR_FRONT_MIN=4;
    public static final int ARMOUR_FRONT_MAX=4;
    public static final int ARMOUR_LEFT_MIN=4;
    public static final int ARMOUR_LEFT_MAX=4;
    public static final int ARMOUR_RIGHT_MIN=4;
    public static final int ARMOUR_RIGHT_MAX=4;
    public static final int ARMOUR_REAR_MIN=4;
    public static final int ARMOUR_REAR_MAX=4;
    public static final int ARMOUR_UNDER_MIN=4;
    public static final int ARMOUR_UNDER_MAX=4;
    public static final int ENERGY_RECOVERY_MIN=20;
    public static final int ENERGY_RECOVERY_MAX=20;
    public static final int VICTORY_POINTS_MIN=18;
    public static final int VICTORY_POINTS_MAX=18;
    public static final int AGGRESSION_MIN=2;
    public static final int AGGRESSION_MAX=2;
    public static final int INTELLIGENCE_MIN=3;
    public static final int INTELLIGENCE_MAX=3;
    public static final int HEIGHT_STANDING_MIN=16;
    public static final int HEIGHT_STANDING_MAX=16;
    public static final int HEIGHT_KNEELING_MIN=12;
    public static final int HEIGHT_KNEELING_MAX=12;
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

    public ZombieRaceStats() {
        this.timeUnits= Tools.drawNumber(ZombieRaceStats.TIME_UNITS_MIN,ZombieRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(ZombieRaceStats.HEALTH_MIN,ZombieRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(ZombieRaceStats.ENERGY_MIN,ZombieRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(ZombieRaceStats.REACTIONS_MIN,ZombieRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(ZombieRaceStats.STRENGTH_MIN,ZombieRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(ZombieRaceStats.BRAVERY_MIN,ZombieRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(ZombieRaceStats.FIRING_ACCURACY_MIN,ZombieRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(ZombieRaceStats.THROWING_ACCURACY_MIN,ZombieRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(ZombieRaceStats.PSI_SKILL_MIN,ZombieRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(ZombieRaceStats.PSI_STRENGTH_MIN,ZombieRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(ZombieRaceStats.MELEE_ACCURACY_MIN,ZombieRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(ZombieRaceStats.ARMOUR_FRONT_MIN,ZombieRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(ZombieRaceStats.ARMOUR_LEFT_MIN,ZombieRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(ZombieRaceStats.ARMOUR_RIGHT_MIN,ZombieRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(ZombieRaceStats.ARMOUR_REAR_MIN,ZombieRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(ZombieRaceStats.ARMOUR_UNDER_MIN,ZombieRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(ZombieRaceStats.ENERGY_RECOVERY_MIN,ZombieRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(ZombieRaceStats.VICTORY_POINTS_MIN,ZombieRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(ZombieRaceStats.AGGRESSION_MIN,ZombieRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(ZombieRaceStats.INTELLIGENCE_MIN,ZombieRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(ZombieRaceStats.HEIGHT_STANDING_MIN,ZombieRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(ZombieRaceStats.HEIGHT_KNEELING_MIN,ZombieRaceStats.HEIGHT_KNEELING_MAX);
    }


    public AlienEntity buildZombieEntity(String breed, String rank) {
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
