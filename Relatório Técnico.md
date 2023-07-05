# Relatório Técnico - API de Gestão de Pessoas, Endereços e Eletrodomésticos
# Introdução:
Neste relatório técnico, descreveremos as tecnologias e ferramentas utilizadas no desenvolvimento das APIs de gestão de pessoas, endereços e eletrodomésticos. Também abordaremos os desafios encontrados durante o processo de desenvolvimento.

# 1. Tecnologias e Ferramentas Utilizadas:

**Java:** A linguagem de programação principal utilizada para o desenvolvimento das APIs.  

**Spring Boot:** Um framework de desenvolvimento rápido e fácil para criação de aplicações Java.

**Maven:** Uma ferramenta de automação de compilação e gerenciamento de dependências.

**IntelliJ IDEA:** Uma poderosa IDE para desenvolvimento Java.

**Spring MVC:** O framework utilizado para criação das APIs RESTful.

**Insomnia:** Uma ferramenta para testar e documentar as APIs RESTful.

**Git:** Um sistema de controle de versão utilizado para gerenciar o código-fonte das APIs.

# 2. Desafios Encontrados:

Durante o desenvolvimento das APIs de gestão de pessoas, endereços e eletrodomésticos, enfrentamos alguns desafios que exigiram soluções e abordagens específicas. Alguns dos principais desafios foram:
Validação de Dados: Garantir que os dados de entrada estejam corretos e de acordo com as regras de validação estabelecidas, como formato de data, tamanho máximo de campos, entre outros. Utilizamos as anotações de validação do Spring Boot para realizar essa validação de forma fácil e eficiente.
Mapeamento entre Classes: Realizar o mapeamento adequado dos dados recebidos nas requisições para as classes DTO (Data Transfer Object) e vice-versa, garantindo a integridade dos dados e a correta manipulação nas camadas do sistema. Utilizamos a biblioteca ModelMapper para simplificar o processo de mapeamento.
Tratamento de Erros: Implementar um tratamento adequado de erros e exceções, retornando mensagens de erro descritivas e adequadas ao usuário ou cliente da API. Utilizamos as classes ResponseEntity e o padrão de códigos de status HTTP para retornar respostas adequadas em caso de erros.
Testes de Integração: Realizar testes de integração para verificar o correto funcionamento das APIs, garantindo que os dados sejam armazenados corretamente no banco de dados e que as respostas das requisições estejam de acordo com as expectativas. Utilizamos a ferramenta Insomnia para realizar os testes e validar o funcionamento das APIs.

# 3. Conclusão:

As APIs de gestão de pessoas, endereços e eletrodomésticos foram desenvolvidas utilizando tecnologias modernas e ferramentas robustas. Ao longo do processo de desenvolvimento, enfrentamos desafios relacionados à validação de dados, mapeamento entre classes, tratamento de erros e testes de integração. Com o uso adequado das tecnologias e a superação dos desafios, conseguimos entregar APIs funcionais e eficientes para a gestão de pessoas, endereços e eletrodomésticos.
