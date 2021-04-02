package com.demo.es.impl;

import com.demo.api.Checker;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

public class Es5CheckerImpl implements Checker {

    @Override
    public void check() {

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getLoopbackAddress(), 9300));

        client.close();

        System.out.println("es5 checker");
    }

    public static void main(String[] args) {
        new Es5CheckerImpl().check();
    }

}
