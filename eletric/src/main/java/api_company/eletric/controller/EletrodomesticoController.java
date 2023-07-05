package api_company.eletric.controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import api_company.eletric.eletrodomesticos.Eletrodomestico;
import api_company.eletric.eletrodomesticos.EletrodomesticoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/eletrodomesticos")
public class EletrodomesticoController {
    private List<Eletrodomestico> eletrodomesticos = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> criarEletrodomestico(@Validated @RequestBody EletrodomesticoDTO eletrodomesticoDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder("Erro(s) de validação encontrados:");
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                errorMessage.append(" - ").append(fieldError.getDefaultMessage());
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage.toString());
        }

        try {
            Eletrodomestico eletrodomestico = new Eletrodomestico();
            eletrodomestico.setNome(eletrodomesticoDTO.getNome());
            eletrodomestico.setModelo(eletrodomesticoDTO.getModelo());
            eletrodomestico.setPotencia(eletrodomesticoDTO.getPotencia());
            // Converter a string da data de fabricação para LocalDate
            eletrodomestico.setDataFabricacao(LocalDate.parse(eletrodomesticoDTO.getDataFabricacao()));
            eletrodomestico.setFabricante(eletrodomesticoDTO.getFabricante());

            eletrodomesticos.add(eletrodomestico);

            String mensagemSucesso = "Eletrodoméstico criado com sucesso!";
            return ResponseEntity.ok(mensagemSucesso);
        } catch (Exception e) {
            String mensagemErro = "Ocorreu um erro ao processar a solicitação.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
        }
    }

    @GetMapping
    public ResponseEntity<List<Eletrodomestico>> listarEletrodomesticos() {
        if (eletrodomesticos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(eletrodomesticos);
    }
}
