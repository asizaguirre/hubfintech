package br.com.hubfintech.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubfintech.domain.Conta;
import br.com.hubfintech.services.ContaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Model;

@Controller
@RestController
@RequestMapping("/conta")
@Api(value = "conta")
public class ContaController {
	
	private ContaService contaService;

	@Autowired
	public void setContaService(ContaService contaService) {
		this.contaService = contaService;
	}

	/**
	 * 
	 * @param conta
	 * @param response
	 * @return trecho que trata o cadastro de contas ou atualizar se o objeto CONTA
	 *         já for conhecido pelo Spring
	 */
	@ResponseBody
	@ApiOperation(value = "Adiciona conta ")
	@RequestMapping(value = "/create/conta", method = RequestMethod.POST, produces = "application/json")
	public Conta addConta(@RequestBody Conta conta, HttpServletResponse response) {

		return contaService.saveOrUpdate(conta);
	}

	/**
	 * 
	 * @param id
	 * @param model
	 * @return faz a busca por ID
	 */
	@ApiOperation(value = "Procura conta por ID", response = Conta.class)
	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET, produces = "application/json")
	public Conta showConta(@PathVariable Integer id, Model model) {
		Conta conta = contaService.getById(id);
		return conta;
	}

	@ApiOperation(value = "Remove conta por ID", response = Conta.class)
	@RequestMapping(value = "/kill/{id}", method = RequestMethod.GET, produces = "application/json")
	public void removeConta(@PathVariable Integer id, Model model) {
		contaService.delete(id);

	}

	@ApiOperation(value = "Lista todas as contas Cadastradas, retorna agurpado pela matriz", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Conta> list(Model model) {
		Iterable<Conta> storeList = contaService.listAll();
		return storeList;
	}

}
