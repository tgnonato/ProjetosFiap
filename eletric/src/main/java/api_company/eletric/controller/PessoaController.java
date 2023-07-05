package api_company.eletric.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import api_company.eletric.pessoas.Pessoa;
import api_company.eletric.pessoas.PessoaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    private List<Pessoa> pessoas = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> criarPessoa(@Validated  @RequestBody PessoaDTO pessoaDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder("Erros de validação encontrados:");
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                errorMessage.append(" - ").append(fieldError.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errorMessage.toString());
        }

        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(pessoaDTO.getNome());
            pessoa.setDataNascimento(pessoaDTO.getDataNascimento());
            pessoa.setSexo(pessoaDTO.getSexo());
            pessoa.setParentesco(pessoaDTO.getParentesco());
            pessoa.setTelefone(pessoaDTO.getTelefone());

            pessoas.add(pessoa);

            String mensagemSucesso = "Pessoa criada com sucesso!";
            return ResponseEntity.ok(mensagemSucesso);
        } catch (Exception e) {
            String mensagemErro = "Ocorreu um erro ao processar a solicitação.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
        }
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> listarPessoas() {
        if (pessoas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(pessoas);
    }
}
