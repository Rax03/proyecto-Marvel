package Model;

public class Antiheroe extends Marvel {
    private boolean bueno;

    public Antiheroe(String nombro, String sexo, String origen, String poder,
                     String equipo, boolean buenoMalo) {
        super(nombro, sexo, origen, poder, equipo);
        this.bueno = buenoMalo;
    }

    public boolean isBueno() {
        return bueno;
    }

    public void setBueno(boolean bueno) {
        this.bueno = bueno;
    }


    @Override
    public String toString() {
        return "------------------------\n"+
                "Antiheroe{"+super.toString() +
                "bueno=" + bueno +'\'' +
                "} \n ";
    }
}

