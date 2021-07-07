package com.syncretis.handler;

import com.syncretis.model.Material;

public abstract class Handler<MATERIAL extends Material> {
    public abstract void handle();

    public abstract Class<MATERIAL> getType();
}
