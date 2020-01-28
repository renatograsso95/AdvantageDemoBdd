#language: pt
Funcionalidade: Pesquisar na Lupa

	Contexto:
		Dado que estou na home do site
		Quando eu clicar no icone da lupa
		
	@PesquisarNaLupaComSucesso
	Cenario: Pesquisar um produto através da Lupa e clicar no produto

		E escrever o nome de um produto
		E fechar a lupa
		E clicar em um produto
		E confirmar se estou na pagina do produto
		Entao tiro a ScreenShot
		
		@PesquisarNaLupaFalha
		Cenario: Pesquisar um produto inexistente através da lupa
		E escrever o nome de um produto inexistente
		E confirmo se nao tem nenhum produto na tela
		Entao tiro uma ScreenShot