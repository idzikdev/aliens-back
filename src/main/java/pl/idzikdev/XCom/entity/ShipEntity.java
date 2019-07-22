package pl.idzikdev.XCom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "ship")
public class ShipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "size")
    String size;
    @Column(name = "name")
    String name;
    @Column(name = "maxspeed")
    int maxSpeed;
    @Column(name = "weaponpower")
    int weaponPower;
    @Column(name = "weaponrangekm")
    int weaponRangeKm;
    @Column(name = "weaponrangeunits")
    int weaponRangeUnits;
    @Column(name = "damagedcapacity")
    int damageCapacity;
    @Column(name = "downedpoints")
    int downedPoints;
    @Column(name = "destroyedpoints")
    int destroyedPoints;
    @Column(name = "jpg0")
    String jpg0;
    @Column(name = "jpg1")
    String jpg1;
    @Column(name = "jpg2")
    String jpg2;
    @Column(name = "jpg3")
    String jpg3;
}
