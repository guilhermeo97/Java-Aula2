public class App {
    public static void main(String[] args) throws Exception {
        Cachorro clifford = new Cachorro("Clifford", 2016);
        Cachorro Dalila = new Cachorro("Dalila", 2020);
        
        Dalila.color = "Cinza";
       
        clifford.description();
        Dalila.description();
    }
}
class Cachorro {
    String race;
    Float size;
    String color;
    int age;
    String name;
    int birth;

    public Cachorro(String name, int birth){
        this.name = name;
        this.size = 40f;
        this.race = "ViraLata";
        this.color = "Caramelo";
        this.age = 2023 - birth;
    }
    public void description(){
        System.out.println("Esse é " + this.name + " ele é um cachorro da raça " + this.race + " da cor " + this.color);
    }
}
