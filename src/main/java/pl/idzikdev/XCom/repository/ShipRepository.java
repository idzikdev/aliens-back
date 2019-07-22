package pl.idzikdev.XCom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.idzikdev.XCom.entity.ShipEntity;

import java.util.List;
import java.util.Optional;

public interface ShipRepository extends JpaRepository<ShipEntity,Integer> {
    Optional<ShipEntity> findById(Integer aLong);

    @Override
    List<ShipEntity> findAll();
}
