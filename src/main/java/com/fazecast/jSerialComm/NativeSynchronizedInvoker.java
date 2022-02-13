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

    public void intokeSync() {
        iAmSynchronized();
        iAmSynchronized2();
        iAmNotSynchronized();
    }

    public synchronized void iAmSynchronized() {
        System.out.println("hello");
    }

    public void iAmSynchronized2() {
        synchronized (this) {
            System.out.println("hello");
        }
    }

    public void iAmNotSynchronized() {
        System.out.println("hello");
    }
}
