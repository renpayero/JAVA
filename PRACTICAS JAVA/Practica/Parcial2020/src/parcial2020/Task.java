package parcial2020;

public interface Task {
    public double getDuracion();
    public String getName();
    public User getOwner();
    public boolean isProcessed();
    public void processed();
}
