package io.vaku;

public class Application {
    public static void main(String[] args) {
        new HttpServer(8189).start();
    }
}
