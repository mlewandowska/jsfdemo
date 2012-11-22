package com.zadanie3.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.zadanie3.jsfdemo.domain.Osoba;

@ApplicationScoped
public class OsobaManager {
	private List<Osoba> db = new ArrayList<Osoba>();

	public void addOsoba(Osoba osoba) {
		Osoba newOsoba = new Osoba();

		newOsoba.setImie(osoba.getImie());
		newOsoba.setNazwisko(osoba.getNazwisko());
		newOsoba.setDataUr(osoba.getDataUr());
		newOsoba.setKod(osoba.getKod());
		newOsoba.setMiasto(osoba.getMiasto());
		

		db.add(newOsoba);
	}
	
	public List<Osoba> getAllOsoby() {
		return db;
	}
}
