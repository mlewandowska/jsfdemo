package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
		Person newPerson = new Person();
		
		newPerson.setId(Person.counter);
		Person.counter++;
		newPerson.setFirstName(person.getFirstName());
		newPerson.setZipCode(person.getZipCode());
		newPerson.setPin(person.getPin());
		newPerson.setDateOfBirth(person.getDateOfBirth());
		newPerson.setMarried(person.isMarried());
		newPerson.setWeight(person.getWeight());
		newPerson.setNumOfChildren(person.getNumOfChildren());
		db.add(newPerson);
	}
	
	public void updatePerson(Person person) {
		Person updatedPerson = new Person();

		updatedPerson.setId(person.getId());
		updatedPerson.setFirstName(person.getFirstName());
		updatedPerson.setZipCode(person.getZipCode());
		updatedPerson.setPin(person.getPin());
		updatedPerson.setDateOfBirth(person.getDateOfBirth());
		updatedPerson.setMarried(person.isMarried());
		updatedPerson.setWeight(person.getWeight());
		updatedPerson.setNumOfChildren(person.getNumOfChildren());

		db.set(updatedPerson.getId(),updatedPerson);
	}

	// Removes the person with given PIN
	public void deletePerson(Person person) {
		Person personToRemove = null;
		for (Person p : db) {
			if (person.getPin().equals(p.getPin())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}
