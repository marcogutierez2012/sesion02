package main;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbTipo;
import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		//System.out.println("Hola cibertec 2023");
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstUsuarios = em.createQuery("Select t From TbUsuario t", TbUsuario.class).getResultList();
		//System.out.println("Número de usuarios : " + lstUsuarios.size());
		
		/*Listar todos los usuarios*/
		/*System.out.println("Lista de usuarios:");
		System.out.println("-----------------");
		for(TbUsuario u: lstUsuarios){
			System.out.println("usuario: "+u.getNomUsua()+ " " + u.getApeUsua()+ " "+ u.getClaUsua());
		}
		System.out.println("==============================================");*/
		
		/*Búsqueda de usuario con id=2*/
		/*System.out.println("Buscar usuario con id=2");
		System.out.println("-----------------------");
		TbUsuario us = em.find(TbUsuario.class,2);
		System.out.println(us);
		System.out.println("Codigo   : "+us.getCodUsua());
		System.out.println("Usuario  : "+us.getNomUsua());
		System.out.println("Apellido : "+us.getApeUsua());
		System.out.println("Clave    : "+us.getClaUsua());
		System.out.println("==============================================");*/
		
		/*Insertar nuevo usuario*/
		/*em.getTransaction().begin();
		TbUsuario usuario = new TbUsuario();
		Date fecha = new Date();
		TbTipo tipo = em.find(TbTipo.class, 2); // Tipo Cliente
		usuario.setCodUsua(6);
		usuario.setNomUsua("Pepe");
		usuario.setApeUsua("Perez");
		usuario.setUsrUsua("pepeperez");
		usuario.setFnaUsua(fecha);
		usuario.setTbTipo(tipo);
		usuario.setEstUsua(1);
		em.persist(usuario);
		em.getTransaction().commit();
		System.out.println("=====================");*/
		
		//Actualizar Usuario
		/*em.getTransaction().begin();
		TbUsuario usuarioActualizar = em.find(TbUsuario.class, 6);
		usuarioActualizar.setClaUsua("10001");
		em.persist(usuarioActualizar);
		em.getTransaction().commit();
		System.out.println("Codigo: "+usuarioActualizar.getCodUsua()+" Usuario : "+usuarioActualizar.getUsrUsua()+" Clave : "+usuarioActualizar.getClaUsua());
		System.out.println("===============");*/
		
		//Eliminar Usuario
		/*em.getTransaction().begin();
		TbUsuario usuarioEliminar = em.find(TbUsuario.class, 6);
		em.remove(usuarioEliminar);
		em.getTransaction().commit();
		System.out.println("==============");
		System.out.println("Eliminado Correctamente");
		em.close();
		fabrica.close();*/
	}

}
