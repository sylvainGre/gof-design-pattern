package structural.adapter.test;

import structural.adapter.adapter.SocketAdapter;
import structural.adapter.adapter.SocketClassAdapterImpl;
import structural.adapter.adapter.SocketObjectAdapterImpl;
import structural.adapter.model.Volt;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter {
    public static void main(String[] args){
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testClassAdapter() {
        System.out.println("Test class adapter");
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        List<Volt> volts = new ArrayList<>();

        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        volts.add(v3);
        volts.add(v12);
        volts.add(v120);

        volts.forEach(System.out::println);
    }

    private static void testObjectAdapter() {
        System.out.println("Test object adapter");
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        List<Volt> volts = new ArrayList<>();

        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        volts.add(v3);
        volts.add(v12);
        volts.add(v120);

        volts.forEach(System.out::println);
    }
}
