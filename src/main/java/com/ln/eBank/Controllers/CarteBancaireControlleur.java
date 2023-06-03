package com.ln.eBank.Controllers;

import com.ln.eBank.dto.CarteBancaireDto;
import com.ln.eBank.services.CarteBancaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients/")
@RequiredArgsConstructor
public class CarteBancaireControlleur {

    private final CarteBancaireService carteBancaireService;

    @PostMapping("/{idClient}/cartebancaire")
    public CarteBancaireDto creerCarteBancaire(@PathVariable(value = "idClient") Long idClient,
                                 @RequestBody CarteBancaireDto cb) {
        return carteBancaireService.creerCarteBancaire(idClient,cb);
    }
}
