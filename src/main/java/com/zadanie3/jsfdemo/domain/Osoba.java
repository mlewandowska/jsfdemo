package com.zadanie3.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Osoba {

	private String imie;
	private String nazwisko;
	private Date dataUr = new Date();
	private int kod;
	private String miasto;
	
	@Size(min = 3, max = 20)
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	@Past
	public Date getDataUr() {
		return dataUr;
	}
	public void setDataUr(Date dataUr) {
		this.dataUr = dataUr;
	}
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	public int getKod() {
		return kod;
	}
	public void setKod(int kod) {
		this.kod = kod;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	

}
