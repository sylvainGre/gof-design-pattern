package structural.adapter.adapter;

import structural.adapter.model.Socket;
import structural.adapter.model.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter{

    private Socket socket = new Socket();
    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt( socket.getVolt() , 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt( socket.getVolt() , 40);
    }

    private Volt convertVolt(Volt volt, int divider){
        return new Volt(volt.getVolts() / divider);
    }
}
