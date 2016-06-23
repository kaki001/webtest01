package com.geh.servlet;

import javax.servlet.AsyncContext;
import java.io.IOException;
import java.io.PrintWriter;

public class AsyncRequestProcessor implements Runnable {

    private AsyncContext asyncContext;
    private String username;
    private String password;

    public AsyncRequestProcessor() {
    }

    public AsyncRequestProcessor(AsyncContext asyncCtx, String username, String password) {
        this.asyncContext = asyncCtx;
        this.username = username;
        this.password = password;
    }

    @Override
    public void run() {
        longProcessing(username, password);
        //complete the processing
        asyncContext.complete();
    }

    private void longProcessing(String username, String password) {
        // wait for given time before finishing
        System.out.println("username : " + username + "  password : " + password + " Time : " + System.currentTimeMillis());

    }
}