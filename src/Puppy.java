public class Puppy
{
    // The puppy's age

    private int puppyAge;
    private String puppyName;


    //This constructor has one parameter name.
    public Puppy(String name) {

        System.out.println("Name chosen is : " + name);
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        return puppyAge;
    }

    public static void main(String[]  args){
        //to do code application logic here
        Puppy myPuppy = new Puppy( "Tommy");
        myPuppy.setPuppyAge(2);
        int age = myPuppy.puppyAge;
        System.out.println("Puppy Age is : " + age);
    }
}

