package com.desafio.rebeldes.services.rebelde;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.desafio.rebeldes.api.dtos.RebeldeDTO;
import com.desafio.rebeldes.api.response.Response;
import com.desafio.rebeldes.domain.models.Item;
import com.desafio.rebeldes.domain.models.RebeldeEntity;
import com.desafio.rebeldes.domain.models.RebeldeItem;
import com.desafio.rebeldes.domain.repositories.ItemRepository;
import com.desafio.rebeldes.domain.repositories.RebeldeItemRepository;
import com.desafio.rebeldes.domain.repositories.RebeldeRepository;

@Service
public class RebeldeServiceImpl implements RebeldeService {

	private final RebeldeRepository repository;
	private final RebeldeItemRepository rebeldeItemRepository;
	private final ItemRepository itemRepository;
	public RebeldeServiceImpl(RebeldeRepository repository, RebeldeItemRepository rebeldeItemRepository, ItemRepository itemRepository) {
		this.repository = repository;
		this.rebeldeItemRepository = rebeldeItemRepository;
		this.itemRepository = itemRepository;
	}

	@Override
	@Transactional
	public 	Response<RebeldeEntity> criar(RebeldeDTO dto) {
		RebeldeEntity rebelde = new RebeldeEntity();
		rebelde.setNome(dto.getNome());
		rebelde.setGalaxia(dto.getGalaxia());
		rebelde.setGenero(dto.getGenero());
		rebelde.setIdade(dto.getIdade());
		rebelde.setLatitude(dto.getLatitude());
		rebelde.setLongitude(dto.getLongitude());
		RebeldeEntity rebeldeResultado = repository.save(rebelde);

		List<RebeldeItem> listaRebeldeItensComQuatidade = new ArrayList<>();
		dto.getItens().forEach(rebeldeItemDto -> {
			RebeldeItem rebeldeItem = new RebeldeItem();
			rebeldeItem.setItens(new Item(rebeldeItemDto.getIdItem()));
			rebeldeItem.setQuantidade(rebeldeItemDto.getQuantidade());
			rebeldeItem.setRebeldes(rebeldeResultado);
			listaRebeldeItensComQuatidade.add(rebeldeItem);

		});

		rebeldeItemRepository.saveAll(listaRebeldeItensComQuatidade);
	
		Response<RebeldeEntity> response = new Response<>();
		response.setData(rebeldeResultado);
		return response;
	}

}
