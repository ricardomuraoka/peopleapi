package one.dio.personapi.mapper;

import one.dio.personapi.dto.request.PersonDTO;
import one.dio.personapi.entity.Person;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO PersonDTO);
    PersonDTO toDTO(Person Person);

}
