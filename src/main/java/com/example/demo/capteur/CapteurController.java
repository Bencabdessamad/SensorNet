package com.example.demo.capteur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/capteur")

public class CapteurController {
		
		@Autowired
		CapteurService capteurService;
		
		@GetMapping("/get-all-capteurs")
		private List<Capteur> getAllCapteur(){
			return capteurService.getAllCapteur();
		}
		
		@GetMapping("get-capteur/{id}")
		private Capteur getCapteur(@PathVariable("id") int capteurid) {
			return capteurService.getCapteurById(capteurid);
		}
		
		@PostMapping("/create-capteur")
		private int saveCapteur(@RequestBody CapteurDTO capteurDTO) {
			Capteur capteur = new Capteur();
			capteur.setReference(capteurDTO.getReference());
			capteur.setType(capteurDTO.getType());
			capteur.setValeur(capteurDTO.getValeur());
			capteurService.saveOrUpdate(capteur);
			return capteur.getCapteurid();
		}
		
		@PutMapping("/update-capteur/{id}")
		private Capteur update(@RequestBody Capteur capteur) {
			capteurService.saveOrUpdate(capteur);
			return capteur;
		}
		
}
