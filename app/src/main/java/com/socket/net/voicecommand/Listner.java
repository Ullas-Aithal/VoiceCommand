package com.socket.net.voicecommand;

import android.support.v7.widget.LinearLayoutCompat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by goodbytes on 6/20/2016.
 */
public class Listner implements Runnable {

    private Socket  mSocket;
    BufferedReader in;

    public Listner (Socket socket)
    {
        mSocket = socket;
    }

    public void listen()
    {

        try {
            while(MainActivity.flag == 1) {
                System.out.println("Printing......");
                in = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));

                System.out.println(in.readLine());
            }
            System.out.println("Stopping......");
        }
        catch(IOException ie)
        {

        }
    }
    @Override
    public void run()
    {
        listen();
    }
}


    //Created by ullas on 6/21/2016.

