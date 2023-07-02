package com.example.demo.donnees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class DonneesService {

	@Autowired
	private DonneesRepository donneesRepository;
	
	
	public List<Donnees> getAllDonnees(){
		try {
			List<Donnees> donnees = new ArrayList<>();
			donneesRepository.findAll().forEach(donnees::add);
			return donnees;
		}catch (Exception e){
			e.printStackTrace();
            return new ArrayList<>();
		}
	}
	
	
	public Donnees getDonneesById(int id) {
		try {
			Optional<Donnees> optionalDonnees = donneesRepository.findById(id);
			return optionalDonnees.orElse(null);
		} catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
	
}
