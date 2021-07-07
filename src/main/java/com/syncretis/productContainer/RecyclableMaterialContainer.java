package com.syncretis.productContainer;

import com.syncretis.model.Material;


public class RecyclableMaterialContainer<MATERIAL extends Material> extends Container {
    Class<MATERIAL> type;

    public RecyclableMaterialContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType() {
        return type;
    }

    @Override
    public String toString() {
        return "RecyclableMaterialContainer{" +
                "type=" + type +
                '}';
    }
}

