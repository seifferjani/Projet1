/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * author Mohamed Selim Maazouz
 */

@Path("Mypath")
public class GenericResource {
@GET
@Produces("text/plain")
public String getText() {
return "Mon premier service REST";
}


    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     * @param uriInfo
     * @return 
     */
    @GET
@Path("param")
public String getResource(@Context UriInfo uriInfo) {
return "The client used this URI to reach this resource method: "
+ uriInfo.getAbsolutePath().toASCIIString();
}

    /**
     * Retrieves representation of an instance of erp.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
