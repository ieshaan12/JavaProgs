abstract class Animal
{public void eat()
	{
	System.out.println("Eating");
	}
public void move()
	{
	System.out.println("Moving");
	}
public void sleep()
	{
	System.out.println("Sleeping");
	}
}
class Cat extends Animal{
	public void meow() {
		System.out.println("Meow, meow!");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Woof, woof");
	}
}
class AnimalTeacher{
	public void teach(Animal a) {
		a.move();
		a.eat();
		if(a instanceof Dog) {
			((Dog) a).bark();
		}
		else if(a instanceof Cat) {
			((Cat) a).meow();
		}
	}
}
public class DownCasting {
public static void main(String[] args)
{
	AnimalTeacher teacher=new AnimalTeacher();
	Cat c=new Cat();
	Dog d=new Dog();
	teacher.teach(c);
	teacher.teach(d); 
}
}
