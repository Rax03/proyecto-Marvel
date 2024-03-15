package Model;
public class Superheroe extends Marvel {
    private String grupo;

    public Superheroe(String nombro, String sexo, String origen, String poder,
                      String equipo, String grupo) {
        super(nombro, sexo, origen, poder, equipo);
        this.grupo = grupo;
    }

    @Override
    public String getGrupo() {
        return grupo;
    }

    @Override
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    @Override
    public String toString() {
        return "Superheroe{" + super.toString() +
                "equipo='" + grupo + '\'' +
                '}';
    }
}
