package de.aittr.g_27_mapstruct.services;

import de.aittr.g_27_mapstruct.domain.User;
import de.aittr.g_27_mapstruct.domain.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMappingService {

    // Проблемы:
    // 1. Несоответствие названий полей в энтити и ДТО
    // 2. Не шифруются пароли
    // 3. Пароли передаются клиенту
    // 4. Клиент имеет возможность перезаписать данные в БД

    UserDto mapEntityToDto(User entity);

    User mapDtoToEntity(UserDto dto);
}