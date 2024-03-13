package org.eclipse.lyo.oslc4j.trs.server.service;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.trs.server.InmemPagedTrs;
import org.eclipse.lyo.oslc4j.trs.server.PagedTrs;
import org.eclipse.lyo.oslc4j.trs.server.TRSTestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.UriBuilder;

@Path("/trs")
public class TRSServiceResource extends TrackedResourceSetService {
    private final static Logger log = LoggerFactory.getLogger(TRSServiceResource.class);

    public TRSServiceResource() {
        log.info("Starting up");
    }

    @Override
    protected PagedTrs getPagedTrs() {
        log.trace("Change History objects requested");
        final InmemPagedTrs inmemPagedTrs = new InmemPagedTrs(5, 5,
                UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("trs").build(), ImmutableList.of(TRSTestUtil.dummyUri(),TRSTestUtil.dummyUri(),TRSTestUtil.dummyUri(),TRSTestUtil.dummyUri(),TRSTestUtil.dummyUri()));
//        inmemPagedTrs.onHistoryData(TRSTestUtil.createHistory());
        return inmemPagedTrs;
    }

}
