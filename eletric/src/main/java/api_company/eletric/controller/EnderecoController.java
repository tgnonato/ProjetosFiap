package api_company.eletric.controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import api_company.eletric.endereco.Endereco;
import api_company.eletric.endereco.EnderecoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    private List<Endereco> enderecos = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> listarEnderecos() {
        List<EnderecoDTO> enderecoDTOs = new ArrayList<>();

        for (Endereco endereco : enderecos) {
            EnderecoDTO enderecoDTO = new EnderecoDTO();
            enderecoDTO.setRua(endereco.getRua());
            enderecoDTO.setNumero(endereco.getNumero());
            enderecoDTO.setBairro(endereco.getBairro());
            enderecoDTO.setCidade(endereco.getCidade());
            enderecoDTO.setEstado(endereco.getEstado());

            enderecoDTOs.add(enderecoDTO);
        }

        if (enderecoDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(enderecoDTOs);
    }
    @PostMapping
    public ResponseEntity<?> criarEndereco(@Validated @RequestBody EnderecoDTO enderecoDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder("Erros de validação encontrados:");
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                errorMessage.append(" - ").append(fieldError.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errorMessage.toString());
        }

        try {
            Endereco endereco = new Endereco();
            endereco.setRua(enderecoDTO.getRua());
            endereco.setNumero(enderecoDTO.getNumero());
            endereco.setBairro(enderecoDTO.getBairro());
            endereco.setCidade(enderecoDTO.getCidade());
            endereco.setEstado(enderecoDTO.getEstado());

            // Adicione o endereço à lista de endereços
            enderecos.add(endereco);

            String mensagemSucesso = "Endereço criado com sucesso!";
            return ResponseEntity.ok(mensagemSucesso);
        } catch (Exception e) {
            String mensagemErro = "Ocorreu um erro ao processar a solicitação.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
        }
    }

    private Long generateId() {
        return System.currentTimeMillis();
    }
}