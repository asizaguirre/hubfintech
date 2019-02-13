# hubfintech
Spring DATA como protagonista



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- saved from url=(0087)file:///tmp/lu4938312622.tmp/lu493831262b.tmp/HubFintech_TesteDesenvolvimento%20(1).htm -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title></title>
	<meta name="generator" content="LibreOffice 6.0.7.3 (Linux)">
	<meta name="author" content="Willian Vieira">
	<meta name="created" content="2017-03-13T18:04:00">
	<meta name="changed" content="2017-10-05T11:15:17">
	<meta name="AppVersion" content="14.0000">
	<meta name="Company" content="HubFintech">
	<meta name="DocSecurity" content="0">
	<meta name="HyperlinksChanged" content="false">
	<meta name="LinksUpToDate" content="false">
	<meta name="ScaleCrop" content="false">
	<meta name="ShareDoc" content="false">
	<style type="text/css">
		@page { margin-left: 1.27cm; margin-right: 1.27cm; margin-top: 0.7cm; margin-bottom: 1.4cm }
		p { margin-bottom: 0.25cm; direction: ltr; color: #000000; line-height: 115%; text-align: left; orphans: 2; widows: 2 }
		p.western { font-family: "Calibri", serif; font-size: 11pt; so-language: pt-BR }
		p.cjk { font-family: "Calibri"; font-size: 11pt; so-language: en-US }
		p.ctl { font-family: ; font-size: 11pt; so-language: ar-SA }
		h2 { margin-bottom: 0cm; direction: ltr; color: #5b9bd5; line-height: 115%; text-align: left; page-break-inside: avoid; orphans: 2; widows: 2 }
		h2.western { font-family: "Calibri Light", serif; font-size: 13pt; so-language: pt-BR }
		h2.cjk { font-family: "ＭＳ ゴシック"; font-size: 13pt; so-language: en-US }
		h2.ctl { font-family: ; font-size: 13pt; so-language: ar-SA }
		a:link { so-language: zxx }
	</style>
</head>
<body lang="pt-BR" text="#000000" dir="ltr">
<div title="header">
	<p align="center" style="margin-bottom: 0cm; line-height: 100%"><font color="#1f3864"><font size="5" style="font-size: 18pt">Teste
	para desenvolvedor – Backend</font></font></p>
	<p style="margin-bottom: 0.47cm; line-height: 100%"><br>

	</p>
</div>
<h2 class="western"><a name="_GoBack"></a>Requisitos técnicos</h2>
<ul>
	<li>
<p style="margin-bottom: 0.28cm; line-height: 105%">O projeto
	deve ser desenvolvido em  Java;</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 105%">O banco de
	dados deve ser Banco de dados em Memoria (H2, HSQLDB);</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 105%">Desenvolvimento
	em camadas, com tratamento de erros eficiente;</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 100%">O Backend
	deve disponibilizar uma API Rest (get/post/delete/update);</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 100%">Deve ser
	possível efetuar todas as operações disponibilizadas pelo
	Backend; 
	</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 100%">Disponibilizar
	verbos para 
	</p>
</li></ul>
<h2 class="western">Entrega esperada</h2>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">A
solução completa (scripts de banco de dados e qualquer outro
artefato necessário para execução da solução) deve ser
disponibilizada em um repositório público do GitHub
(<font color="#0000ff"><span lang="uz-Cyrl-UZ"><u><a href="http://github.com/">http://github.com/</a></u></span></font>).
</p>
<h2 class="western">Avaliação</h2>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Serão
avaliados sua lógica de programação, estruturação do projeto,
qualidade de código e solução dada ao problema proposto. <i>Do the
best!</i></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><b>Atenção
as pesquisas feitas na web! </b>Por ser um teste a distância, você
terá liberdade de pesquisa, porém explicações sobre o código
poderão ser solicitadas por telefone ou pessoalmente.</p>
<h2 class="western">Necessidade a ser resolvida: Sistema para
controle de contas</h2>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Você
deve criar um CRUD para manutenção de Contas de saldo. Podemos ter
2 tipos de contas:</p>
<ul>
	<li>
<p style="margin-bottom: 0.28cm; line-height: 105%"><b>Conta
	Matriz – </b>É a conta principal, a qual pode ter (n) contas
	filhas e essas também podem possuir suas filhas, formando assim uma
	hierarquia. É a principal conta da estrutura.</p>
	</li><li>
<p style="margin-bottom: 0.28cm; line-height: 105%"><b>Contas
	Filiais – </b>É uma conta idêntica a Conta Matriz, porém possui
	obrigatoriamente uma conta Pai (pode ser a Conta Matriz ou outra
	Conta Filial) e pode ou não ter uma Conta Filial abaixo.</p>
</li></ul>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><b>Dados
para o Cadastro de Contas</b></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Nome</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Data
de Criação</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Obs:
Toda Conta deve possuir uma Pessoa e esta pode ser Jurídica ou
Física</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><br>
<br>

</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><b>Dados
para Pessoa Jurídica</b></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">CNPJ</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Razão
Social</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Nome
Fantasia</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><br>
<br>

</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><b>Dados
para Pessoa Física</b></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">CPF</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Nome
Completo</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Data
Nascimento</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><br>
<br>

</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><b>Funcionalidade
de Transferência</b></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Toda
Conta Filial pode efetuar transferências desde que a conta que
receberá a transferência esteja debaixo da mesma árvore e não
seja uma conta Matriz.</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">A
Conta Matriz não pode receber transferências de outras contas,
apenas Aportes que devem possuir um código alfanumérico único.</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Toda
transação pode ser estornada (no caso de um estorno de um Aporte é
necessário informar o código alfanumérico para que a transação
possa ser estornada).</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Apenas
as Contas Ativas podem receber Cargas ou Transferências</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%"><br>
<br>

</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">S<b>ituação
da Conta</b></p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Toda
Conta pode estar ativa, bloqueada ou cancelada;</p>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Todo
Histórico de transações deve ser armazenado e consultado.</p>
<h2 class="western">Glossário de termos</h2>
<p class="western" style="margin-bottom: 0.28cm; line-height: 105%">Aporte
- Entrada de valores diretamente na Conta Matriz, através de uma
transação qualquer.</p>
<p class="western" align="left" style="margin-bottom: 0.28cm; line-height: 105%; orphans: 2; widows: 2">
Transferência – Valores movimentados entre contas, onde uma é
debitada e a outra é creditada.</p>
<div title="footer">
	<p style="margin-bottom: 0cm; line-height: 100%"><img src="file:///tmp/lu4938312622.tmp/lu493831262b.tmp/HubFintech_TesteDesenvolvimento%20(1)_htm_dcc447fcce140046.png" name="Picture" align="left" hspace="12" width="82" height="50" border="0">
<br>

	</p>
</div>

</body></html>
