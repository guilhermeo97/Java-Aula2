public class Exercicio {
    public static void main(String[] args) throws Exception {
        Cachorro2 Dalila = new Cachorro2("Vira lata", 40.0f, 2020, "Dalila", 'F', 15.0f, true);
        Cachorro2 lion = new Cachorro2(50.0f, 2010, "Lion", 'M', 20);
        Dalila.description();
        Dalila.calculaIMCC(10.0f, 15.0f);
        lion.description();
        System.out.println("Execução Terminada");
    }
}

class Cachorro2 {
    
    private String race;
    private float size;
    private int age;
    private String name;
    private char sex;
    private float weight;
    private boolean hasVacine;
    private float IMCC = weight / (size * size);

    public Cachorro2(float size,int age, String name, char sex, float weight){
        this.name = name;
        this.race = "Vira-lata";;
        this.size = size;
        this.age = 2023 - age;
        this.sex = sex;
        this.weight = weight;
    }

    public Cachorro2(String race, float size, int age, String name, char sex, float weight, boolean hasVacine){
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

    public void calculaIMCC(float size, float weight) {
        this.size = size;
        this.weight = weight;
        if(IMCC <= 18.5 ){
            System.out.println("Está abaixo do peso");
        } else {
            if(IMCC > 18.5 && IMCC <= 25){
                System.out.println("Peso normal");
            }
            else {
                if(IMCC > 25 && IMCC <= 30) {
                    System.out.println("Acima do peso");
                }
                else {
                    System.out.println("Obeso");
                }
            } 
        }
    }
}