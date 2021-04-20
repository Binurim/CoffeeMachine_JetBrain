class Cat {

    // write static and instance variables
    String name;
    int age;
    public static int counter;

    public Cat(String name, int age) {
        this.name=name;
        this.age= age;
        if(counter>=5){
            System.out.println("You have too many cats");
        }
        counter+=1;

    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}