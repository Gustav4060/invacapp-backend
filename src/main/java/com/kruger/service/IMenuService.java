package com.kruger.service;

import java.util.List;

import com.kruger.model.Menu;

public interface IMenuService extends ICRUD<Menu, Integer>{
	
	List<Menu> listarMenuPorUsuario(String nombre);

}
