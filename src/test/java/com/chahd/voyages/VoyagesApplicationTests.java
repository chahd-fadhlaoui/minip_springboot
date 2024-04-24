package com.chahd.voyages;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.chahd.voyages.entities.Voyage;
import com.chahd.voyages.repos.VoyageRepository;
import com.chahd.voyages.service.VoyageService;

@SpringBootTest
class VoyagesApplicationTests {
	@Autowired
	private VoyageRepository voyageRepository;
	@Autowired

	private VoyageService voyageService;
	@Test
	public void testCreateVoyage() {
	Voyage voya = new Voyage("istanbul",2800.500,new Date());
	voyageRepository.save(voya);
	}
	 @Test
	 public void testFindVoyage()
	 {
		 Voyage v = voyageRepository.findById(1L).get();
	 System.out.println(v);
	 }
	 
	 @Test
	 public void testUpdateVoyage()
	 {
		 Voyage v = voyageRepository.findById(1L).get();
	 v.setPrixVoyage(1000.0);
	 voyageRepository.save(v);
	 }
	 @Test
	 public void testDeleteVoyage()
	 {
		 voyageRepository.deleteById(1L);;
	 }
	 
	 @Test
	 public void testListerTousVoyages()
	 {
	 List<Voyage> voyas = voyageRepository.findAll();
	 for (Voyage v : voyas)
	 {
	 System.out.println(v);
	 }
	 }
	 @Test
	 public void testFindByNomProduitContains() {
	     Page<Voyage> voyages = voyageService.getAllVoyagesParPage(0, 2);
	     System.out.println(voyages.getSize());
	     System.out.println(voyages.getTotalElements());
	     System.out.println(voyages.getTotalPages());
	     voyages.getContent().forEach(v -> {
	         System.out.println(v.toString());
	     });
	     /*ou bien
	     for (Voyage v : voyages) {
	         System.out.println(v);
	     } */
	 }


}
