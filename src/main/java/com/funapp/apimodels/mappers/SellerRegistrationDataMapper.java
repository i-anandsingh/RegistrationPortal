package com.funapp.apimodels.mappers;

import com.funapp.apimodels.request.SellerRegistrationRequestDTO;
import com.funapp.apimodels.response.SellerRegistrationResponseDTO;
import com.funapp.entity.SellerRegistrationEntity;
import com.funapp.service.models.request.SellerRegistrationInputDTO;
import com.funapp.service.models.response.SellerRegistrationOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedSourcePolicy = ReportingPolicy.WARN, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface SellerRegistrationDataMapper {
    SellerRegistrationDataMapper INSTANCE = Mappers.getMapper(SellerRegistrationDataMapper.class);
    SellerRegistrationInputDTO mapRequestToInput(SellerRegistrationRequestDTO requestDTO);
    @Mapping(target = "sellerId", ignore = true)
    SellerRegistrationEntity mapInputToEntity(SellerRegistrationInputDTO inputDTO);
    SellerRegistrationOutputDTO mapEntityToOutput(SellerRegistrationEntity entity);
    SellerRegistrationResponseDTO mapOutputToResponse(SellerRegistrationOutputDTO outputDTO);
}