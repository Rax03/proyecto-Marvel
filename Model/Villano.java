package Model;

public class Villano extends Marvel {
    private String planMaestro;

    public Villano(String nombro, String sexo, String origen,
                   String poder, String equipo, String planMaestro) {
        super(nombro, sexo, origen, poder, equipo);
        this.planMaestro = planMaestro;
    }

    public String getPlanMaestro() {
        return planMaestro;
    }

    public void setPlanMaestro(String planMaestro) {
        this.planMaestro = planMaestro;
    }

    @Override
    public String toString() {
        return "Villano{" + super.toString() +
                "planMaestro='" + planMaestro + '\'' +
                '}';
    }
}

