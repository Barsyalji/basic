class Animal{
	void eat()
	{
		System.out .println("my name is atul ");
	}
}
class Dog extends Animal{
	void bark(){
		System.out .println("my name is atul ");
	}
}
class Test{
	public static void main(String[] args){
		Dog d=new Dog();
		d.bark();
		d.eat();
	}
}