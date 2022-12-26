package net.javaguides.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.habit;
import net.javaguides.springboot.repository.HabitRepository;

@Service
public class habitService {
	
	@Autowired
	HabitRepository habitRepository;

	public habit getHabitById(long id) {
		return habitRepository.findById(id);
	}

	
	

	

	
	}
