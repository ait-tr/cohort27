package de.aittr.g_27_mapstruct.services;

import de.aittr.g_27_mapstruct.domain.User;
import de.aittr.g_27_mapstruct.domain.UserDto;
import de.aittr.g_27_mapstruct.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;
    private UserMappingService mappingService;

    public UserService(UserRepository repository, UserMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    public List<UserDto> getAll() {
        return repository.findAll()
                .stream()
                .map(u -> mappingService.mapEntityToDto(u))
                .toList();
    }

    public UserDto getById(int id) {
        User entity = repository.findById(id).orElse(null);
        return entity == null ? null : mappingService.mapEntityToDto(entity);
    }

    public UserDto save(UserDto dto) {
        User entity = mappingService.mapDtoToEntity(dto);
        entity = repository.save(entity);
        return mappingService.mapEntityToDto(entity);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}