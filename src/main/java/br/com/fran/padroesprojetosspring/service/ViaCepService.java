package br.com.fran.padroesprojetosspring.service;

import br.com.fran.padroesprojetosspring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
