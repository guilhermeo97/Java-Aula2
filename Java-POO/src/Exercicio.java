public class Exercicio {
    public static void main(String[] args) throws Exception {
        Cachorro Dalila = new Cachorro("Vira lata", 40.0f, 2020, "Dalila", 'F', 15.0f, true);
        Dalila.description();
        Cachorro lion = new Cachorro(50.0f, 2010, "Lion", 'M', 20);
        lion.description();
        System.out.println("Execução Terminada");
    }
}

class Cachorro {
    
    private String race;
    private float size;
    private int age;
    private String name;
    private char sex;
    private float weight;
    private boolean hasVacine;

    public Cachorro(float size,int age, String name, char sex, float weight){
        this.name = name;
        this.race = "Vira-lata";;
        this.size = size;
        this.age = 2023 - age;
        this.sex = sex;
        this.weight = weight;
    }

    public Cachorro(String race, float size, int age, String name, char sex, float weight, boolean hasVacine){
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.weight = weight;
        this.hasVacine = hasVacine;
        this.size = size;
        this.age = 2023 - age;
    }

    public void description(){
        System.out.println("Esse é " + this.name + 
        ", ele é um cachorro da raça " + this.race + 
        "do sexo" + this.sex + 
        " peso " + this.weight + "ele tem"+ this.age + "anos." +      
        " altura de: " + this.size + 
        " peso " + this.weight + " Vacinada = " + this.hasVacine);
    }
}