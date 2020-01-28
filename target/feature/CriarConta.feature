# language: pt
Funcionalidade: Cadastrar Usuario

	Contexto: 
	  Dado o usuario estiver na home do site
    Quando clicar no menu de usuarios
    E clicar em register
 
   
	
	@CriarComSucesso
  Cenario: Cadastrar um usuario com sucesso
		E preencho o userName
    E preencho o email
    E preencho a senha
    E preencho confirmarSenha
    E preencho o primeiroNome
    E preencho o ultimoNome
    E preencho o telefone
    E preencho a cidade
    E preencho o pais
    E preencho o endereco
    E preencho o estadoEMais
    E preencho o cep
    E clico no botao de concorda
    E clico em register
    Entao confirmo se fui cadastrado com sucesso, tiro uma screenShot

   @CriarComFalha
    Cenario: Mostrar que usuario ja existe ao tentar cadastrar
    E preencho o userName
    E preencho o email
    E preencho a senha
    E preencho confirmarSenha
    E preencho o primeiroNome
    E preencho o ultimoNome
    E preencho o telefone
    E preencho a cidade
    E preencho o pais
    E preencho o endereco
    E preencho o estadoEMais
    E preencho o cep
    E clico no botao de concorda
    E clico em register
    Entao confirmo se nao foi cadastrado, tiro uma screenshot
