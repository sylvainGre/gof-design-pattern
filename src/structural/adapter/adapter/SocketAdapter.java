package structural.adapter.adapter;

import structural.adapter.model.Volt;

public interface SocketAdapter {
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();

}
