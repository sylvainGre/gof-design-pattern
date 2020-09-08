package behavioral.observer.model;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
