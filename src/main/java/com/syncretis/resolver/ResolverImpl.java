package com.syncretis.resolver;

import com.syncretis.model.Material;
import com.syncretis.handler.Handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResolverImpl implements Resolver{

    private final Map<Class<? extends Material>, Handler<? extends Material>> handlerMap;

    public ResolverImpl(List<Handler<? extends Material>> handlers) {
        this.handlerMap = new HashMap<>();
        for(Handler<? extends Material> handler : handlers) {
            handlerMap.put(handler.getType(), handler);
        }
    }

    @Override
    public  Handler<? extends Material> getHandler(Class<? extends Material> type) {
        return handlerMap.get(type);
    }

}
