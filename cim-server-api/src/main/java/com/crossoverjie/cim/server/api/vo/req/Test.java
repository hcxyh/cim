package com.crossoverjie.cim.server.api.vo.req;

public class Test {


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    i++;
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    i++;
                }
            }
        }).start();
    }
}
