public class Mother extends Gradma{
    String name = "Arasi";
    public void work(){
        System.out.println("mother's name is "+ name + ", grandma's name is "+ super.name);
        super.work();
    }
}
