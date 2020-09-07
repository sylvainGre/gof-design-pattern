package behavioral.mediator.model;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
