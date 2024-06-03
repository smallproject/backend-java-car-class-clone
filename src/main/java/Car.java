public class Car {
    private String merk;
    private String type;
    private String bouwjaar;
    private String kleur;
    private String motorinhoud;

    public Car(String merk) {
        this.merk = merk;
    }

    public Car(String merk, String type, String bouwjaar, String kleur, String motorinhoud){
        this.merk = merk;
        this.type = type;
        this.bouwjaar = bouwjaar;
        this.kleur = kleur;
        this.motorinhoud = motorinhoud;
    }

//    public void carPrint(){
//        System.out.println("Een " + this.kleur + " " + this.merk + " uit " + this.bouwjaar + " met een motorinhoud van " + this.motorinhoud);
//    }

    public void print() {
        System.out.println("Deze " + this.merk + " " + this.type + " is " + this.kleur);
    }

    @Override
    public String toString(){
        return "Deze " + this.merk + " " + this.type + " is " + this.kleur;
    }
}
