package mk.finki.ukim.mk.lab.repository;
import mk.finki.ukim.mk.lab.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {


}
