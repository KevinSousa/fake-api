package com.kevin.fakeapi.business;

import com.kevin.fakeapi.apiv1.dto.ProductsDTO;
import com.kevin.fakeapi.infrastructure.FakeApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiClient cliente;

    public List<ProductsDTO> buscaProdutos() {
        return cliente.buscaListaProdutos();
    }
}