public static void main(String[] args) {

    // Ceci n'est pas un test!! C'est un exemple d'utilisation.
    TriageType doctorTriageType = TriageType.FIFO;
    TriageType radiologyTriageType = TriageType.FIFO;

    Clinic clinic = new Clinic(doctorTriageType , radiologyTriageType);
    clinic.triagePatient("Samuel", 4, VisibleSymptom.FLU);
    clinic.triagePatient("John", 4, VisibleSymptom.MIGRAINE);

}
