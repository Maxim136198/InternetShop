package by.itstep.internetShop.dao.repository;

import by.itstep.internetShop.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByName(String name);

    Optional<User> findByName(String name);

}