package com.syncretis;

import com.syncretis.model.Glass;
import com.syncretis.model.Material;
import com.syncretis.model.Paper;
import com.syncretis.model.Plastic;
import com.syncretis.handler.GlassHandler;
import com.syncretis.handler.Handler;
import com.syncretis.handler.PaperHandler;
import com.syncretis.handler.PlasticHandler;
import com.syncretis.productContainer.RecyclableMaterialContainer;
import com.syncretis.resolver.ResolverImpl;
import com.syncretis.resolver.Resolver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RecyclableMaterialContainer<Glass> glassMat = new RecyclableMaterialContainer<>(400, Glass.class);
        RecyclableMaterialContainer<Plastic> plasticMat = new RecyclableMaterialContainer<>(500, Plastic.class);
        RecyclableMaterialContainer<Paper> paperMat = new RecyclableMaterialContainer<>(900, Paper.class);

        GlassHandler glassHandler = new GlassHandler(glassMat);
        PaperHandler paperHandler = new PaperHandler(paperMat);
        PlasticHandler plasticHandler = new PlasticHandler(plasticMat);


        List<Handler<? extends Material>> handlers = new ArrayList<>();
        handlers.add(glassHandler);
        handlers.add(paperHandler);
        handlers.add(plasticHandler);

        Resolver resolver = new ResolverImpl(handlers);
        Handler glassHendler = resolver.getHandler(Paper.class);

        glassHendler.handle();

    }
}
