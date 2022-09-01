package lk.himash.mokitoTesting.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.himash.mokitoTesting.entity.Family;
import lk.himash.mokitoTesting.repository.FamilyRepository;
import lk.himash.mokitoTesting.service.FamilyService;

@Service
public class FamilyServiceImpl implements FamilyService {

	@Autowired
	private FamilyRepository familyRepo;
	
	@Override
	public List<Family> getAllFamilyDetails() {
		List<Family> fams = familyRepo.findAll();
		return fams;
	}

	@Override
	public Family getFamily(String id) {
		Family family = familyRepo.findById(id).get();
		return family;
	}

	@Override
	public Family saveFamily(Family family) {
		Family savedFamily = familyRepo.save(family);
		return savedFamily;
	}

	@Override
	public void removeFamily(Family family) {
		familyRepo.delete(family);
	}
	
	
	

}
