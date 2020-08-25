package structural.adapter.adapter;

import structural.adapter.model.Socket;
import structural.adapter.model.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt( getVolt() , 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt( getVolt() , 40);
    }

    private Volt convertVolt(Volt volt, int divider){
        return new Volt(volt.getVolts() / divider);
    }
}
