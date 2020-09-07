package behavioral.mediator.test;

import behavioral.mediator.impl.ChatMediatorImpl;
import behavioral.mediator.impl.UserImpl;
import behavioral.mediator.model.ChatMediator;
import behavioral.mediator.model.User;

public class TestMediator {
    public static void main(String[] args){
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "Jason");
        User user2 = new UserImpl(chatMediator, "Steve");
        User user3 = new UserImpl(chatMediator, "Bryan");
        User user4 = new UserImpl(chatMediator, "Brice");
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("TEST");

    }
}
