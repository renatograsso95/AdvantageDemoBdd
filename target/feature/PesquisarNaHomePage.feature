#language: pt
Funcionalidade: Pesquisa atraves da pagina inicial

Contexto:
		Dado que estou na pagina inicial do site
		Quando eu clicar em tablet

@PesquisaTabletComSucesso
	Cenario: clicar em tablets na pagina inciial, depois clicar em um dos tablets da lista
		E selecionar um dos tablets da lista
		E confirmar que foi selecionado
		Entao confirmo com uma ScreenShot
		
@PesquisaTabletComFalha
	Cenario: clicar em tablets escolher especificacoes que nao tem em nenhum tablet
		E escolher uma opcao de tamanho de tela
		E escolher uma opcao de processador
		E confirmar se retorna algum tablet
		Entao tirar uma screenshot