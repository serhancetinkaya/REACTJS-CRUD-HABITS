package net.javaguides.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.habit;

@Repository
public interface HabitRepository extends JpaRepository<habit, Long>{

	habit findById(long id);
	

}
