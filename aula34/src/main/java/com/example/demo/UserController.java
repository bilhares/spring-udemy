package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("user")
	public List<User> getUser() {
		List<User> usuarios = new ArrayList<>();
		User u = new User("Felipe", "felipe.bilhares@email.com");
		User u2 = new User("Jose", "jose@email.com");

		usuarios.add(u);
		usuarios.add(u2);

		return usuarios;
	}

	@PostMapping("user")
	public User postUser(@RequestBody User user) {
		return user;
	}
}
