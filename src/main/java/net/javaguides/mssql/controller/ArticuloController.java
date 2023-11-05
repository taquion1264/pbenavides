package net.javaguides.mssql.controller;

import net.javaguides.mssql.model.Articulo;
import net.javaguides.mssql.model.Employee;
import net.javaguides.mssql.repository.ArticuloRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articulo")
public class ArticuloController {

    private ArticuloRepository articuloRepository;

    ArticuloController(ArticuloRepository articuloRepository){
        this.articuloRepository=articuloRepository;}


    @GetMapping("/articles")
    public List<Articulo> getAllArticles() {
        return articuloRepository.findAll();
    }


}
