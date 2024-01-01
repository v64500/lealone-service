/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side  License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.service.http;

import java.util.Map;

import com.lealone.common.util.Utils;

public interface HttpServer {

    String getWebRoot();

    void setWebRoot(String webRoot);

    String getJdbcUrl();

    void setJdbcUrl(String jdbcUrl);

    String getHost();

    void setHost(String host);

    int getPort();

    void setPort(int port);

    void init(Map<String, String> config);

    void start();

    void stop();

    public static HttpServer create() {
        return create(null);
    }

    public static HttpServer create(String type) {
        if (type == null || type.equalsIgnoreCase("vertx"))
            return Utils.newInstance("com.lealone.plugins.vertx.VertxServer");
        else
            return Utils.newInstance("com.lealone.plugins.tomcat.TomcatServer");
    }
}
