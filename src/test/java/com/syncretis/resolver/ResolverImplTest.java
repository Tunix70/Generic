package com.syncretis.resolver;

import com.syncretis.handler.GlassHandler;
import com.syncretis.handler.Handler;
import com.syncretis.handler.PaperHandler;
import com.syncretis.handler.PlasticHandler;
import com.syncretis.model.Glass;
import com.syncretis.model.Material;
import com.syncretis.model.Paper;
import com.syncretis.model.Plastic;
import com.syncretis.productContainer.RecyclableMaterialContainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ResolverImplTest {

    RecyclableMaterialContainer<Glass> glassMat = new RecyclableMaterialContainer<>(400, Glass.class);
    RecyclableMaterialContainer<Plastic> plasticMat = new RecyclableMaterialContainer<>(500, Plastic.class);
    RecyclableMaterialContainer<Paper> paperMat = new RecyclableMaterialContainer<>(900, Paper.class);

    GlassHandler glassHandler = new GlassHandler(glassMat);
    PaperHandler paperHandler = new PaperHandler(paperMat);
    PlasticHandler plasticHandler = new PlasticHandler(plasticMat);


    List<Handler<? extends Material>> handlers = new ArrayList<>();
    {
        handlers.add(glassHandler);
        handlers.add(paperHandler);
        handlers.add(plasticHandler);
    }
    ResolverImpl resolver = new ResolverImpl(handlers);


    @Test
    @DisplayName("Return type of Handler")
    void returnHandlerTypeTest() {
        //given

        //when
        Handler hendler = resolver.getHandler(Glass.class);

        //then
        assertThat(hendler.getType()).isEqualTo(Glass.class);
    }
}