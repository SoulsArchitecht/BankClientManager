package ru.sshibko.BankClientManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sshibko.BankClientManager.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
