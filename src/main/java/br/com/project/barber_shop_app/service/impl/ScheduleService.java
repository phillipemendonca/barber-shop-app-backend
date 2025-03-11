package br.com.project.barber_shop_app.service.impl;

import br.com.project.barber_shop_app.entity.ScheduleEntity;
import br.com.project.barber_shop_app.repository.IScheduleRepository;
import br.com.project.barber_shop_app.service.IScheduleService;
import br.com.project.barber_shop_app.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
