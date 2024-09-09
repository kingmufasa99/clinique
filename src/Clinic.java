import java.util.LinkedList;
import java.util.List;

public class Clinic {

    //private TriageType doctorTriageType;
    //private TriageType radiologyTriageType;

    private List<String> doctorQueue = new LinkedList<>();
    private List<String> radiologyQueue = new LinkedList<>();


    public Clinic(TriageType doctorTriageType ,TriageType radiologyTriageType) {
    //this.doctorTriageType = doctorTriageType;
    //this.radiologyTriageType = radiologyTriageType;
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {

        if (visibleSymptom.equals(VisibleSymptom.MIGRAINE)) {
            TriageType doctorTriageType = TriageType.FIFO;
            doctorQueue.addFirst(name);
            radiologyQueue.remove(name);
        }

        if (visibleSymptom == VisibleSymptom.FLU) {
            TriageType doctorTriageTypeMigraine = TriageType.FIFO;
            doctorQueue.add(name);
            radiologyQueue.remove(name);
        }

        if (visibleSymptom == VisibleSymptom.SPRAIN) {
            TriageType doctorTriageType = TriageType.FIFO;
            TriageType radiologyTriageType = TriageType.FIFO;
            doctorQueue.addFirst(name);
            radiologyQueue.addFirst(name);
        }
    }


    // Scénario: Celui où un patient se présente à la clinique avec une migraine
    //    Lorsqu'un patient se présente avec MIGRAINE (peu importe la gravité)
    //    Alors il est le premier dans la file d'attente du médecin
    //    Et il n'est pas dans la file d'attente de la radiologie
    //
    //Scénario: Celui où 2 patients se présentent à la clinique
    //    Étant donné qu'il y a un patient dans la file d'attente du médecin
    //    Lorsqu'un patient se présente avec FLU (peu importe la gravité)
    //    Alors il est le deuxième dans la file d'attente du médecin
    //    Et il n'est pas dans la file d'attente de la radiologie
    //
    //Scénario: Celui où un patient se présente à la clinique avec une entorse
    //    Lorsqu'un patient se présente avec SPRAIN (peu importe la gravité)
    //    Alors il est le premier dans la file d'attente du médecin
    //    Et il est la première dans la file d'attente de la radiologie

}