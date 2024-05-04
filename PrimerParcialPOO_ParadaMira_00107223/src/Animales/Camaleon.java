package Animales;

public class Camaleon extends Mascota{
    private String tipoPiel;

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public Camaleon(Animal animal, String modoAlimentacion, String metodoBanio,String tipoPiel){
        super(animal);
        super.setMetodoBanio(metodoBanio);
        super.setModoAlimentacion(modoAlimentacion);
        this.tipoPiel = tipoPiel;
    }
    @Override
    public String obtenerModoAlimentacion() {
        //Calcula el peso en gramos
        return "Insectos, 4 al dia";
    }

    @Override
    public String obtenerMetodoBanio(int tipoPiel) {
        if (tipoPiel == 1){
            return "Limpiar 1 vez a la semana, con cepillo (de dientes)";

        } else{
            return "Limpiar 1 vez cada 2 semanas, con pañuelo mojado";
        }
    }
}
