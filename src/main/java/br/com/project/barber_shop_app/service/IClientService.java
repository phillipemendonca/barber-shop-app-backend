package br.com.project.barber_shop_app.service;

import br.com.project.barber_shop_app.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
