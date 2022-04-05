public class Dog extends Animal
{

    //here is the code written for the abstract method
    @Override
    public void makeSound()
    {
        System.out.println("dog goes skrr");
    }

    @Override
    public boolean eat(String foodType)
    {
        return true;
    }
}
