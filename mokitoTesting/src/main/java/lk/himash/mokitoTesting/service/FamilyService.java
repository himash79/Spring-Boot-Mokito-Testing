package lk.himash.mokitoTesting.service;

import java.util.List;

import lk.himash.mokitoTesting.entity.Family;

public interface FamilyService {

	public List<Family> getAllFamilyDetails();
	public Family getFamily(String id);
	public Family saveFamily(Family family);
	public void removeFamily(Family family);
}
