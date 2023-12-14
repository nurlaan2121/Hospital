public class Hospital {
    private Pasport pasport;
    private Status status;

    public Hospital(Pasport pasport, Status status) {
        this.pasport = pasport;
        this.status = status;
    }

    public Pasport getPasport() {
        return pasport;
    }

    public void setPasport(Pasport pasport) {
        this.pasport = pasport;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "pasport=" + pasport +
                ", status=" + status +
                '}';
    }
}
