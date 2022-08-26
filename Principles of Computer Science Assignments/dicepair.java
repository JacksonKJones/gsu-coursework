class dicepair {
    int randomGivenRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static void main(String[] args) {
        dicepair obj1 = new dicepair();
        dicepair obj2 = new dicepair();
        int rand1 = obj1.randomGivenRange(1, 6);
        int rand2 = obj2.randomGivenRange(1, 6);

        System.out.println("The First die lands on: " + rand1);
        System.out.println("The Second die lands on: " + rand2);
        System.out.println("Your total roll is: " + (rand1 + rand2));
    }
}