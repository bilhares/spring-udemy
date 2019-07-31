package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Role;
import com.example.demo.entity.StatusRole;
import com.example.demo.repository.RoleRepository;

@Component
public class Initalzr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		saveRole("ADMIN", StatusRole.ATIVO);
		saveRole("USER", StatusRole.ATIVO);
		saveRole("ALUNO", StatusRole.ATIVO);
		saveRole("TESTE", StatusRole.ATIVO);
		saveRole("VISITANTE", StatusRole.ATIVO);
		saveRole("TEU PAI", StatusRole.ATIVO);
		saveRole("SHOW", StatusRole.ATIVO);

		PageRequest page = PageRequest.of(2, 2);
		Page<Role> roles = roleRepository.findAll(page);
		
		roles.forEach(role -> System.out.println(role.getName()));
	
	}

	public void saveRole(String name, StatusRole status) {
		roleRepository.save(new Role(name, status));
	}

}
