package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we are creating an object for  Dog class.
		Dog ZemasDog = new Dog(); //"ZemasDog" is variable , it can be any.
		ZemasDog.name="Lexy";
		ZemasDog.breed="american hood";
		ZemasDog.color="Black";
		ZemasDog.age=10;
		ZemasDog.gender='M';
		
		System.out.println("My Dog Name is " + ZemasDog.name);
		System.out.println("His Breed as " + ZemasDog.breed);
		System.out.println("His color is " + ZemasDog.color);
		
		
		Dog jimmyDog = new Dog();
		
		jimmyDog.name="Teddy";
		jimmyDog.breed="Labrador Retriever";
		jimmyDog.color="Golden";
		jimmyDog.height=5;
		jimmyDog.gender='F';
		
		System.out.println("My Dog Name is " + ZemasDog.name);
		System.out.println("His Breed as " + ZemasDog.breed);
		System.out.println("His color is " + ZemasDog.color);
		
		Dog arwasDog = new Dog();
		arwasDog.name="Manroe";
		
		System.out.println("Arwas dog is " + arwasDog.name);
		
		

	}

}
