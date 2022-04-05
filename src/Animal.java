public abstract class Animal
{
    String name;

    public abstract void makeSound();
//when doing an abstract method, you write it like above and write the code in the subclass where the method is called
    public abstract boolean eat (String foodType);
    public abstract void Rawr();

}
