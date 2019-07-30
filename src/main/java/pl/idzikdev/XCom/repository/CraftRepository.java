package pl.idzikdev.XCom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.idzikdev.XCom.entity.CraftEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface CraftRepository extends JpaRepository<CraftEntity,Integer> {
    Optional<CraftEntity> findById(Integer aLong);

    @Override
    List<CraftEntity> findAll();
}
