package net.tecgurus.agenda.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.agenda.mappers.ContactoMapper;
import net.tecgurus.agenda.model.Contacto;

@Component
public class ContactoDao {
	
	@Autowired
	private ContactoMapper contactoMapper;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public void insertarContacto(Contacto contacto) {
		contactoMapper.insertarContacto(contacto);
	}
	
	public List<Contacto> buscar(Integer idUsuario,String busqueda, Integer offset, Integer limit){
		
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		Map<String, Object> parametros = new HashMap<>();
		
		parametros.put("busqueda",busqueda);
		parametros.put("id", idUsuario);
		
		return sqlSession.selectList("busqueda",parametros,new RowBounds(offset,limit));
	}
	
	public Long buscarCount(String busqueda, Integer id){
		return contactoMapper.buscarCount(busqueda, id);
	}
	
}
