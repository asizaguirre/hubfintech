package br.com.hubfintech.jms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.hubfintech.domain.Conta;
import br.com.hubfintech.repositories.ContaRepository;

@Component
public class JmsConsumer {
	
	private ContaRepository contaRepository;

	
	@Autowired
	public void setContaRepository(ContaRepository contaRepository) {
		this.contaRepository = contaRepository;
	}


/**
 * 
 * @param obj
 * @throws IllegalAccessException
 * @throws IllegalArgumentException
 * @throws InvocationTargetException
 * 
 * O objetivo desta fila era pra salvar qualquer tipo de dado e reallacionar-los neste momento via reflection.
 * Mas, acabou a pilha.. 
 * Só falta instanciar um consumer de Object
 * 
 */
	@JmsListener(destination = "queue.conta")
	public void receive(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Call Matrix: " + obj);
		Method[] morfeu = obj.getClass().getMethods();
		Map<String, String> map = new HashMap<String, String>();	
		
			for (Method m : morfeu) {
				if(m.getName().contains("get")) {
						String v = (String) m.invoke(obj, m.getName());
						map.put(m.getName().substring(3), v);
				}
			}
//			
//			if(map.get("contaTipo").isEmpty() && map.get("filiaisCode").isEmpty()){
//				map.put("contaTipo", "matrix");
//				Conta c =  new Conta
//				contaRepository.save(new Conta(map));
//			}
//				
				
//				if(p.getClass().
//						
//						getIsActive() && p.getTransferIds().equals("") && p.getFiliaisCode().equals("")) {
//					p.setContaTipo("matrix");
//					contaRepository.save(p);
//				}else {
//					p.
//				}
				
				
				
		
		
	}
}
