package Animales;

public class Gato extends Mascota{
    private String tipoPelaje;

    public Gato(Animal animal, String modoAlimentacion, String metodoBanio,String tipoPelaje){
        super(animal);
        super.setMetodoBanio(metodoBanio);
        super.setModoAlimentacion(modoAlimentacion);
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String obtenerModoAlimentacion() {
        return "Whiskas, 3 veces al dia";
    }

    @Override
    public String obtenerMetodoBanio(int tipoPelaje) {
        switch (tipoPelaje){
            case 1:
                return "Bañar con agua, una vez cada 2 semanas";
            case 2:
                return "Bañar con agua, una vez cada semana";
            case 3:
                return "Bañar con agua, una vez cada semana + peinado";
            default:
                return "Bañar con trapos mojados, una vez por semana";
        }
    }
}
