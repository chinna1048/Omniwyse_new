public class Patient extends User {
    private long patientId;
    private boolean insured;

    public long getPatientId() {
        return this.patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public boolean isInsured() {
        return this.insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }
}
