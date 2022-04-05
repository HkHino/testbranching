public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("animal goes skrr");
    }
    @Override
    public boolean eat(String foodType)
    {
        return true;
    }
}
