package com.example.DemoProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoProjectApplicationTests {

	/*
	@Autowired
	DogRepository repository;

	@Test
	public void testFindDogs() {
		List<Dog> dogs = (List)repository.findAll();
		Assertions.assertTrue(dogs.size() == 2);
	}

	@Test
	public void testFindDog() {
		Dog dog = repository.findById(1L).get();
		Assertions.assertEquals("Pluto", dog.getName());
	}

	@Test
	public void testAddDog() {
		long count = repository.count();
		Dog dog = new Dog("New dog", 1);
		repository.save(dog);
		long count2 = repository.count();
		Assertions.assertEquals(count+1, count2);
	}

	@Test
	public void testUpdateDog() {
		Dog dog = repository.findById(1L).get();
		int originalAge = dog.getAge();
		dog.setAge(originalAge+1);
		repository.save(dog);
		Dog dog2 = repository.findById(1L).get();
		Assertions.assertEquals(originalAge+1, dog2.getAge());
		// setting the age back to the original value
		dog.setAge(originalAge);
		repository.save(dog);
	}

	@Test
	public void testDeleteDog() {
		long count = repository.count();
		Dog dog = repository.findById(2L).get();
		repository.delete(dog);
		long count2 = repository.count();
		Assertions.assertEquals(count-1, count2);
	}
	*/
}
