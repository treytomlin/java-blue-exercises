package com.techelevator;
<<<<<<< HEAD
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	
=======

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FruitTreeTest {

>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	private FruitTree fruitTree;
	
	@Before
	public void setup() {
		fruitTree = new FruitTree("Orange", 20);
	}
	
	@Test
	public void verify_fruit_tree_has_oranges() {
<<<<<<< HEAD
		//Arrange
		//Act
		String fruitType = fruitTree.getTypeOfFruit();
		//Assert
		Assert.assertEquals("Fruit Tree has wrong type of fruit","Orange",  fruitType);
		
	}  
	
	@Test
	public void verify_fruit_tree_starts_with_20_fruits() {
		//Arrange
		//Act
		int startingFruit = fruitTree.getPiecesOfFruitLeft();
		//Assert
		Assert.assertEquals(20, startingFruit);
		//Act with an Assert
		//Assert.assertArrayEquals (20, actuals);fruitTree.getPiecesOfFruitLeft();
	}
	 
	
	
	@Test
	public void pick_five_fruits() {
		//Arrange
		//Act
		boolean sucess = fruitTree.PickFruit(5);
		//Assert
		Assert.assertTrue(sucess);
		Assert.assertEquals(15, fruitTree.getPiecesOfFruitLeft());
	}

	@Test
	public void pick_more_than_available_fruit() {
		//Arrange
		fruitTree.PickFruit(10);
		//Assert
		boolean success = fruitTree.PickFruit(11);
		Assert.assertFalse(success);
		Assert.assertEquals(10, fruitTree.getPiecesOfFruitLeft());
		
=======
		// Arrange
		// Act
		String fruitType = fruitTree.getTypeOfFruit();
		// Assert
		Assert.assertEquals("Fruit Tree has wrong type of Fruit", "Orange", fruitType);
	}
	
	@Test
	public void verify_fruit_tree_starts_with_20_fruits() {
		// Arrange
		// Act
		// Act with an Assert
		Assert.assertEquals(20, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_5_fruits() {
		// Arrange
		// Act
		boolean success = fruitTree.PickFruit(5);
		// Assert
		Assert.assertTrue(success);
		Assert.assertEquals(15, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_more_than_available_fruit() {
		// Arrange
		fruitTree.PickFruit(10);
		// Act
		boolean success = fruitTree.PickFruit(11);
		// Assert
		Assert.assertFalse(success);
		Assert.assertEquals(10, fruitTree.getPiecesOfFruitLeft());
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	}
	
	@Test
	public void pick_all_the_fruit() {
		Assert.assertTrue(fruitTree.PickFruit(20));
<<<<<<< HEAD
		Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft());
	} 
	 
	@Test
	public void pick_negative_fruit() {
		Assert.assertFalse(fruitTree.PickFruit(-1));
		Assert.assertEquals(20, 20);
=======
		Assert.assertEquals(0,  fruitTree.getPiecesOfFruitLeft());
		
	}
	
	@Test
	public void pick_negative_fruit() {
		Assert.assertFalse(fruitTree.PickFruit(-1));
		Assert.assertEquals(20, fruitTree.getPiecesOfFruitLeft());
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	}
}
