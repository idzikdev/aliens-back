package pl.idzikdev.XCom.entity;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "alien")
public class AlienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "idship")
    private ShipEntity ship;
    @Column(name = "breed")
    String breed;
    @Column(name = "rank")
    String rank;
    @Column(name = "timeunits")
    int timeUnits;
    @Column(name = "health")
    int health;
    @Column(name = "energy")
    int energy;
    @Column(name = "reactions")
    int reactions;
    @Column(name = "strength")
    int strength;
    @Column(name = "bravery")
    int bravery;
    @Column(name = "firingaccuracy")
    int firingAccuracy;
    @Column(name = "throwingaccuracy")
    int throwingAccuracy;
    @Column(name = "psiskill")
    int psiSkill;
    @Column(name = "psistrength")
    int psiStrength;
    @Column(name = "meleeaccuracy")
    int meleeAccuracy;
    @Column(name = "armourfront")
    int armourFront;
    @Column(name = "armourleft")
    int armourLeft;
    @Column(name = "armourright")
    int armourRight;
    @Column(name = "armourrear")
    int armourRear;
    @Column(name = "armourunder")
    int armourUnder;
    @Column(name = "energyrecovery")
    int energyRecovery;
    @Column(name = "victorypoints")
    int victoryPoints;
    @Column(name = "aggression")
    int aggression;
    @Column(name = "intelligence")
    int intelligence;
    @Column(name = "heightstanding")
    int heightStanding;
    @Column(name = "heightkneeling")
    int heightKneeling;

    public AlienEntity(String breed, int health) {
        this.breed = breed;
        this.health = health;
    }
}
