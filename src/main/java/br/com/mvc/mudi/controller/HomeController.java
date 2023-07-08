package br.com.mvc.mudi.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setValorNegociado(200,00);
		pedido.setDataDaEntrega(LocalDate.ofEpochDay(10/02/2020));
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/81UgYuadkpL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-64GB/dp/B07Y8YWTFL/ref=sr_1_6?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=Xiaomi+Redmi+Note+8&qid=1600346040&sr=8-6");
		pedido.setDescricao("uma descrição qualquer para esse pedido");

		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);

		return "home";
	}
}
