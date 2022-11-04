package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.modelos.User;
import com.sv.repositorio.InterfaceUsuario;

@RestController
@RequestMapping("/User")
public class UserControlador {

	@Autowired
	private InterfaceUsuario interfaceUser;
	
	@GetMapping
	public List<User> usuarios(){
		return (List<User>) interfaceUser.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody User us) {
		interfaceUser.save(us);
	}
	
	@PutMapping
	public void modificar(@RequestBody User us) {
		interfaceUser.save(us);
	}
	
	@DeleteMapping(value="/id")
	public void elminar(@PathVariable("id") Integer id) {
		interfaceUser.deleteById(id);
	}
}
