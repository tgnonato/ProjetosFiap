# Documentação da API 

## API de Cadastro de Endereço 

# Classe EnderecoController

A  classe EnderecoController será a responsável por lidar com as requisições relacionadas aos endereços na API. Ela fornece endpoints para listar endereços existentes e criar novos endereços.

## Endpoints

## Listar Endereços

Retorna a lista de todos os endereços cadastrados.

## URL: /api/enderecos

# Método: GET

Exemplo de Resposta

Status: 200 OK

[
  {
    **"rua":** "Rua das Flores",
    **"numero":** "12345",
    **"bairro":** "Centro",
    **"cidade":** "São Paulo",
    **"estado":** "SP"
  },
  {
    **"rua":** "Avenida dos Bandeirantes",
    **"numero":** "456",
    **"bairro":** "Vila Mariana",
    **"cidade":** "São Paulo",
    **"estado":** "SP"
  }
]

## Criar Endereço

Cria um novo endereço com base nos dados fornecidos.

## URL: /api/enderecos

## Método: POST

Parâmetros da Requisição

O corpo da requisição deve conter um objeto JSON com os seguintes campos:

**rua (string):** O nome da rua.

**numero (string):** O número do endereço.

**bairro (string):** O bairro do endereço.

**cidade (string):** A cidade do endereço.

**estado (string):** O estado do endereço.

Exemplo de Requisição

{
  **"rua":** "Rua das Flores",
  **"numero":** "123",
  **"bairro":** "Centro",
  **"cidade":** "São Paulo",
  **"estado":** "SP"
}
Exemplo de Resposta em Caso de Sucesso

Status: 200 OK

{
  **"message":** "Endereço criado com sucesso!"
}

Exemplo de Resposta em Caso de Erros de Validação

Status: 400 Bad Request

{
  **"message":** "Erros de validação encontrados:",
  **"errors":** [
    "O campo 'rua' é obrigatório.",
    "O campo 'numero' deve ser um número inteiro."
  ]
}
Exemplo de Resposta em Caso de Erro Interno do Servidor

Status: 500 Internal Server Error

{
  **"message":** "Ocorreu um erro ao processar a solicitação."
}

## Descrição dos Endpoints

## Listar Endereços

Este endpoint retorna a lista de todos os endereços cadastrados na API.

## Criar Endereço

Este endpoint permite criar um novo endereço. Os dados do endereço devem ser fornecidos no corpo da requisição. O endpoint realiza a validação dos dados e retorna uma mensagem indicando o sucesso ou falha na criação do endereço.

Caso a criação seja bem-sucedida, é retornada a mensagem "Endereço criado com sucesso!" com status 200 OK.

Caso ocorram erros de validação nos dados fornecidos, é retornada uma mensagem informando os erros encontrados, juntamente com status 400 Bad Request.

Em caso de erro interno do servidor durante o processamento da requisição, é retornada uma mensagem genérica de erro, com status 500 Internal Server Error.