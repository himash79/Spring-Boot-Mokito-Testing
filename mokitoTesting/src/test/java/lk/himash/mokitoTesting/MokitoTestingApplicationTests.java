package lk.himash.mokitoTesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import lk.himash.mokitoTesting.entity.Family;
import lk.himash.mokitoTesting.repository.FamilyRepository;
import lk.himash.mokitoTesting.service.serviceImpl.FamilyServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MokitoTestingApplicationTests {

	@Autowired
	private FamilyServiceImpl famServiceImpl;

	@MockBean
	private FamilyRepository famRepo;

	@Test
	public void getAllFamilyDetails() {
		List<String> members = new ArrayList<>();
		members.add("member 01");
		members.add("member 02");

		List<Family> families = new ArrayList<>();
		families.add(new Family("123", "2", members, "2", "Selected"));
		families.add(new Family("456", "4", members, "4", "Not Selected"));

		when(famRepo.findAll()).thenReturn(families);
		assertEquals(2, famServiceImpl.getAllFamilyDetails().size());
	}
	
	@Test
	public void getFamily() {
		List<String> members = new ArrayList<>();
		members.add("member 01");
		members.add("member 02");

		Family family = new Family("123", "2", members, "2", "Selected");
		
		System.out.println(family);
				
		when(famRepo.findById(family.get_id())).thenReturn(Optional.of(family));
		assertEquals(family, famServiceImpl.getFamily(family.get_id()));
	}
	
	@Test
	public void saveFamily() {
		List<String> members = new ArrayList<>();
		members.add("member 01");
		members.add("member 02");

		Family family = new Family("123", "2", members, "2", "Selected");
		
		System.out.println(family);
		
		when(famRepo.save(family)).thenReturn(family);
		assertEquals(family, famServiceImpl.saveFamily(family));
		
	}
	
	@Test
	public void removeFamily() {
		List<String> members = new ArrayList<>();
		members.add("member 01");
		members.add("member 02");

		Family family = new Family("123", "2", members, "2", "Selected");

		System.out.println(family);
		
		famServiceImpl.removeFamily(family);
		verify(famRepo, times(1)).delete(family);
	} 
	
	
	
	
	
	
	
	
	
	
	
	

}
