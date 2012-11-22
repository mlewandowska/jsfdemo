package com.zadanie3.jsfdemo.web;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.zadanie3.jsfdemo.domain.Osoba;
import com.zadanie3.jsfdemo.service.OsobaManager;

@SessionScoped
@Named("osobaBean")
public class OsobaBackingBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Osoba osoba = new Osoba();

	private ListDataModel<Osoba> osoby = new ListDataModel<Osoba>();

	@Inject
	private OsobaManager pm;

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

	public ListDataModel<Osoba> getAllOsoby() {
		osoby.setWrappedData(pm.getAllOsoby());
		return osoby;
	}

	
	public String addOsoba() {
		pm.addOsoba(osoba);
		return "showOsoby";
		//return null;
	}



}
