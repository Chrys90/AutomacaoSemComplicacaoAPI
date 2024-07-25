package steps;

import groovy.util.logging.Log;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.LoginMap;
import utils.RestUtils;

import java.util.Map;

public class LoginSteps {
    String url = "http://localhost:8080/";

    @Dado("que eu tenha um payload valido de API de Login")
    public void queEuTenhaUmPayloadValidoDeAPIDeLogin() {
        LoginMap.initLogin();
        RestUtils.setBaseURI(url);
    }

    @Entao("armazeno o token que recebo do response do login")
    public void armazenoOTokenQueReceboDoResponseDoLogin() {
        LoginMap.token = RestUtils.getResponse().jsonPath().get("token");
    }

    @Dado("que eu tenha um payload de Login com as seguintes informacoes")
    public void queEuTenhaUmPayloadDeLoginComAsSeguintesInformacoes(Map<String, Object> map) {
        LoginMap.initLogin();
        RestUtils.setBaseURI(url);
        LoginMap.getLogin().putAll(map);

    }
    @Quando("envio uma requisicao do tipo POST de login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
       RestUtils.post(LoginMap.getLogin(), ContentType.JSON,"auth");
    }



}
