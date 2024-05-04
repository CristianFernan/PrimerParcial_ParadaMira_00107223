package Animales;

public abstract class Mascota extends Animal implements Obtenible {

    private String modoAlimentacion;
    private String metodoBanio;
    public Mascota(Animal animal){
        super(animal);

    }
    public String getModoAlimentacion() {
        return modoAlimentacion;
    }

    public void setModoAlimentacion(String modoAlimentacion) {
        this.modoAlimentacion = modoAlimentacion;
    }

    public String getMetodoBanio() {
        return metodoBanio;
    }

    public void setMetodoBanio(String metodoBanio) {
        this.metodoBanio = metodoBanio;
    }
}
