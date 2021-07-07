package com.syncretis.handler;

import com.syncretis.model.Material;
import com.syncretis.productContainer.RecyclableMaterialContainer;

public class PaperHandler extends Handler{
    RecyclableMaterialContainer<? extends Material> container;

    public PaperHandler(RecyclableMaterialContainer<? extends Material> container) {
        this.container = container;
    }

    @Override
    public void handle() {
        System.out.println(container.getMass());
    }

    @Override
    public Class getType() {
        return container.getType();
    }
}
