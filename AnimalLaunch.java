package Practicetest;


class Animal 
{
	void shout()
	{
		
	}
}

class Dog extends Animal
{ 
	@Override
	void shout()
	{
		System.out.println("Dog : Bark");
	}
	
}
class Horse extends Animal
{
	@Override
	void shout()
	{
		System.out.println("Horse : neigh");
	}
}
class Cat extends Animal
{
	@Override
	
		void shout()
		{
			System.out.println("Cat : meow");
		}
}

public class AnimalLaunch
{
	public static void main (String arga[])
	{
		Dog d = new Dog();
		Horse h = new Horse();
		Cat c = new Cat();
		
		
		
		d.shout();
		h.shout();
		c.shout();
	}
}






















	
	


