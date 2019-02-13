package br.com.hubfintech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hubfintech.domain.Conta;
import br.com.hubfintech.repositories.ContaRepository;
import br.com.hubfintech.repositories.PessoaRepository;

@Service
public class ContaServiceImpl implements ContaService {
	private ContaRepository contaRepository;

	@Autowired
	public void setPessoaRepository(PessoaRepository pessoaRepository) {
	}

	/**
	 * @param contaRepository
	 * @param pessoaRepository
	 */
	public ContaServiceImpl(ContaRepository contaRepository, PessoaRepository pessoaRepository) {
		this.contaRepository = contaRepository;
	}

	/**
	 * 
	 */
	public ContaServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public void transferirOuAportar(ContaRepository contaRepository) {
		this.contaRepository = contaRepository;
	}

	@Autowired
	public void setContaRepository(ContaRepository contaRepository) {
		this.contaRepository = contaRepository;
	}

	@Override
	public Iterable<Conta> listAll() {
		return contaRepository.findAll();
	}

	@Override
	public Conta getById(Integer id) {
		return contaRepository.findById(id).orElse(null);
	}

	@Override
	public Conta saveOrUpdate(Conta domainObject) {
		Conta conta = contaRepository.findById(domainObject.getId()).orElse(domainObject);

		/**
		 * SIGNIFICA que a conta ainda não é cadastrada Se não estiver explicito que a
		 * conta deve ser vinculada a uma matriz, seto ela por ser uma nova como conta
		 * matriz
		 * 
		 * CONSIDEREI QUE TOAS AS CONTAS QUE POSSUIREM UMA MATRISID JÁ FOI CRIADO EM
		 * ALGUM MOMENTO, E SE ESSA NÃO FOR IGUAL A SUA PRÓPRIA ID DO DOMAIN CONTA,
		 * SIGNIFICA QUE SE TRADA DE UMA FILIAL
		 * 
		 * Por isso, se o que chega neste metodo possui uma pessoa vinculada e não
		 * possui uma matrisID seto o valor da ID CONTA no MatrisID para criar uma nova
		 * MATRIX (NEO)
		 * 
		 * Caso contrario, se o objeto que chega no metodo possuir uma matrisID, somente
		 * se altera ou se inclui como filho de alguem.
		 * 
		 * Para uma filial poder ter uma outra filial, da mesma forma que a matris, a
		 * filial possui uma idFilial que é igual a sua ID de
		 * 
		 * CONTA. Se a IDFILIAL for diferente, significa que essa FILIAL é filho de
		 * outra filial.
		 * 
		 * 
		 * 
		 */

		if (conta.getPessoa() != null && conta.getPessoa().equals("") && domainObject.getMatrisId() < 0) {
			domainObject.getPessoa().setMatrisId(domainObject.getId());
			return contaRepository.save(domainObject);
		}else {
			/**
			 * TODO
			 * 
			 * SE NA LISTA DE FILIAIS EXISTE UMA ID DA FILIAL NA LISTA DE ID DE FILIAIS SIGINIFICA QUE ESTA 
			 * FILIAL TEM FILHOS. PARA PODER SER UMA FILIAL COM FILHOS ELA DEVE POSSUIR UMA ID MATRIZ DIFERENTE 
			 * DA SUA SE NÃO SIMPLISMENTE INCLUOP A NOVA FILIAL COMO  FILHO DE ALGUEM OU DIRETAMENTE FILHO DA MATRIZ
			 * 
			 * A VERIFICAÇÃO ANTERIO GARANTE QUE É UMA FILIAL
			 * 
			 */
			
			if(contaRepository.existsById(domainObject.getId()) ) {
				return contaRepository.save(domainObject);
			} else
				
				/**
				 * não cairá nunca neste retorno
				 * 
				 */
				
				return null;
			
		}

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		contaRepository.deleteById(id);

	}

}
