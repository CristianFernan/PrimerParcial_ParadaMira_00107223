package Animales;

public  class Animal {
    private String nombre;
    private String especie;
    private String raza;

    public Animal(){}

    public Animal(Animal animal){
        nombre = animal.getNombre();
        especie = animal.getEspecie();
        raza = animal.getRaza();
    }
    public Animal(String nombre, String especie, String raza){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



}
