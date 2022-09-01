package lk.himash.mokitoTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.mokitoTesting.entity.Family;
import lk.himash.mokitoTesting.service.FamilyService;

@RestController
@RequestMapping("/familyApi")
public class FamilyController {

	@Autowired
	private FamilyService famService;
	
	@GetMapping("/getAllFamilyDetails")
	public List<Family> getAllFamilyDetails() {
		return famService.getAllFamilyDetails();
	}
	
	@GetMapping("/getFamily/{id}")
	public Family getFamily(@PathVariable String id) {
		return famService.getFamily(id);
	}
 	
	@PostMapping("/saveFamily")
	public Family saveFamily(@RequestBody Family family) {
		return famService.saveFamily(family);
	}
	
	@DeleteMapping("/removeFamily/{id}")
	public void removeFamily(@RequestBody Family family) {
		famService.removeFamily(family);
	}
}
