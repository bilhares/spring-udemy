package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Functionality;
import com.example.demo.entity.Role;
import com.example.demo.entity.StatusRole;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		User user = new User();
		user.setName("Felipe");
		user.setEmail("felipe@teste.com");
		user.setRoles(Arrays.asList(new Role("Admin", StatusRole.ATIVO, Arrays.asList(new Functionality())),
				new Role("Aluno", StatusRole.ATIVO, Arrays.asList(new Functionality()))));

		userRepository.save(user);

	}

}
