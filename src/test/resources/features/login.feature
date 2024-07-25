#language:pt
@Login
Funcionalidade: Realizar Login
  Testes de API de login

  @LoginSucesso @regressivo
  Cenario: Realizar login com sucesso
    Dado que eu tenha um payload valido de API de Login
    Quando envio uma requisicao do tipo POST de login
    Entao valido que recebo status 200 no response
    E armazeno o token que recebo do response do login

  @LoginInvalido
  Esquema do Cenario: Realizar Login com <cenario>
    Dado que eu tenha um payload de Login com as seguintes informacoes
      | email | <email> |
      | senha | <senha> |
    Quando envio uma requisicao do tipo POST de login
    Entao valido que recebo status 400 no response

    @LoginUsuarioInvalido @regressivo
    Exemplos:
      | cenario          | email              | senha    |
      | usuario invalido | invalido@email.com | 123456   |

    @LoginSenhaInvalida
    Exemplos:
      | cenario          | email              | senha    |
      | senha invalida   | aluno@email.com    | invalido |