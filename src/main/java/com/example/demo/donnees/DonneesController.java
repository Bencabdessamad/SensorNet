package com.example.demo.donnees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/api/donnees")
public class DonneesController {

	private static Logger logger = LoggerFactory.getLogger(DonneesController.class);
	
	@Autowired
	DonneesRepository donneesRepository;

	@Autowired
	DonneesService donneesService;
	
	@GetMapping("/get-all-donnees")
	private List<Donnees> getAllDonnees(){
		logger.debug("getAllDonnees()");
		return donneesService.getAllDonnees();
	}
	
	@GetMapping("get-donnees/{id}")
	private Donnees getDonnees(@PathVariable("id") int id) {
		logger.debug("getDonnees()");
		return donneesService.getDonneesById(id);
	}

	/*@GetMapping("/search-donnees")
	public List<Donnees> searchDonnees(@RequestParam("reference") String reference, @RequestParam("date") Timestamp date) {
	logger.debug("searchDonnees()");
        List<Donnees> donnees = donneesRepository.findByReferenceAndDate(reference,date);
        logger.debug(donnees.toString());
        return donnees;
	}*/

	/*@GetMapping("/search-donnees")
	public List<Donnees> searchDonnees(@RequestParam("reference") String reference, @RequestParam("date") String dateString) {
    	logger.debug("searchDonnees()");
    
    	// Convert the date string to a Timestamp object
    	Timestamp date = Timestamp.valueOf(dateString + " 00:00:00");
    
    	List<Donnees> donnees = donneesRepository.findByReferenceAndDate(reference, date);
    	logger.debug(donnees.toString());
    	return donnees;
	}*/
	
	
	@GetMapping("/search-donnees")
    	public ResponseEntity<List<Donnees>> searchDonnees(@RequestParam("reference") String reference, @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        logger.debug("searchDonnees()");
	Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date endDate = calendar.getTime();

        List<Donnees> donnees = donneesRepository.findByReferenceAndDate(reference, startDate, endDate);
	logger.debug(donnees.toString());
        return new ResponseEntity<>(donnees, HttpStatus.OK);
    	}	

}
