public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("cat goes skrr");
    }
    @Override
    public boolean eat(String foodType)
    {
        return true;
    }

    @Override
    public void Rawr()
    {
        System.out.println("i r angry");
    }
}

