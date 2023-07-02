package com.example.demo.donnees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;

@EnableJpaRepositories
@Repository
public interface DonneesRepository extends JpaRepository<Donnees, Integer> {
	@Query("SELECT d FROM Donnees d WHERE d.reference = :reference AND d.date >= :startDate AND d.date < :endDate")				
	List<Donnees> findByReferenceAndDate(String reference, Date startDate, Date endDate);
	//List<Donnees> findByReferenceAndDate(String reference, Timestamp date);
}

	
