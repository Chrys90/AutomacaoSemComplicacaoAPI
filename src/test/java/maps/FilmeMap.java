package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmeMap {

    private static Map<String, String> header;
    private static Map<String, Object> filme;
    private static Map<String, Object> categoria1;
    private static Map<String, Object> categoria2;
    private static Map<String, Object> plataforma;
    private static List<Map<String, Object>> listCategoria;
    private static List<Map<String, Object>> listPlataforma;

    public static Map<String, String> getHeader() {
        return header;
    }

    public static Map<String, Object> getFilme() {
        return filme;
    }

    public static Map<String, Object> getCategoria1() {
        return categoria1;
    }

    public static Map<String, Object> getCategoria2() {
        return categoria2;
    }

    public static Map<String, Object> getPlataforma() {
        return plataforma;
    }

    public static List<Map<String, Object>> getListCategoria() {
        return listCategoria;
    }

    public static List<Map<String, Object>> getListPlataforma() {
        return listPlataforma;
    }

    public static void initCategoria(){
        listCategoria = new ArrayList<>();
        categoria1 = new HashMap<>();
        categoria2 = new HashMap<>();

        categoria1.put("Tipo", "Ação");
        categoria2.put("Tipo", "Comédia");
        listCategoria.add(categoria1);
        listCategoria.add(categoria2);

    }

    public static void initHeader(){
        header = new HashMap<>();
        header.put("Authorization","Bearer "+LoginMap.token);

    }

    public static void initPlataforma(){
        listPlataforma = new ArrayList<>();
        plataforma = new HashMap<>();
        plataforma.put("nome", "NetFlix");
        listPlataforma.add(plataforma);

    }

    public static void initFilme(){
        filme = new HashMap<>();
        filme.put("nome", "Alerta vermelho");
        filme.put("descricao", "Um alerta vermelho da Interpol é emtido e o agente do FBI John Harley " +
                  "assume o caso. Durante sua busca, ele se vê diante de um assalto ousado e é forçado a se " +
                  "aliar ao maior ladrão de arte da história, Nolan Booth, para capturar a ladra de arte mais " +
                  "procurada do mundo atualmente, Sarah Black.");
        filme.put("duracao", 1.32);
        filme.put("categorias", listCategoria);
        filme.put("plataforma", listPlataforma);
    }

    public static void initAll(){
        initHeader();
        initCategoria();
        initPlataforma();
        initFilme();
    }

}
