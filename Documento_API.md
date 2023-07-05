# Documentação da API 

## API de Cadastro de Endereço

#### Descrição da API de Cadastro de Endereço

A API de Cadastro de Endereços permite realizar o cadastro e a listagem de endereços. Para criar um novo endereço, é necessário enviar informações referentes aos campos a seguir:

**rua:** o nome da rua (string).

**numero:** o número do endereço (string).

**bairro:** o bairro do endereço (string).

**cidade:** a cidade do endereço (string).

**estado:** o estado do endereço (string).

Após o cadastro, é possível obter a lista de todas as pessoas cadastradas.

#### Classe EnderecoController

A  classe EnderecoController será a responsável por lidar com as requisições relacionadas aos endereços na API. Ela fornece endpoints para listar endereços existentes e criar novos endereços.

## **Endpoints**

#### **Descrição dos Endpoints**

##### **Listar Endereços**

Este endpoint retorna a lista de todos os endereços cadastrados na API.

##### **Criar Endereço**

Este endpoint permite criar um novo endereço. Os dados do endereço devem ser fornecidos no corpo da requisição. O endpoint realiza a validação dos dados e retorna uma mensagem indicando o sucesso ou falha na criação do endereço.

Caso a criação seja bem-sucedida, é retornada a mensagem "Endereço criado com sucesso!" com status 200 OK.

Caso ocorram erros de validação nos dados fornecidos, é retornada uma mensagem informando os erros encontrados, juntamente com status 400 Bad Request.

Em caso de erro interno do servidor durante o processamento da requisição, é retornada uma mensagem genérica de erro, com status 500 Internal Server Error

##### **Exemplo Listar Endereços**

Retorna a lista de todos os endereços cadastrados.

##### **URL: /api/enderecos**

##### **Método: GET**

Exemplo de Resposta

Status: 200 OK
```json
[
  {
    "rua": "Rua das Flores",
    "numero": "12345",
    "bairro": "Centro",
    "cidade": "São Paulo",
    "estado": "SP"
  },
  {
    "rua": "Avenida dos Bandeirantes",
    "numero": "456",
    "bairro": "Vila Mariana",
    "cidade": "São Paulo",
    "estado": "SP"
  }
]
```

##### **Exemplo Criar Endereço**

Cria um novo endereço com base nos dados fornecidos.

##### **URL: /api/enderecos**

##### **Método: POST**

Parâmetros da Requisição

O corpo da requisição deve informar os seguintes campos:

**rua (string):** O nome da rua.

**numero (string):** O número do endereço.

**bairro (string):** O bairro do endereço.

**cidade (string):** A cidade do endereço.

**estado (string):** O estado do endereço.

Exemplo de Requisição

```json
{
  "rua": "Rua das Flores", 
  "numero": "123",
  "bairro": "Centro",
  "cidade": "São Paulo",
  "estado": "SP"
  
}
```

Exemplo de Resposta em Caso de Sucesso

Status: 200 OK

```json
{
  "message": "Endereço criado com sucesso!"
}
```

Exemplo de Resposta em Caso de Erros de Validação

Status: 400 Bad Request

```json
{
  "message": "Erros de validação encontrados:",
  "errors": [
    "O campo 'rua' é obrigatório.",
    "O campo 'numero' deve ser um número inteiro."
  ]
}
```

Exemplo de Resposta em Caso de Erro Interno do Servidor

Status: 500 Internal Server Error

```json
{
  "message": "Ocorreu um erro ao processar a solicitação."
}
```

## API de Gestão de Pessoas

#### Descrição da API de Gestão de Pessoas

A API de Gestão de Pessoas permite cadastrar e listar informações sobre pessoas. Para criar uma nova pessoa, é necessário enviar infromalçoes referente aos campos a seguir:

**nome:** o nome da pessoa (string).

**dataNascimento:** a data de nascimento da pessoa no formato "AAAA-MM-DD" (string).

**sexo:** o sexo da pessoa (string).

**parentesco:** o parentesco da pessoa em relação a outra pessoa (string).

**telefone:** o número de telefone da pessoa (string).

Após o cadastro, é possível obter a lista de todas as pessoas cadastradas.

#### Classe EnderecoController

A classe PessoaController é responsável por gerenciar as operações relacionadas à API de Gestão de Pessoas.

## **Endpoints**

#### **Descrição dos Endpoints**

##### **Criação de Pessoas**

##### Endpoint: POST /api/pessoas

Esse endpoint é utilizado para criar uma nova pessoa.

Exemplo de entrada (JSON):

```json
{
  "nome": "João Silva",
  "dataNascimento": "1990-05-15",
  "sexo": "Masculino",
  "parentesco": "Filho",
  "telefone": "(11) 1234-5678"
}
```
Exemplo de saída (JSON):

```json
"Pessoa criada com sucesso!"
```

##### Listagem de Pessoas

##### Endpoint: GET /api/pessoas

Esse endpoint é utilizado para obter a lista de pessoas cadastradas.

Exemplo de saída (JSON):

```json
[
  {
    "nome": "João Silva",
    "dataNascimento": "1990-05-15",
    "sexo": "Masculino",
    "parentesco": "Filho",
    "telefone": "(11) 1234-5678"
  },
  {
    "nome": "Maria Oliveira",
    "dataNascimento": "1985-10-20",
    "sexo": "Feminino",
    "parentesco": "Mãe",
    "telefone": "(11) 9876-5432"
  }
]
```

## API de Gestão de Eletrodomésticos

#### Descrição da API de Gestão de Eletrodomésticos

A API de Gestão de Eletrodomésticos permite cadastrar e listar os eletrodomésticos registrados no sistema. Para criar um novo eletrodoméstico, é necessário enviar informações referentes aos campos a seguir:

**nome:** o nome do eletrodoméstico (string).

**modelo:** o modelo do eletrodoméstico (string).

**potencia:** a potência do eletrodoméstico em watts (número inteiro).

**dataFabricacao:** a data de fabricação do eletrodoméstico no formato "yyyy-MM-dd" (string).

**fabricante:** o nome do fabricante do eletrodoméstico (string).

Após o cadastro, é possível obter a lista de todas as pessoas cadastradas.

#### Classe EletrodomesticoController

A  classe EletrodomesticoController será a responsável por lidar com as requisições relacionadas aos eletrodomesticos na API. Ela fornece endpoints para listar eletrodomesticos existentes e criar novos eletrodomesticos.

## **Endpoints**

#### **Descrição dos Endpoints**

##### **Listagem de Eletrodomésticos**

##### Endpoint: GET /api/eletrodomesticos

Esse endpoint é utilizado para obter a lista de eletrodomésticos cadastrados.

Exemplo de saída (JSON):

```json
[
  {
    "nome": "Geladeira",
    "modelo": "ABC123",
    "potencia": 1500,
    "dataFabricacao": "2022-01-01",
    "fabricante": "XYZ Company"
  },
  {
    "nome": "Máquina de Lavar",
    "modelo": "DEF456",
    "potencia": 1000,
    "dataFabricacao": "2021-06-15",
    "fabricante": "ABC Appliances"
  }
]
```
##### **Criação de Eletrodoméstico**

##### Endpoint: POST /api/eletrodomesticos

Esse endpoint é utilizado para criar um novo eletrodoméstico.

Exemplo de entrada (JSON):

```json
{
  "nome": "Geladeira",
  "modelo": "ABC123",
  "potencia": 1500,
  "dataFabricacao": "2022-01-01",
  "fabricante": "XYZ Company"
}
```
Exemplo de saída (JSON):

```json
"Eletrodoméstico criado com sucesso!"
```
