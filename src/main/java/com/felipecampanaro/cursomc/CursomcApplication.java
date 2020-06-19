package com.felipecampanaro.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipecampanaro.cursomc.domain.Categoria;
import com.felipecampanaro.cursomc.domain.Cidade;
import com.felipecampanaro.cursomc.domain.Cliente;
import com.felipecampanaro.cursomc.domain.Endereco;
import com.felipecampanaro.cursomc.domain.Estado;
import com.felipecampanaro.cursomc.domain.ItemPedido;
import com.felipecampanaro.cursomc.domain.Pagamento;
import com.felipecampanaro.cursomc.domain.PagamentoComBoleto;
import com.felipecampanaro.cursomc.domain.PagamentoComCartao;
import com.felipecampanaro.cursomc.domain.Pedido;
import com.felipecampanaro.cursomc.domain.Produto;
import com.felipecampanaro.cursomc.domain.enums.EstadoPagamento;
import com.felipecampanaro.cursomc.domain.enums.TipoCliente;
import com.felipecampanaro.cursomc.repositories.CategoriaRepository;
import com.felipecampanaro.cursomc.repositories.CidadeRepository;
import com.felipecampanaro.cursomc.repositories.ClienteRepository;
import com.felipecampanaro.cursomc.repositories.EnderecoRepository;
import com.felipecampanaro.cursomc.repositories.EstadoRepository;
import com.felipecampanaro.cursomc.repositories.ItemPedidoRepository;
import com.felipecampanaro.cursomc.repositories.PagamentoRepository;
import com.felipecampanaro.cursomc.repositories.PedidoRepository;
import com.felipecampanaro.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
