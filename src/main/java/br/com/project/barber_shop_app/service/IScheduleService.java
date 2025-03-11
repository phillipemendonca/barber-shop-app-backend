package br.com.project.barber_shop_app.service;

import br.com.project.barber_shop_app.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
