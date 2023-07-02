package com.example.demo.capteur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapteurService {

				
				@Autowired
				private CapteurRepository capteurRepository;
				
				public List<Capteur> getAllCapteur(){
					try {
						List<Capteur> capteurs = new ArrayList<>();
						capteurRepository.findAll().forEach(capteurs::add);
						return capteurs;
					}catch (Exception e){
						e.printStackTrace();
			            return new ArrayList<>();
					}
				}
				
				
				public Capteur getCapteurById(int capteurid) {
					try {
						Optional<Capteur> optionalCapteur = capteurRepository.findById(capteurid);
						return optionalCapteur.orElse(null);
					} catch (Exception e) {
			            e.printStackTrace();
			            return null;
			        }
				}
				
				public void saveOrUpdate(Capteur capteur) {
			        try {
			            capteurRepository.save(capteur);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }
				
				
				public void update(Capteur capteur, int capteurid) {
			        try {
			            capteurRepository.save(capteur);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }


				
				
				
}
