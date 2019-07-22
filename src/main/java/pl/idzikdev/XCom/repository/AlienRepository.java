package pl.idzikdev.XCom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.idzikdev.XCom.entity.AlienEntity;

import java.util.List;
import java.util.Optional;

public interface AlienRepository extends JpaRepository<AlienEntity,Integer> {

    Optional<AlienEntity> findById(Integer aLong);

    @Override
    List<AlienEntity> findAll();

}
