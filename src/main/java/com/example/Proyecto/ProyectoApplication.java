package com.example.Proyecto;

import com.example.Proyecto.bean.MyBeanWithDependencie;

import com.example.Proyecto.bean.Nombre;
import com.example.Proyecto.bean.NuevoBean;

import com.example.Proyecto.component.ComponentDependency;
import com.example.Proyecto.entity.User;
import com.example.Proyecto.pojo.UserPojo;
import com.example.Proyecto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;

	private MyBeanWithDependencie myBeanWithDependencie;
	private UserPojo userPojo;
	private UserRepository userRepository;




	public ProyectoApplication(@Qualifier("componentTwo") ComponentDependency componentDependency,UserPojo userPojo,  MyBeanWithDependencie myBeanWithDependencie, UserRepository userRepository){
		this.componentDependency=componentDependency;

		this.myBeanWithDependencie=myBeanWithDependencie;
		this.userPojo=userPojo;
		this.userRepository=userRepository;




	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//clasesAnteriores();
	saveUserInDataBase();

	}
	private void saveUserInDataBase(){
		User user1 = new User("John", "john@domain.com", LocalDate.of(2021, 3, 13));
		User user2 = new User("Marco", "marco@domain.com", LocalDate.of(2021, 12, 8));
		User user3 = new User("Daniela", "daniela@domain.com", LocalDate.of(2021, 9, 8));
		User user4 = new User("Marisol", "marisol@domain.com", LocalDate.of(2021, 6, 18));
		User user5 = new User("Karen", "karen@domain.com", LocalDate.of(2021, 1, 1));
		User user6 = new User("Carlos", "carlos@domain.com", LocalDate.of(2021, 7, 7));
		User user7 = new User("Enrique", "enrique@domain.com", LocalDate.of(2021, 11, 12));
		User user8 = new User("Luis", "luis@domain.com", LocalDate.of(2021, 2, 27));
		User user9 = new User("Paola", "paola@domain.com", LocalDate.of(2021, 4, 10));

		List<User> list= Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8,user9);
		list.stream().forEach(userRepository::save);

	}



	public void clasesAnteriores(){
		componentDependency.saludar();

		myBeanWithDependencie.printWithDependency();

		System.out.println(userPojo.getEmail());
	}
}
