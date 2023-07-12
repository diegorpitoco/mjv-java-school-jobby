package com.schooljava.mjvschooljobby.webService;

import com.schooljava.mjvschooljobby.service.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CadastroController {

    final CadastroService cadastroService;

}
