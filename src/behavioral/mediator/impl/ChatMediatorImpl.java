package behavioral.mediator.impl;

import behavioral.mediator.model.ChatMediator;
import behavioral.mediator.model.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        this.users.stream().filter(userReceive -> user != userReceive).forEach(userReceive -> userReceive.receive(message));
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
