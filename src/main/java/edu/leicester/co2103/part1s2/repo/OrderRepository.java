package edu.leicester.co2103.part1s2.repo;

import edu.leicester.co2103.part1s2.domain.OrderUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderUnit, Long> {
    List<OrderUnit> findAll();
    List<OrderUnit> findByBooks_ISBN(String ISBN);
}
