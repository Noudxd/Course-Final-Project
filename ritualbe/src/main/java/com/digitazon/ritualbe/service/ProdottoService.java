package com.digitazon.ritualbe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.ritualbe.model.Prodotto;
import com.digitazon.ritualbe.repository.ProdottoRepository;

@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public List<Prodotto> getAll() {
        return prodottoRepository.findAll();
    }

    public Prodotto createProdotto(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);
    }

    public Prodotto getProdottoById(Long id) {
        Optional<Prodotto> prodottoOpt = prodottoRepository.findById(id);
        if (prodottoOpt.isPresent()) {
            return prodottoOpt.get();
        } else {
            return null;
        }
    }

    public Prodotto updateProdotto(Prodotto newProdotto){

        Prodotto vecchioProdotto = getProdottoById(newProdotto.getId());

        if (vecchioProdotto != null) {
            vecchioProdotto.setCategoria(newProdotto.getCategoria());
            vecchioProdotto.setNomeProdotto(newProdotto.getNomeProdotto());
            vecchioProdotto.setPathImg(newProdotto.getPathImg());
            vecchioProdotto.setPrezzo(newProdotto.getPrezzo());

            return prodottoRepository.save(vecchioProdotto);
        } else {
            return null;
        }

    }

    public void deleteProdottoById(Long id){

        prodottoRepository.deleteById(id);
    }

}
