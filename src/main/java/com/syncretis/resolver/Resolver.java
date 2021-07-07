package com.syncretis.resolver;

import com.syncretis.model.Material;
import com.syncretis.handler.Handler;

public interface Resolver {
    Handler<? extends Material> getHandler(Class<? extends Material> type);
}
