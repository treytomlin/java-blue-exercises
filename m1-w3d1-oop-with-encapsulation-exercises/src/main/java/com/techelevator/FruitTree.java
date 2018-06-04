package com.techelevator;

public class FruitTree {
	
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		
	this.typeOfFruit = typeOfFruit;
	this.piecesOfFruitLeft = startingPiecesOfFruit;
}

	public String getTypeOfFruit() {
		return typeOfFruit;
	}

<<<<<<< HEAD
=======
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}

	public String getTypeOfFruit() {
		return typeOfFruit;
	}

>>>>>>> a6158c3fcb93538c8e077359be22942d5feb4dad
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
<<<<<<< HEAD
		if(numberOfPiecesToRemove > piecesOfFruitLeft) {
=======
		if (numberOfPiecesToRemove > this.piecesOfFruitLeft) {
>>>>>>> a6158c3fcb93538c8e077359be22942d5feb4dad
			return false;
		} else {
			this.piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
	}
	
}
