package id.bio.controller;

import id.bio.dao.JurusanDAO;
import id.bio.dao.JurusanDAOImpl;
import id.bio.model. Jurusan;
import java.util.List;

public class JurusanController {
    private JurusanDAO dao = new JurusanDAOImpl();
    
    public List<Jurusan> getAllData(){
        return dao.getAllJurusan() ;
    }
}