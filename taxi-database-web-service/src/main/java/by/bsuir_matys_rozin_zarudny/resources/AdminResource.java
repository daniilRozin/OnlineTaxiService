package by.bsuir_matys_rozin_zarudny.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import by.bsuir_matys_rozin_zarudny.persistence.AdminDao;
import by.bsuir_matys_rozin_zarudny.representations.Admin;

/*Just an example*/
@Path("/admins")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
@Transactional
public class AdminResource {
    private final AdminDao adminDao;

    @Inject
    public AdminResource(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
    
    @GET
    public List<Admin> getAll(){
        return this.adminDao.findAll();
    }

    @GET
    @Path("{id}")
    public Admin getAdmin(@PathParam("id")long id) {
        Admin admin = adminDao.findOne(id);
        if (admin == null) {
            throw new WebApplicationException((Response.Status.NOT_FOUND));
        }
        return admin;
    }
}