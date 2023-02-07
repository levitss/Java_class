package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("움직인다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
	
}
class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("네 발로 걷는다");
		
	}
	public void playBall() {
		System.out.println("공");
	}

}
class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("어슬렁");
	}
	
	public void sounds() {
		System.out.println("야옹");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리 하늘 날다");
	}
	public void wasihdukami(){
		System.out.println("물고기 픽업");
	}
	
}

public class AnimalTest {
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	public static void main(String[] args) {
	Animal dog=new Dog();
	Animal eagle=new Eagle();
	Animal tiger=new Tiger();//필드의 다형성
	dog.move();
	eagle.move();
	tiger.move();
	AnimalTest test=new AnimalTest();
	test.moveAnimal(tiger);
	test.moveAnimal(eagle);//매개변수의 다형성
	ArrayList<Animal> animalList=new ArrayList<>();
	animalList.add(tiger);
	animalList.add(eagle);
	animalList.add(dog);
	//업캐스팅 된 것들은 본래 지 타입으로 강제 형변환이 가능하다.
	
	
	for (Animal animal:animalList) {
		animal.move();
	}
	
	
	}
}


