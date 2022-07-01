package org.example;

public class Main {
    public static void main(String[] args) {

        SmartPhone mobile = new SmartPhone("3MP");
        System.out.println("El smarphone tiene una cámara de "+mobile.camera);

        SmartWatch watch = new SmartWatch("cuero");
        System.out.println("El smartwatch tiene una correa de "+watch.watchband);

    }
}

class SmartDevice {
    String processor;
    int widthSize;
    int heigthSize;
}

class SmartPhone extends SmartDevice {
    String camera;

    SmartPhone() {
        super();
    }

    SmartPhone(String camera) {
        super();
        this.camera = camera;
    }
}

class SmartWatch extends SmartDevice {
    static String watchband;

    SmartWatch() {
        super();
    }

    SmartWatch(String watchband) {
        super();
        this.watchband = watchband;
    }
}