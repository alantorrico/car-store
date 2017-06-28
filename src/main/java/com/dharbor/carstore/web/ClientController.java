package com.dharbor.carstore.web;

import com.dharbor.carstore.domain.Client;
import com.dharbor.carstore.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.POST)
    public Client addClient(@RequestBody ClientRequestDTO client){
        return clientService.addClient(client);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Client updateClient(@PathVariable String id, @RequestBody ClientRequestDTO clientOld){
        return clientService.updateClient(id, clientOld);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Client deleteClient(@PathVariable String id){
        return clientService.deleteClient(id);
    }

    public static class ClientRequestDTO{
        private String name;
        private int ci;
        private String profession;
        private long phone;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCi() {
            return ci;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }
    }
}
