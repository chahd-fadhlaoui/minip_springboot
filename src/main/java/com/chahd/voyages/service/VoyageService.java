package com.chahd.voyages.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.chahd.voyages.entities.Voyage;

public interface VoyageService {
	Voyage saveVoyage(Voyage v);
	Voyage updateVoyage(Voyage v);
	void deleteVoyage(Voyage v);
	 void deleteVoyageById(Long id);
	 Voyage getVoyage(Long id);
	List<Voyage> getAllVoyages();
	Page<Voyage> getAllVoyagesParPage(int page, int size);


}
