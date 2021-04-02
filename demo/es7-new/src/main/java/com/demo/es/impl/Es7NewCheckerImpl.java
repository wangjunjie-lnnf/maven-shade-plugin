package com.demo.es.impl;

import com.demo.api.Checker;
import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class Es7NewCheckerImpl implements Checker {

    @Override
    public void check() {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));

        GetRequest getRequest = new GetRequest("posts", "1");

        try {
            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
            getResponse.getFields();
        } catch (IOException e) {

        } finally {
            try {
                client.close();
            } catch (IOException e) {
            }
        }

        System.out.println("es7-new checker");
    }

    public static void main(String[] args) {
        new Es7NewCheckerImpl().check();
    }
}
