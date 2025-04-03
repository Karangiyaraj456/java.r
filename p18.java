class car {
    int topSpeed;
    String name;

    public car(int topSpeeda, String namea) {
        topSpeed = topSpeeda;
        name = namea;
    }

    @Override;
    public String toString(){
        return "name is :"+name+"and the totspeed is "+topSpeed; 
    }

    public class Main {
        public static void main(String[] args) {
            car obj = new car(340, "mustang");
            car obj2 = new car(240, "rangerover");
            car obj3 = new car(340, "G-wagon");
            car obj4 = new car(440, "porsche");
            car obj5 = new car(500, "lamborghini");

            System.out.println(obj);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);
            System.out.println(obj5);          
        }
    }
}
