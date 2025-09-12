class Smartphone{
    int akku;
    private boolean zustand;

    Smartphone(int akku, boolean zustand) {
        this.akku = akku;
        this.zustand = zustand;
    }

    public void anzeigen(){
        System.out.println("Akkustand: " + akku + "%");
        System.out.println("Zustand: " + zustand);
    }
}