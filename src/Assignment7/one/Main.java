package Assignment7.one;

public class Main {
    public static void main(String[] args) {
        Rodents[] rodents=new Rodents[3];
        rodents[0]=new Rats();
        rodents[1]=new Gerbil();
        rodents[2]=new Hamster();
        rodents[0].eats();
        rodents[0].runs();


    }
}
