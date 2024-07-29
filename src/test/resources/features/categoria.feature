#language:pt

@categoria
Funcionalidade: Consulta Categoria

  @categoriaSucesso
  Cenario: Realizar Consulta Categoria com Sucesso
    Dado que tenha realizado o login com dados validos
    E que tenha um payload da API de Categoria
    Quando realizado uma requisicao do tipo GET de categoria
    Entao valido que recebo status 200 no response
    E valido que no campo "tipo[2]" possui o valor "Terror"

  Cenario: Realizar Consulta Categoria sem o Token
    Quando realizado uma requisicao do tipo GET de categoria
    Entao valido que recebo status 403 no response
    E valido que no campo "message" possui o valor "Access Denied"

    Cenario: Realizar Consulta Categoria com token invalido
      E que tenha um header com o campo "authorization" com valor "invalido"
      Quando realizado uma requisicao do tipo GET de categoria
      Entao valido que recebo status 403 no response
      E valido que no campo "message" possui o valor "Access Denied"