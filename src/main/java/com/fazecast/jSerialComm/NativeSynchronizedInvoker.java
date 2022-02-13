package com.fazecast.jSerialComm;

public class NativeSynchronizedInvoker {
    public static void testSynchronized() {
        System.out.println(SerialPort.getCommPorts());


        synchronized (NativeSynchronizedInvoker.class) {
            System.out.println("hahaha");
        }
    }

    public static void testUnSynchronized() {
        System.out.println(SerialPort.getUnSynchronizedCommPorts());
    }

    public static void testCommPortsNotNative() {
        System.out.println(SerialPort.getCommPortsNotNative());
    }


    public static void testNotNativeUnSynchronizedCommPorts() {
        System.out.println(SerialPort.getNotNativeUnSynchronizedCommPorts());
    }
}
