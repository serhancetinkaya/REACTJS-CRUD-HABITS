package net.javaguides.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import net.javaguides.springboot.model.habit;
import net.javaguides.springboot.repository.HabitRepository;
import net.javaguides.springboot.service.habitService;

@RestController
@RequestMapping("/api/v1")
public class HabitController {
	
	@Autowired
	private habitService habitService;
	
	@Autowired
	private HabitRepository HabitRepository;
	
	@GetMapping("/habits")
	public java.util.List<habit> getAllHabits(){
		return HabitRepository.findAll();
	}
	
	//@GetMapping("/habit/{id}")
	//public ResponseEntity<habit> gethabit(@RequestParam(name = "habit_id") Long habit_id) {
	//	habit h = HabitRepository.getById(habit_id);
	//	return ResponseEntity.ok(h);

//	}
	@GetMapping("/habit/{id}")
	public habit getHabitById(@PathVariable long id) {
		habit h = habitService.getHabitById(id);
		return h;
	}
	
}
