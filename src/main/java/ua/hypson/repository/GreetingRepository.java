package ua.hypson.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.hypson.domain.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long>{
}
