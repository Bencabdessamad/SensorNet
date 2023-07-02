package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.List;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	List<User> findByNom(String nom);
	List<User> findByPrenom(String prenom);
	List<User> findByNomAndPrenom(String nom, String prenom);
}

