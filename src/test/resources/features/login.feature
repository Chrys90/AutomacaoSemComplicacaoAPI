#language:pt

Funcionalidade: Realizar Login
  Testes de API de login

  Cenario: Realizar login com sucesso
    Dado que eu tenha um payload valido de API de Login
    Quando envio uma requisicao do tipo POST de Login
    Entao valido que recebo status 200 no response
    E armazeno o token que recebo do response do login


  Cenario: Realizar Login com usuario invalido
    Dado que eu tenha um payload de Login com as seguintes informacoes
  |email|invalido@email.com|
  |senha|123456            |
    Quando envio uma requisicao do tipo POST de login
    Entao valido que recebo status 400 no response