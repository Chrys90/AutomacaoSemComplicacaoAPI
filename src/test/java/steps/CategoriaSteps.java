package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import maps.LoginMap;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class CategoriaSteps {

    Map<String, String> header = new HashMap<>();

    @Dado("que tenha um payload da API de Categoria")
    public void queTenhaUmPayloadDaAPIDeCategoria() {
        header.put("Authorization", "Bearer "+ LoginMap.token);
    }
    @Quando("realizado uma requisicao do tipo GET de categoria")
    public void realizadoUmaRequisicaoDoTipoGETDeCategoria() {
        RestUtils.get(header, "categorias");
    }


    @E("que tenha um header com o campo {string} com valor {string}")
    public void queTenhaUmHeaderComOCampoComValor(String key, String value) {
        header.put(key, value);


    }
}