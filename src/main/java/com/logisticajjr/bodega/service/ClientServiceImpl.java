package com.logisticajjr.bodega.service;

import com.logisticajjr.bodega.model.Client;
import com.logisticajjr.bodega.repo.IClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {
    private final IClientRepo repo;


    @Override
    public Client save(Client client) throws Exception {
        return repo.save(client);
    }

    @Override
    public Client update(Client client, Integer id) throws Exception {
        return repo.save(client);
    }

    @Override
    public List<Client> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Client findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Client());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
