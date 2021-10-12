package br.com.otavio.comunicacaoperdaapi.service.impl;

import br.com.otavio.comunicacaoperdaapi.data.ComunicacaoPerdaData;
import br.com.otavio.comunicacaoperdaapi.framework.CrudService;
import br.com.otavio.comunicacaoperdaapi.model.ComunicacaoPerda;
import br.com.otavio.comunicacaoperdaapi.service.ComunicacaoPerdaService;
import br.com.otavio.comunicacaoperdaapi.service.TipoLavouraService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.lucene.util.SloppyMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComunicacaoPerdaServiceImpl extends CrudService<ComunicacaoPerda, Long> implements ComunicacaoPerdaService {

    @Autowired
    private ComunicacaoPerdaData data;

    @Autowired
    TipoLavouraService tipoLavouraService;

    static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected JpaRepository<ComunicacaoPerda, Long> data() {
        return data;
    }

    @Override
    public List<ComunicacaoPerda> findAllByDeletado() {
        return data.findAllByDeletadoFalseOrderByIdDesc();
    }

    @Override
    public ComunicacaoPerda save(ComunicacaoPerda entity) {
        if (entity.getTipoLavoura().getId() == null) {
            entity.setTipoLavoura(tipoLavouraService.save(entity.getTipoLavoura()));
        }
        return super.save(entity);
    }

    @Override
    public List<ObjectNode> validarVeracidadeComunicacao(ComunicacaoPerda entity) {
        List<ObjectNode> objectNodeList = new ArrayList<>();
        List<ComunicacaoPerda> listaRegistros = data.
                findAllByDataColheitaEqualsAndEventoOcorridoIsNotLike(entity.getDataColheita(), entity.getEventoOcorrido().name());
        for (ComunicacaoPerda registro : listaRegistros) {
            double value = calculateDistanceInMeters(
                    Double.parseDouble(registro.getLatitude()),
                    Double.parseDouble(registro.getLongitude()),
                    Double.parseDouble(entity.getLatitude()),
                    Double.parseDouble(entity.getLongitude())
            );
            if (value > 10000) {
                ObjectNode node = objectMapper.createObjectNode();
                objectNodeList.add(
                        node.put("id", registro.getId())
                );
            }
        }

        return objectNodeList;
    }

    public double calculateDistanceInMeters(double lat1, double long1, double lat2,
                                            double long2) {
        double dist = SloppyMath.haversinMeters(lat1, long1, lat2, long2);
        return dist;
    }
}
