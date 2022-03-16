public class Animal {
    private String Color , Breed , Category;
    public void setColor( String color){
        this.Color = color;
    }public void setBreed(String breed){
        this.Breed = breed;
    }public void setCategory(String category){
        this.Category = category;
    }
    public String getColor(){
        return this.Color;
    }public String getBreed(){
        return this.Breed;
    }public String getCategory(){
        return this.Category;
    }
}
class Animal_solution{
    public static void main(String[] args) {
        //Creating a object of Animal class
        Animal animal = new Animal();
        // Setting up the Private variables
        animal.setColor("brown");
        animal.setBreed("boxer");
        animal.setCategory("Dog");
        // Accessing the Private variables
        System.out.println(animal.getColor());
        System.out.println(animal.getBreed());
        System.out.println(animal.getCategory());

    }
}