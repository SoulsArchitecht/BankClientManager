package ru.sshibko.BankClientManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sshibko.BankClientManager.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
