package ru.sshibko.BankClientManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sshibko.BankClientManager.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
