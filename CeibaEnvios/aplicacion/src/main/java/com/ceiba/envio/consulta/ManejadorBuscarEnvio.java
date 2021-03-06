package com.ceiba.envio.consulta;

import com.ceiba.envio.modelo.dto.DtoEnvio;
import com.ceiba.envio.puerto.dao.DaoEnvio;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ManejadorBuscarEnvio {

    private final DaoEnvio daoEnvio;

    public ManejadorBuscarEnvio(DaoEnvio daoEnvio) {
        this.daoEnvio = daoEnvio;
    }

    public List<DtoEnvio> ejecutar(long id){ return daoEnvio.listarById(id);}
}
