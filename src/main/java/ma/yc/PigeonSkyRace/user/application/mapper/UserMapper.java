package ma.yc.PigeonSkyRace.user.application.mapper;

import ma.yc.PigeonSkyRace.user.application.dto.request.RegisterRequest;
import ma.yc.PigeonSkyRace.user.domain.model.aggregate.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lofts", ignore = true)
    @Mapping(target = "createdDate", expression = "java(java.time.LocalDateTime.now())")
    User toEntity( RegisterRequest registerRequest );


    RegisterRequest toDto( User user);
}