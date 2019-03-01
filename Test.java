import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


abstract class Animal{
	
	abstract void eat();
	
}

class Cat extends Animal{
	
	public void eat() {
		
		System.out.println("吃鱼");
		
	}
	
	public void work() {
		
		System.out.println("捉老鼠");
		
	}
	
}

class Dog extends Animal{
	
	public void eat() {
		
		System.out.println("吃骨头");
		
	}
	
	public void work() {
		
		System.out.println("看门");
		
	}
	
}

public class Test {
	
	public static void show(Animal a) {
		
		a.eat();
		
		if(a instanceof Cat) {
			
			Cat c = (Cat)a;
			c.work();
			
		}else if(a instanceof Dog) {
			
			Dog c = (Dog)a;
			c.work();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		show(new Cat());
		show(new Dog());
		
		Animal a = new Cat();
		a.eat();
		
		Cat c = (Cat)a;
		c.work();
		
	}
}
