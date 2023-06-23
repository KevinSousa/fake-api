package com.kevin.fakeapi.controller;

import com.kevin.fakeapi.apiv1.dto.ProductsDTO;
import com.kevin.fakeapi.business.FakeApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@Tag(name = "fake-api")
public class FakeApiController {
    private final FakeApiService service;

    @Operation(summary = "Busca todos os produtos", method = "GET")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Busca Realizada com Sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    @GetMapping("")
    public ResponseEntity<List<ProductsDTO>> buscaProdutos() {
        return ResponseEntity.ok(service.buscaProdutos());
    }
}
